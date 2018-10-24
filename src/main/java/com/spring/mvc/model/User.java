package com.spring.mvc.model;

import java.io.Serializable;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@Entity
@Table(name = "user")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class User implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3666806492930115254L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private long id;
	
	@Basic
	@Column(name = "username", columnDefinition="varchar(100) NOT NULL")
	private String username;
	
	@Basic
	@Column(name = "nif", columnDefinition="varchar(9) NOT NULL")
	private String nif;
	
	@Basic
	@Column(name = "email", columnDefinition="varchar(100) NOT NULL")	
	private String email;

	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}
	
	public String getNif() {
		return nif;
	}

	public void setNif(String nif) {
		this.nif = nif;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
}
