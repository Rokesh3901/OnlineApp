package com.OnlineApp.controller;

import java.util.Date;
import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.OnlineApp.entity.Product;
import com.OnlineApp.exceptions.ProductNotFound;
import com.OnlineApp.service.ProductService;

import lombok.AllArgsConstructor;


@AllArgsConstructor
@RestController
@RequestMapping("/products")
public class ProductController {
	
	ProductService productservice;
	
	//@RequestMapping(method=RequestMethod.POST,consumes="application/json",value="/save")
	@PostMapping("/save")       //http://localhost:8080/products/save 
	public String saveProduct(@RequestBody Product product) {
		return productservice.addProduct(product);
		
	}
	
	@PutMapping("/update")        //http://localhost:8080/products/update
	public Product updateProduct(@RequestBody Product product) {
		return productservice.updateProduct(product);
		
	}
	
	@DeleteMapping("/delete/{id}")        //http://localhost:8080/products/delete
	public String deleteProduct(@PathVariable("id") int productId) {
		return productservice.deleteProduct(productId);
		
	}
	
	@GetMapping("/getProductById/{id}")        //http://localhost:8080/products/getProductById/123
	public Product getProductById(@PathVariable("id") int productId) throws ProductNotFound {
		return productservice.getProductById(productId);
		
	}
	
	@GetMapping("/getAllProducts")      //http://localhost:8080/products/getAllProducts  
	public List<Product> getAllProduct() {
		return productservice.getAllProduct();
		
	}
	
	@GetMapping("/getBetween/{price1}/{price2}") //http://localhost:8080/products/getAllBetween/10000/20000        
	public  List<Product> getAllBetween(@PathVariable("price1") int initialPrice , @PathVariable("price2") int finalPrice) {
		return productservice.findByProductPriceBetween(initialPrice, finalPrice);
		
	}
	

	@GetMapping("/getByCategory/{category}") //http://localhost:8080/products/getByCategory/       
	public  List<Product> getByCategory(@PathVariable("category") String productCategory) {
		return productservice.findByProductCategory(productCategory);
		
	}
	
	@GetMapping("/getByProductValidity/{date}") //http://localhost:8080/products/getByProductValidity/      
	public  List<Product> getByCategory(@PathVariable("date") Date date) {
		return productservice.findByProductValidityEquals(date);
		
	}
	
}
