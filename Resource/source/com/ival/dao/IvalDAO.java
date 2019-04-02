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

public class IvalDAO implements InterfaceDAO {
	
	private Session currentSession;
	private Transaction currentTransaction;

	public IvalDAO() {
	}

	/* (non-Javadoc)
	 * @see com.ival.dao.InterfaceDAO#openCurrentSession()
	 */
	@Override
	public Session openCurrentSession() {
		currentSession = getSessionFactory().openSession();
		return currentSession;
	}

	/* (non-Javadoc)
	 * @see com.ival.dao.InterfaceDAO#openCurrentSessionwithTransaction()
	 */
	@Override
	public Session openCurrentSessionwithTransaction() {
		currentSession = getSessionFactory().openSession();
		currentTransaction = currentSession.beginTransaction();
		return currentSession;
	}

	/* (non-Javadoc)
	 * @see com.ival.dao.InterfaceDAO#closeCurrentSession()
	 */
	@Override
	public void closeCurrentSession() {
		currentSession.close();
	}

	/* (non-Javadoc)
	 * @see com.ival.dao.InterfaceDAO#closeCurrentSessionwithTransaction()
	 */
	@Override
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

	/* (non-Javadoc)
	 * @see com.ival.dao.InterfaceDAO#getCurrentSession()
	 */
	@Override
	public Session getCurrentSession() {
		return currentSession;
	}

	/* (non-Javadoc)
	 * @see com.ival.dao.InterfaceDAO#setCurrentSession(org.hibernate.Session)
	 */
	@Override
	public void setCurrentSession(Session currentSession) {
		this.currentSession = currentSession;
	}

	/* (non-Javadoc)
	 * @see com.ival.dao.InterfaceDAO#getCurrentTransaction()
	 */
	@Override
	public Transaction getCurrentTransaction() {
		return currentTransaction;
	}

	/* (non-Javadoc)
	 * @see com.ival.dao.InterfaceDAO#setCurrentTransaction(org.hibernate.Transaction)
	 */
	@Override
	public void setCurrentTransaction(Transaction currentTransaction) {
		this.currentTransaction = currentTransaction;
	} 
	//--> Producto functions:
	/* (non-Javadoc)
	 * @see com.ival.dao.InterfaceDAO#persist(com.ival.model.Producto)
	 */
	@Override
	public void persist(Producto entity) {
		getCurrentSession().save(entity);
	}
	/* (non-Javadoc)
	 * @see com.ival.dao.InterfaceDAO#update(com.ival.model.Producto)
	 */
	@Override
	public void update(Producto entity) {
		getCurrentSession().update(entity);
	}
	/* (non-Javadoc)
	 * @see com.ival.dao.InterfaceDAO#findProductoById(java.lang.String)
	 */
	@Override
	public Producto findProductoById(String id) {
		Producto entity = (Producto) getCurrentSession().get(Producto.class,(Integer.parseInt(id)));
		return entity;
	}
	
	/* (non-Javadoc)
	 * @see com.ival.dao.InterfaceDAO#delete(com.ival.model.Producto)
	 */
	@Override
	public void delete(Producto entity) {
		getCurrentSession().delete(entity);
	}
	
	/* (non-Javadoc)
	 * @see com.ival.dao.InterfaceDAO#findAllProductos()
	 */
	@Override
	public List<Producto> findAllProductos() {
		 List<Producto> entity = (List<Producto>) getCurrentSession().createQuery("from Producto").list() ;
		return entity;
	}
	//--> Carrito functions:
	/* (non-Javadoc)
	 * @see com.ival.dao.InterfaceDAO#persist(com.ival.model.Carrito)
	 */
	@Override
	public void persist(Carrito entity) {
		getCurrentSession().save(entity);
	}
	/* (non-Javadoc)
	 * @see com.ival.dao.InterfaceDAO#update(com.ival.model.Carrito)
	 */
	@Override
	public void update(Carrito entity) {
		getCurrentSession().update(entity);
	}
	/* (non-Javadoc)
	 * @see com.ival.dao.InterfaceDAO#findCarritoById(java.lang.String)
	 */
	@Override
	public Carrito findCarritoById(String id) {
		Carrito entity = (Carrito) getCurrentSession().get(Carrito.class,(Integer.parseInt(id)));
		return entity;
	}
	
	/* (non-Javadoc)
	 * @see com.ival.dao.InterfaceDAO#delete(com.ival.model.Carrito)
	 */
	@Override
	public void delete(Carrito entity) {
		getCurrentSession().delete(entity);
	}
	
	/* (non-Javadoc)
	 * @see com.ival.dao.InterfaceDAO#findAllCarritos()
	 */
	@Override
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
