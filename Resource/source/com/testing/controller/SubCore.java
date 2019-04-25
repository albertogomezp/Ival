package com.testing.controller;

import java.util.List;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.testing.dao.IvalDAO;
import com.testing.model.Producto;


@WebServlet("/SubCore")
public class SubCore extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static IvalDAO ivalDAO;
	public SubCore(HttpServletRequest request, HttpServletResponse response) {
		super();
		ivalDAO = new IvalDAO();
	}	


	static List<Producto> findAll() {
		ivalDAO = new IvalDAO();
		ivalDAO.openCurrentSession();
		List<Producto> productos = ivalDAO.findAllProductos();
		ivalDAO.closeCurrentSession();
		return productos;
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

