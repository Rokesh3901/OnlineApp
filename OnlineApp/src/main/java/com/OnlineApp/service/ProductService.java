package com.OnlineApp.service;

import java.util.List;

import com.OnlineApp.entity.Product;

public interface ProductService {

	public abstract String addProduct(Product product);
		
	public abstract List<Product> getProducts();
}
