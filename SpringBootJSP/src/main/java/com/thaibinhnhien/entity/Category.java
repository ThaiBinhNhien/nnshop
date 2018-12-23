package com.thaibinhnhien.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Category {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int idCategory;
	
	@Column(name="nameCategory")
	private String nameCategory;
	
	@Column(name="status")
	private int status;

	public Category() {
		super();
	}

	public Category(int idCategory, String nameCategory, int status) {
		super();
		this.idCategory = idCategory;
		this.nameCategory = nameCategory;
		this.status = status;
	}

	public int getIdCategory() {
		return idCategory;
	}

	public void setIdCategory(int idCategory) {
		this.idCategory = idCategory;
	}

	public String getNameCategory() {
		return nameCategory;
	}

	public void setNameCategory(String nameCategory) {
		this.nameCategory = nameCategory;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}
	
	
}
