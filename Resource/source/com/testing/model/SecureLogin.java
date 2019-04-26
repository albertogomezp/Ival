 package com.testing.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/*
 * @autor: Alberto Gómez Peña
 * @ web: www.albertogomp.es
 */

@Entity
@Table(name = "securelogin")
public class SecureLogin {
	@Id
	@Column(name = "user")
	private String user;
	@Column(name="password")
	private String password;
	@Column(name="condimento")
	private String condimento;
	public SecureLogin() {
		super();
	} 
	public SecureLogin(String user, String password) {
		super();
		this.user = user;
		this.password = password;
		this.condimento = "condimento";
	}
	public SecureLogin(String user, String password,String condimento) {
		super();
		this.user = user;
		this.password = password;
		this.condimento = condimento;
	}
	
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getCondimento() {
		return condimento;
	}
	public void setCondimento(String condimento) {
		this.condimento = condimento;
	}
	
	
	
}
