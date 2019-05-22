package com.spring.jpa.app.models.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.spring.jpa.app.models.entity.Producto;

public interface IProductoService {
	public List<Producto> findAll();
	// Un page tambien es un iterable como list
	public Page<Producto> findAll(Pageable pageable );

	public void save(Producto producto);
	
	public Producto findOne(Long id);
	
	public void delete(Long id);
}
