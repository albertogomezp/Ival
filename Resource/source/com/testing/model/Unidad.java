package com.testing.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Unidad")
public class Unidad {

	@Id	
	@Column(name = "CodUni")
	private Integer CodUni;
	@Column(name = "Unidad")
	private String Unidad;
	
	public Unidad() {
		super();
	}
	
	public Unidad(Integer codUni, String unidad) {
		super();
		CodUni = codUni;
		Unidad = unidad;
	}
	
	public Integer getCodUni() {
		return CodUni;
	}
	public void setCodUni(Integer codUni) {
		CodUni = codUni;
	}
	public String getUnidad() {
		return Unidad;
	}
	public void setUnidad(String unidad) {
		Unidad = unidad;
	}

	
}
