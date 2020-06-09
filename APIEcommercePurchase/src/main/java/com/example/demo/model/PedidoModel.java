package com.example.demo.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "tb_order")
public class PedidoModel implements Serializable{
	
	private static final long serialVersionUID = 6375928645639228691L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id_order")
	private int idPedido;
	
	/*
	@OneToMany	 
	@JoinColumn(name = "")
	private List<ProductModel> products;
	*/
	
	@Column(name = "vl_valueTotal")
	private double valueTotal;

	public PedidoModel() {}
	
	/*
	public List<ProductModel> getProducts() {
		return products;
	}

	public void setProducts(List<ProductModel> products) {
		this.products = products;
	}
	*/
	
	public double getValueTotal() {
		return valueTotal;
	}

	public void setValueTotal(double valueTotal) {
		this.valueTotal = valueTotal;
	}

	public int getIdPedido() {
		return idPedido;
	}

	@Override
	public String toString() {
		return "PedidoModel [idPedido=" + idPedido + /*", products=" + products +*/ ", valueTotal=" + valueTotal + "]";
	}
	
}
