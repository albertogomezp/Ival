package com.spring.jpa.app.models.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.spring.jpa.app.models.dao.IProductoDao;
import com.spring.jpa.app.models.entity.Producto;


@Service
public class ProductoServiceImpl implements IProductoService{
	
	@Autowired
	private IProductoDao productoDAO;
	
	@Transactional(readOnly = true)
	public List<Producto> findAll(){
		return (List<Producto>) productoDAO.findAll();
	}
	
	@Override
	@Transactional
	public void save(Producto producto) {
		productoDAO.save(producto);
	}
	@Override
	@Transactional(readOnly = true)
	public Producto findOne(Long id) {
		return productoDAO.findById(id).orElse(null);
	}
	@Override
	@Transactional
	public void delete(Long id) {
		productoDAO.deleteById(id);
	}

	@Override
	@Transactional(readOnly = true)
	public Page<Producto> findAll(Pageable pageable){ 
		return productoDAO.findAll(pageable);
	}
	
}
