package com.OnlineApp.service;


import java.util.Date;
import java.util.List;

import com.OnlineApp.entity.Product;
import com.OnlineApp.exceptions.ProductNotFound;

public interface ProductService {

	public abstract String addProduct(Product product);

	public abstract Product updateProduct(Product product);

	public abstract String deleteProduct(int productId);

	public abstract Product getProductById(int productId) throws ProductNotFound;

	public abstract List<Product> getAllProduct();

	public abstract List<Product> findByProductPriceBetween(int initialPrice, int finalPrice);
     
	public abstract List<Product> findByProductCategory(String productCategory);
	
	public abstract List<Product> findByProductValidityEquals(Date date);
}
