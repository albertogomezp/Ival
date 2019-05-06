package com.testing.controller;

import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

 
import com.testing.model.*;
import com.testing.security.Passwords;



@WebServlet("/Core")
public class Core extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doPost");
		doGet(request, response);
		
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		String action = request.getParameter("action");
		System.out.println(action);
		try {
				switch(action) {
				case "test":
				test(request,response);
				break;
				case "listar":
				listar(request,response);
				break;
				case "login":
				login(request,response);
				break;
				case "signup":
				signin(request,response);
				break;
				}
			} catch (SQLException | NoSuchAlgorithmException | InvalidKeySpecException e) {
				e.printStackTrace();
			}
	}


	private void test(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, ServletException, IOException {
		//request.setAttribute("servletResponse", "hello from servlet");
		System.out.print("ok");
		RequestDispatcher dispatcher = request.getRequestDispatcher("/vista/test.jsp");
		dispatcher.forward(request, response);
	}
	
	private void listar(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, ServletException, IOException {
		System.out.println("ok");
		
		RequestDispatcher dispatcher1 = request.getRequestDispatcher("/index2.jsp"); // ??? 
		System.out.println("--");
		List<Producto> listarProductos = SubCore.findAll();
		request.setAttribute("lista", listarProductos);
		request.setAttribute("bunny", "salu2");
		System.out.println("ok, enviando lista:\n"+listarProductos.toString());
		dispatcher1.forward(request, response);
	}
	
	@SuppressWarnings({ "unused", "null" })
	private void login(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, ServletException, IOException, NoSuchAlgorithmException, InvalidKeySpecException {
		
		// Create login object 
		String username = request.getParameter("username");
		String pass = request.getParameter("password");
		SecureLogin log = new SecureLogin(username,pass);
		
		//Check if login can be done
		boolean loguea = SubCore.doLog(username,pass);
		if(loguea) {
			RequestDispatcher dispatcher = request.getRequestDispatcher("/index.jsp"); // ??? 
			request.setAttribute("username", username);
			dispatcher.forward(request, response);
		}
		else {
			RequestDispatcher dispatcher =  request.getRequestDispatcher("/vista/login.jsp");;
			request.setAttribute("msg", "Error in login");
			dispatcher.forward(request, response);
		}
	}
	
	@SuppressWarnings("unused")
	private void signin(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, ServletException, IOException, NoSuchAlgorithmException, InvalidKeySpecException {
		String username = request.getParameter("username");
		String pass = request.getParameter("password");
		System.out.println(username+" "+pass);
		String salt = Passwords.getSalt().toString();
		String password = Passwords.generateStorngPasswordHash(pass, salt);
		SecureLogin sign = new SecureLogin(username,password,salt);
		RequestDispatcher dispatcher = request.getRequestDispatcher("/vista/login.jsp"); // ??? 

		System.out.println(sign.toString());
		SubCore.doSign(sign);
		request.setAttribute("popup", 1); // If user created successfullys
		request.setAttribute("username", username);
		dispatcher.forward(request, response);
		
		
	}
	
}

