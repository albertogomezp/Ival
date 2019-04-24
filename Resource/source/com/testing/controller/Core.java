package com.testing.controller;

import java.io.IOException;
import java.sql.SQLException;

import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import java.sql.SQLException;
import java.util.Enumeration;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.testing.dao.IvalDAO;
import com.testing.model.Producto;

//import org.json.JSONArray;
//import org.json.JSONObject;

@WebServlet("/Core")
public class Core extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static IvalDAO ivalDAO;
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
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
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
		RequestDispatcher dispatcher1 = request.getRequestDispatcher("index2.jsp"); // ??? 
		List<Producto> listarProductos = findAll();
		request.setAttribute("lista", listarProductos);
		System.out.print("ok");
		dispatcher1.forward(request, response);
	}
	
	
	
	
	
	
	
	// --> hibernate
	public Core() {
		ivalDAO = new IvalDAO();
	}


	private List<Producto> findAll() {
		ivalDAO.openCurrentSession();
		List<Producto> competidores = ivalDAO.findAllProductos();
		ivalDAO.closeCurrentSession();
		return competidores;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

