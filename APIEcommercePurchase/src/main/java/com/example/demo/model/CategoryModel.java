package com.example.demo.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tb_category")
public class CategoryModel implements Serializable{

	public CategoryModel() {}	
	
	public CategoryModel(int idCategory, String name) {
		super();
		this.idCategory = idCategory;
		this.name = name;
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id_category")	
	private int idCategory;
	
	@Column(name = "ds_name")
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getIdCategory() {
		return idCategory;
	}

	@Override
	public String toString() {
		return "CategoryModel [idCategory=" + idCategory + ", name=" + name + "]";
	}	
	
}
