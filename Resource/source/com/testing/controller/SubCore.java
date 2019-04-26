package com.testing.controller;

import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import java.util.List;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;


import com.testing.dao.IvalDAO;
import com.testing.model.Producto;
import com.testing.model.SecureLogin;
import com.testing.security.Passwords;


@WebServlet("/SubCore")
public class SubCore extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static IvalDAO ivalDAO =  new IvalDAO();
	 static List<Producto> findAll() {
		ivalDAO.openCurrentSession();
		List<Producto> productos = ivalDAO.findAllProductos();
		ivalDAO.closeCurrentSession();
		return productos;
	}
	 
	 /**
	  * Check if the current login is correct
	  * @param user - username
	  * @param pass - password
	  * @return true or false if login should proceed
	  * @throws NoSuchAlgorithmException
	  * @throws InvalidKeySpecException
	  */
	static boolean doLog(String user, String pass) throws NoSuchAlgorithmException, InvalidKeySpecException {
		boolean response = false;
		ivalDAO.openCurrentSession();
		SecureLogin almacenado = ivalDAO.login(user);
		if(almacenado !=null) {
			String salt = almacenado.getCondimento();
			String checkpass = Passwords.generateStorngPasswordHash(pass, salt);
			if(checkpass == almacenado.getPassword()) {
				response = true;
			}
			else {
				response = false;
			}
		}
		else {
			response = false;
		}
		ivalDAO.closeCurrentSession();
		return response;
	}
	
	static void doSign(String user, String pass,String salt) throws NoSuchAlgorithmException, InvalidKeySpecException {
		ivalDAO.openCurrentSession();
		SecureLogin entity = new SecureLogin(user, pass, salt);
		ivalDAO.signin(entity);
		ivalDAO.closeCurrentSession();
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

