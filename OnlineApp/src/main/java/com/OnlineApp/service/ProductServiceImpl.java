package com.OnlineApp.service;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.OnlineApp.Repository.ProductRepository;
import com.OnlineApp.entity.Product;


@Service
public class ProductServiceImpl implements ProductService{

	@Autowired
	ProductRepository repository;
	
	@Override
	public String addProduct(Product product) {
		Product product1 = repository.save(product);
		if(product1!=null)
		{
			return "product saved successfully";
		}
		else {
			return "Failed to save Product";
		}
		
	}

	@Override
	public List<Product> getProducts() {
		
		List<Product> products = new ArrayList<>();
		System.out.println("Method getproducts() called");
		return products;
	}

}
