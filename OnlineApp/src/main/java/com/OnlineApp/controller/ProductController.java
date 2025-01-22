package com.OnlineApp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.OnlineApp.entity.Product;
import com.OnlineApp.service.ProductService;



@RestController
@RequestMapping("/product")
public class ProductController {

	@Autowired
	ProductService productservice;
	
	//@RequestMapping(method=RequestMethod.POST,consumes="application/json",value="/save")
	@PostMapping("/save")        
	public String saveProduct(@RequestBody Product product) {
		return productservice.addProduct(product);
		
	}
}
