package com.ival.dao;

import com.ival.model.*;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
/*
 * @author: Alberto Gomez
 * @author: Ivan Perez
 */

public class ivalDAO {
	
	private Session currentSession;
	private Transaction currentTransaction;

	public ivalDAO() {
	}

	public Session openCurrentSession() {
		currentSession = getSessionFactory().openSession();
		return currentSession;
	}

	public Session openCurrentSessionwithTransaction() {
		currentSession = getSessionFactory().openSession();
		currentTransaction = currentSession.beginTransaction();
		return currentSession;
	}

	public void closeCurrentSession() {
		currentSession.close();
	}

	public void closeCurrentSessionwithTransaction() {
		currentTransaction.commit();
		currentSession.close();
	}

	private static SessionFactory getSessionFactory() {
		Configuration configuration = new Configuration()
			 .configure()
			 .addPackage("com.ival.model")
			 .addAnnotatedClass(Carrito.class)
//			 .addAnnotatedClass(Contiene.class)
			 .addAnnotatedClass(Producto.class);
		StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder()
				.applySettings(configuration.getProperties());
		SessionFactory sessionFactory = configuration.buildSessionFactory(builder.build());
 		return sessionFactory;
	}

	public Session getCurrentSession() {
		return currentSession;
	}

	public void setCurrentSession(Session currentSession) {
		this.currentSession = currentSession;
	}

	public Transaction getCurrentTransaction() {
		return currentTransaction;
	}

	public void setCurrentTransaction(Transaction currentTransaction) {
		this.currentTransaction = currentTransaction;
	} 
	//--> Producto functions:
	public void persist(Producto entity) {
		getCurrentSession().save(entity);
	}
	public void update(Producto entity) {
		getCurrentSession().update(entity);
	}
	public Producto findProductoById(String id) {
		Producto entity = (Producto) getCurrentSession().get(Producto.class,(Integer.parseInt(id)));
		return entity;
	}
	
	public void delete(Producto entity) {
		getCurrentSession().delete(entity);
	}
	
	public List<Producto> findAllProductos() {
		 List<Producto> entity = (List<Producto>) getCurrentSession().createQuery("from Producto").list() ;
		return entity;
	}
	//--> Carrito functions:
	public void persist(Carrito entity) {
		getCurrentSession().save(entity);
	}
	public void update(Carrito entity) {
		getCurrentSession().update(entity);
	}
	public Carrito findCarritoById(String id) {
		Carrito entity = (Carrito) getCurrentSession().get(Carrito.class,(Integer.parseInt(id)));
		return entity;
	}
	
	public void delete(Carrito entity) {
		getCurrentSession().delete(entity);
	}
	
	public List<Carrito> findAllCarritos() {
		 List<Carrito> entity = (List<Carrito>) getCurrentSession().createQuery("from Carrito").list() ;
		return entity;
	}
//	//--> Contiene functions:
//	public void persist(Contiene entity) {
//		getCurrentSession().save(entity);
//	}
//	public void update(Contiene entity) {
//		getCurrentSession().update(entity);
//	}
//	public Contiene findContieneById(String id) {
//		Contiene entity = (Contiene) getCurrentSession().get(Contiene.class,(Integer.parseInt(id)));
//		return entity;
//	}
//	
//	public void delete(Contiene entity) {
//		getCurrentSession().delete(entity);
//	}
//	
//	public List<Contiene> findAllContienes() {
//		 List<Contiene> entity = (List<Contiene>) getCurrentSession().createQuery("from Contiene").list() ;
//		return entity;
//	}
	
}
