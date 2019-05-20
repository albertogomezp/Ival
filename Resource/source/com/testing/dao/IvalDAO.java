package com.testing.dao;
//import javax.persistence.*;

//import com.testing.controller.Core;
import com.testing.model.*;

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


	public Session openCurrentSession() {
		System.out.println("Abre sesion");
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
			 .addPackage("com.testing.model")
			 .addAnnotatedClass(SecureLogin.class)
			 .addAnnotatedClass(Carrito.class)
			 .addAnnotatedClass(Producto.class);
		StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties());
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
		System.out.println("ok ll");
		@SuppressWarnings("unchecked")
		List<Producto> entity = (List<Producto>) getCurrentSession().createQuery("from Producto").list() ;
		System.out.println(entity.toString());
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
		 @SuppressWarnings("unchecked")
		List<Carrito> entity = (List<Carrito>) getCurrentSession().createQuery("from Carrito").list() ;
		return entity;
	}
	
	//--> SecureLogin Functions
		/* (non-Javadoc)
		 * @see com.testing.dao.ivalDAO#signin(com.testing.model.SecureLogin)
		 */
		@Override
		public void signin(SecureLogin entity) {
			currentSession.beginTransaction();
			currentSession.save(entity);
			currentSession.getTransaction().commit();
		}

		/* (non-Javadoc)
		 * @see com.testing.dao.ivalDAO#updateUser(com.testing.model.SecureLogin)
		 */
		@Override
		public void updateUser(SecureLogin entity) {
			currentSession.beginTransaction();
			getCurrentSession().update(entity);
			currentSession.getTransaction().commit();

		}

		/* (non-Javadoc)
		 * @see com.testing.dao.ivalDAO#login(java.lang.String)
		 */
		@Override
		public SecureLogin login(String username) {
			currentSession.beginTransaction();
			
			Object entity;
			try {
				entity = currentSession.get(SecureLogin.class, username);
				System.out.println(entity.toString());
			} catch (NullPointerException e) {
				e.printStackTrace();
				entity = new SecureLogin();
			}
			System.out.println("--> Peta aqui (?)");
			//SecureLogin entity = (SecureLogin) getCurrentSession().get(SecureLogin.class,(username));
		
			//currentSession.close();
			return (SecureLogin) entity;
		}

		/* (non-Javadoc)
		 * @see com.testing.dao.ivalDAO#delete(com.testing.model.SecureLogin)
		 */
		@Override
		public void delete(SecureLogin entity) {
			getCurrentSession().delete(entity);
		}

		/* (non-Javadoc)
		 * @see com.testing.dao.ivalDAO#findAllUsers()
		 */
		@Override
		public List<SecureLogin> findAllUsers() {
		 @SuppressWarnings("unchecked")
			List<SecureLogin> entity = (List<SecureLogin>) getCurrentSession().createQuery("from SecureLogin").list() ;
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
