package com.testing.controller;

import java.io.IOException;
import java.sql.SQLException;

//import java.io.IOException;
//import java.security.NoSuchAlgorithmException;
//import java.security.spec.InvalidKeySpecException;
//import java.sql.SQLException;
//import java.util.Enumeration;
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

@WebServlet("/SubCore")
public class SubCore extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static IvalDAO ivalDAO;
	public SubCore() {
	super();
		ivalDAO = new IvalDAO();
	}	


	static List<Producto> findAll() {
		System.out.println("Dentro");
		ivalDAO.openCurrentSession();
		System.out.println("esto va?");
		List<Producto> productos = ivalDAO.findAllProductos();
		System.out.println("va");
		ivalDAO.closeCurrentSession();
		return productos;
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

