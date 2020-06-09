package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.ProductModel;
import com.example.demo.repository.IProductRepository;

@Service
public class ProductService {

	@Autowired
	 private IProductRepository productRepository ;
	 
	   //public List<ProductModel> getPurchase() {		
	 public List<ProductModel> getPurchase(int idProduct) {
		 
		 //List<ProductModel> resultProducts = productRepository.getProducts();
		 List<ProductModel> resultProducts = productRepository.findByIdProduct(idProduct);
		 
		 return resultProducts;
	 };	
}
