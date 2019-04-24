package com.testing.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


/*
 * @author: Alberto Gomez 
 * @author: Ivan Perez
 */

@Entity
@Table(name = "Carrito")
public class Carrito  {
	
	@Id	
	@Column(name = "CodCar")
	private Integer CodCar;
	@Column(name = "FechCar")
	private Date FechCar;
	@Column(name = "TotCar")
	private float TotCar;
	
	public Carrito() {
		super();
	}
	
	public Carrito(Integer codCar, Date fechCar, float totCar) {
		super();
		CodCar = codCar;
		FechCar = fechCar;
		TotCar = totCar;
	}
	
	
}