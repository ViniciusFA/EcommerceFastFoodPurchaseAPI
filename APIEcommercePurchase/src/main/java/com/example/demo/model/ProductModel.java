package com.example.demo.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tb_products")
public class ProductModel implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id_product")	
	private int idProduct;
	
	@Column(name = "ds_nome")
	private String name;
	
	@ManyToOne
	@JoinColumn(name = "vl_category")
	private CategoryModel category;
	
	@Column(name = "vl_quantity")
	private int quantity;
	
	@Column(name = "vl_price")
	private double price;
	
	public ProductModel () {}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public CategoryModel getCategory() {
		return category;
	}
	
	public void setCategory(CategoryModel category) {
		this.category = category;
	}
	
	public int getQuantity() {
		return quantity;
	}
	
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getIdProduct() {
		return idProduct;
	}


	@Override
	public String toString() {
		return "Product [IdProduct=" + idProduct + ", name=" + name + ", category=" + category + ", quantity="
				+ quantity + ", price=" + price + "]";
	}	
	
}
