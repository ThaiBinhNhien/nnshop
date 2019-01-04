package com.thaibinhnhien.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.springframework.beans.factory.annotation.Value;

@Entity
public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int idProduct;

	@Column(name = "nameProduct")
	private String nameProduct;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idCategory", nullable = false)
	private Category category;

	@Column(name="priceProduct")
	@Value("0.0")
	private double priceProduct;

	@Column(name="status")
	private int status;

	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}

	

	public Product(int idProduct, String nameProduct, Category category, double priceProduct, int status) {
		super();
		this.idProduct = idProduct;
		this.nameProduct = nameProduct;
		this.category = category;
		this.priceProduct = priceProduct;
		this.status = status;
	}



	public int getIdProduct() {
		return idProduct;
	}

	public void setIdProduct(int idProduct) {
		this.idProduct = idProduct;
	}

	public String getNameProduct() {
		return nameProduct;
	}

	public void setNameProduct(String nameProduct) {
		this.nameProduct = nameProduct;
	}

	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}


	public Category getCategory() {
		return category;
	}


	public void setCategory(Category category) {
		this.category = category;
	}



	public double getPriceProduct() {
		return priceProduct;
	}



	public void setPriceProduct(double priceProduct) {
		this.priceProduct = priceProduct;
	}



}
