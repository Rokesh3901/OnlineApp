package com.OnlineApp.service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.OnlineApp.Repository.ProductRepository;
import com.OnlineApp.entity.Product;
import com.OnlineApp.exceptions.ProductNotFound;

import lombok.AllArgsConstructor;


@Service
@AllArgsConstructor

public class ProductServiceImpl implements ProductService {

	
	//@Autowired
	ProductRepository repository;

	@Override
	public String addProduct(Product product) {
		Product product1 = repository.save(product);
		if (product1 != null) {
			return "product saved successfully";
		} else {
			return "Failed to save Product";
		}

	}

	@Override
	public Product updateProduct(Product product) {

		return repository.save(product);
	}

	@Override
	public String deleteProduct(int productId) {
		repository.deleteById(productId);
		return "Product deleted Successfully";
	}

	@Override
	public Product getProductById(int productId) throws ProductNotFound {

		Optional<Product> product = repository.findById(productId);
		if (product.isPresent())
			return product.get();
		else
			throw new ProductNotFound("No Product found with the given ID");

	}

	@Override
	public List<Product> getAllProduct() {

		return repository.findAll();
	}

	@Override
	public List<Product> findByProductPriceBetween(int initialPrice, int finalPrice) {

		return repository.findByProductPriceBetween(initialPrice, finalPrice);
	}

	@Override
	public List<Product> findByProductCategory(String productCategory) {
		
		return repository.findByProductCategory(productCategory);
	}

	@Override
	public List<Product> findByProductValidityEquals(Date date) {
		
		return repository.findByProductValidityEquals(date);
	}

}
