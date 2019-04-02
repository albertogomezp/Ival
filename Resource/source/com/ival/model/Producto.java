package com.ival.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


/*
 * @author: Alberto Gómez Peña
 * @author: Iván Pérez Molina
 */

@Entity
@Table(name = "Producto")
public class Producto  {
	
	@Id	
	@Column(name = "CodPro")
	private Integer CodPro;
	@Column(name = "NomPro")
	private String NomPro;
	@Column(name = "DescPro")
	private String DescPro;
	@Column(name = "PrePro")
	private float PrePro;
	@Column(name = "StockPro")
	private Integer StockPro;
	
	public Producto() {
		super();
	}
	public Producto(Integer codPro, String nomPro, String descPro, float prePro, Integer stockPro) {
		super();
		CodPro = codPro;
		NomPro = nomPro;
		DescPro = descPro;
		PrePro = prePro;
		StockPro = stockPro;
	}
	
	
	
}