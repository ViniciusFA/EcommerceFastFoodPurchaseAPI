package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.ProductModel;
import com.example.demo.service.ProductService;

@RestController
@RequestMapping("/api")
public class ProductController {
	
	@Autowired
	ProductService productService;
	
	@GetMapping(value="/findPurchase/{idProduct}")
	public @ResponseBody List<ProductModel> finallyPurchase(@PathVariable("idProduct") int idProduct) 
	{
		//List<ProductModel> resultProductService = productService.getPurchase();		
		List<ProductModel> resultProductService = productService.getPurchase(idProduct);
				
		return resultProductService;				
	}
	
}
