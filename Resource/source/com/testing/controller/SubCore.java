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
	
	 static List<Producto> findAll() {
		IvalDAO ivalDAO =  new IvalDAO();

		ivalDAO.openCurrentSession();
		List<Producto> productos = ivalDAO.findAllProductos();
		ivalDAO.closeCurrentSession();
		return productos;
	}
	 

	static boolean doLog(String user, String pass) throws NoSuchAlgorithmException, InvalidKeySpecException {
		IvalDAO ivalDAO =  new IvalDAO();

		boolean response = false;
		ivalDAO.openCurrentSession();
		SecureLogin almacenado = ivalDAO.login(user);
		if(almacenado !=null) {
			//Obtiene la salt almacenada 
			String salt = almacenado.getCondimento();
			//Genera contraseña segura
			String checkpass = Passwords.generateStorngPasswordHash(pass, salt);
			//Si coincide con la almacenada, es el usuario
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
	
	static void doSign(SecureLogin entity) throws NoSuchAlgorithmException, InvalidKeySpecException {
		IvalDAO ivalDAO =  new IvalDAO();
		ivalDAO.openCurrentSession();
		System.out.println("dentro sesion");
		ivalDAO.signin(entity);
		System.out.println("en sesion");
		ivalDAO.closeCurrentSession();
		System.out.println("fin sesion");

	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

