package com.testing.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.testing.model.*;


public interface InterfaceDAO {

	Session openCurrentSession();

	Session openCurrentSessionwithTransaction();

	void closeCurrentSession();

	void closeCurrentSessionwithTransaction();

	Session getCurrentSession();

	void setCurrentSession(Session currentSession);

	Transaction getCurrentTransaction();

	void setCurrentTransaction(Transaction currentTransaction);

	//--> Producto functions:
	void persist(Producto entity);

	void update(Producto entity);

	Producto findProductoById(String id);

	void delete(Producto entity);

	List<Producto> findAllProductos();

	//--> Carrito functions:
	void persist(Carrito entity);

	void update(Carrito entity);

	Carrito findCarritoById(String id);

	void delete(Carrito entity);

	List<Carrito> findAllCarritos();
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