package com.ival.controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ival.dao.*;
import com.ival.model.*;

/**
 * Servlet implementation class Core
 */
@WebServlet(asyncSupported = true, urlPatterns = { "/Core" })
public class Core extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private static IvalDAO ivalDAO;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action = request.getParameter("action");
		switch (action) {
		case "testconection":
			try {
				test(request,response);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			break;
		//CRUD producto
		case "addProducto":
			break;
		case "deleteProducto":
			break;
		case "updateProducto":
			break;
		case "getProducto":
			break;
		//CRUD carrito
		case "addCarrito":
			break;
		case "deleteCarrito":
			break;
		case "udateCarrito":
			break;
		case "getCarrito":
			break;
//		//CRUD Contiene
//		case "addContiene":
//			break;
//		case "deleteContiene":
//			break;
//		case "updateContiene":
//			break;
//		case "getContiene":
//			break;
		};
		
	}
	private void test(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, ServletException, IOException {
		request.setAttribute("servletResponse", "hello from servlet");
		RequestDispatcher dispatcher = request.getRequestDispatcher("/vista/test.jsp");
		dispatcher.forward(request, response);
	}
	private void index(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, ServletException, IOException {
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("index.jsp");
		dispatcher.forward(request, response);
	}
	
	private void menu(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, ServletException, IOException {
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("vista/menu.jsp");
		dispatcher.forward(request, response);
	}

	
	//Hibernate Stuff
//	public Core() {
//		ivalDAO = new IvalDAO();
//	}
//	//Producto
//	private void persistProducto(Producto entity) {
//		ivalDAO.openCurrentSessionwithTransaction();
//		ivalDAO.persist(entity);
//		ivalDAO.closeCurrentSessionwithTransaction();
//	}
//	private void updateProducto(Producto entity) {
//		ivalDAO.openCurrentSessionwithTransaction();
//		ivalDAO.update(entity);
//		ivalDAO.closeCurrentSessionwithTransaction();
//	}
//	private Producto findProductoById(String id) {
//		ivalDAO.openCurrentSession();
//		Producto entity = ivalDAO.findProductoById(id);
//		ivalDAO.closeCurrentSession();
//		return entity;
//	}
//	private void deleteProducto(String id) {
//		ivalDAO.openCurrentSessionwithTransaction();
//		Producto entity = ivalDAO.findProductoById(id);
//		ivalDAO.delete(entity);
//		ivalDAO.closeCurrentSessionwithTransaction();
//	}
//	private List<Producto> findAllProductos() {
//		ivalDAO.openCurrentSession();
//		List<Producto> entities = ivalDAO.findAllProductos();
//		ivalDAO.closeCurrentSession();
//		return entities;
//	}
//	
//	//Carrito
//	private void persistCarrito(Carrito entity) {
//		ivalDAO.openCurrentSessionwithTransaction();
//		ivalDAO.persist(entity);
//		ivalDAO.closeCurrentSessionwithTransaction();
//	}
//	private void updateCarrito(Carrito entity) {
//		ivalDAO.openCurrentSessionwithTransaction();
//		ivalDAO.update(entity);
//		ivalDAO.closeCurrentSessionwithTransaction();
//	}
//	private Carrito findCarritoById(String id) {
//		ivalDAO.openCurrentSession();
//		Carrito entity = ivalDAO.findCarritoById(id);
//		ivalDAO.closeCurrentSession();
//		return entity;
//	}
//	private void deleteCarrito(String id) {
//		ivalDAO.openCurrentSessionwithTransaction();
//		Carrito entity = ivalDAO.findCarritoById(id);
//		ivalDAO.delete(entity);
//		ivalDAO.closeCurrentSessionwithTransaction();
//	}
//	private List<Carrito> findAllCarritos() {
//		ivalDAO.openCurrentSession();
//		List<Carrito> entities = ivalDAO.findAllCarritos();
//		ivalDAO.closeCurrentSession();
//		return entities;
//	}
	
//	//Contiene
//	private void persistContiene(Contiene entity) {
//		ivalDAO.openCurrentSessionwithTransaction();
//		ivalDAO.persist(entity);
//		ivalDAO.closeCurrentSessionwithTransaction();
//	}
//	private void updateContiene(Contiene entity) {
//		ivalDAO.openCurrentSessionwithTransaction();
//		ivalDAO.update(entity);
//		ivalDAO.closeCurrentSessionwithTransaction();
//	}
//	private Carrito findContieneById(String id) {
//		ivalDAO.openCurrentSession();
//		Contiene entity = ivalDAO.findContieneById(id);
//		ivalDAO.closeCurrentSession();
//		return entity;
//	}
//	private void deleteContiene(String id) {
//		ivalDAO.openCurrentSessionwithTransaction();
//		Contiene entity = ivalDAO.findContieneById(id);
//		ivalDAO.delete(entity);
//		ivalDAO.closeCurrentSessionwithTransaction();
//	}
//	private List<Contiene> findAllContiene() {
//		ivalDAO.openCurrentSession();
//		List<Contiene> entities = ivalDAO.findAllContiene();
//		ivalDAO.closeCurrentSession();
//		return entities;
//	}	
	
	
}
