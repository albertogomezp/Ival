package com.spring.jpa.app.models.dao;

import java.util.List;

//import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.spring.jpa.app.models.entity.Producto;

public interface IProductoDao extends PagingAndSortingRepository <Producto, Long>{


}
