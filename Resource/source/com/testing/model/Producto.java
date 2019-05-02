package com.testing.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


/*
 * @author: Alberto Gomez 
 * @author: Ivan Perez
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
	@ManyToOne
	private Integer CodUni;
	
	private String Unidad;
	
	public Producto() {
		super();
	}
	public Producto(Integer codPro, String nomPro, String descPro, float prePro, Integer stockPro, Integer CodUni, String Unidad) {
		super();
		CodPro = codPro;
		NomPro = nomPro;
		DescPro = descPro;
		PrePro = prePro;
		StockPro = stockPro;
		this.CodUni = CodUni;
		this.Unidad = Unidad;
	}
	@Override
	public String toString() {
		return "Producto [CodPro=" + CodPro + ", NomPro=" + NomPro + ", DescPro=" + DescPro + ", PrePro=" + PrePro
				+ ", StockPro=" + StockPro + "]";
	}
	public Integer getCodPro() {
		return CodPro;
	}
	public void setCodPro(Integer codPro) {
		CodPro = codPro;
	}
	public String getNomPro() {
		return NomPro;
	}
	public void setNomPro(String nomPro) {
		NomPro = nomPro;
	}
	public String getDescPro() {
		return DescPro;
	}
	public void setDescPro(String descPro) {
		DescPro = descPro;
	}
	public float getPrePro() {
		return PrePro;
	}
	public void setPrePro(float prePro) {
		PrePro = prePro;
	}
	public Integer getStockPro() {
		return StockPro;
	}
	public void setStockPro(Integer stockPro) {
		StockPro = stockPro;
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