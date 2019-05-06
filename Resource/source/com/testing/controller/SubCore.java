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

import com.testing.dao.IvalDAO;
import com.testing.model.Producto;
import com.testing.model.SecureLogin;
import com.testing.security.Passwords;


@WebServlet("/SubCore")
public class SubCore extends HttpServlet {
	private static final long serialVersionUID = 1L;
	static IvalDAO ivalDAO =  new IvalDAO();
	 static List<Producto> findAll() {
		IvalDAO ivalDAO =  new IvalDAO();

		ivalDAO.openCurrentSession();
		List<Producto> productos = ivalDAO.findAllProductos();
		ivalDAO.closeCurrentSession();
		return productos;
	}
	   static void ajaxCon(HttpServletRequest request, HttpServletResponse response){
			System.out.println("entra ajaxCon");
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
				} catch (SQLException | NoSuchAlgorithmException | InvalidKeySpecException | ServletException | IOException e) {
					e.printStackTrace();
				}
	 }


		
		private static void listar(HttpServletRequest request, HttpServletResponse response)
				throws SQLException, ServletException, IOException {
			
			RequestDispatcher dispatcher1 = request.getRequestDispatcher("/index2.jsp"); // ??? 
			List<Producto> listarProductos = SubCore.findAll();
			request.setAttribute("lista", listarProductos);
			System.out.println("ok, enviando lista:\n"+listarProductos.toString());
			dispatcher1.forward(request, response);
		}
		
		@SuppressWarnings("unused")
		private static void login(HttpServletRequest request, HttpServletResponse response)
				throws SQLException, ServletException, IOException, NoSuchAlgorithmException, InvalidKeySpecException {
			
			//--> Create login object 
			String username = request.getParameter("username");
			String pass = request.getParameter("password");
			SecureLogin log = new SecureLogin(username,pass);
			
			//--> Check if login can be done
			boolean canLog = false;
			ivalDAO.openCurrentSession();
				SecureLogin almacenado = ivalDAO.login(username);
				
				System.out.println(almacenado.toString());
				if(almacenado !=null) {
					System.out.println("Almacenado no es null");
					//-- > gets salt
					String salt = almacenado.getCondimento();
					//--> Generates strong password
					String checkpass = Passwords.generateStorngPasswordHash(pass, salt);
					System.out.println("Stored: "+almacenado.getPassword()+"  ");
					System.out.println("Latest: "+checkpass);
					if(checkpass == almacenado.getPassword()) {
						canLog = true;
					}
					else {
						canLog = false;
					}
				}
				else {
					canLog = false;
				}
			System.out.println(canLog);
			ivalDAO.closeCurrentSession();
			
			if(canLog) {
				System.out.println("go index");

				RequestDispatcher dispatcher = request.getRequestDispatcher("/index.jsp"); // ??? 
				request.setAttribute("username", username);
				dispatcher.forward(request, response);
			}
			else {
				System.out.println("go back");
				RequestDispatcher dispatcher =  request.getRequestDispatcher("/vista/login.jsp");;
				request.setAttribute("msg", "Error in login");
				dispatcher.forward(request, response);
			}
		}
		
		private static void signin(HttpServletRequest request, HttpServletResponse response)
				throws SQLException, ServletException, IOException, NoSuchAlgorithmException, InvalidKeySpecException {
			System.out.println("dentro signin");
			
			//---> Inicializa los valores
			String username = request.getParameter("username");
			String pass = request.getParameter("password");
			String salt = Passwords.getSalt().toString();
			String password = Passwords.generateStorngPasswordHash(pass, salt);
			
			//--> Perpara el dispatcher
			RequestDispatcher dispatcher = request.getRequestDispatcher("/vista/login.jsp");
			//--> Hibernate
			
			ivalDAO.openCurrentSession();
			System.out.println("dentro sesion");
			SecureLogin sign = new SecureLogin(username,password,salt);
			System.out.println(sign.toString());
			ivalDAO.signin(sign);
			System.out.println("Tras insertar");
			ivalDAO.closeCurrentSession();
			//--> Devuelve conexion
			System.out.println("fin sesion");
			request.setAttribute("popup", 1); // If user created successfullys
			request.setAttribute("username", username);
			dispatcher.forward(request, response);			
		}
		
	 private static void test(HttpServletRequest request, HttpServletResponse response)
				throws SQLException, ServletException, IOException {
			//request.setAttribute("servletResponse", "hello from servlet");
			RequestDispatcher dispatcher = request.getRequestDispatcher("/vista/test.jsp");
			dispatcher.forward(request, response);
		}
}

