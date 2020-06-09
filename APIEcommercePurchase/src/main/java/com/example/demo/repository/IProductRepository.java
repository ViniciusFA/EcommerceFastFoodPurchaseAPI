package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.ProductModel;

@org.springframework.stereotype.Repository
public interface IProductRepository extends JpaRepository<ProductModel, Long>{
	
	//String table = " Products ";
	
	//@Query(value = "Select * from" + table + /*Products */"p where p.idProduct =:idProduct", nativeQuery= false)
	List<ProductModel> findByIdProduct(int idProduct);
	
}
	