package com.OnlineApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import com.OnlineApp.service.ProductServiceImpl;

@SpringBootApplication
@EnableAspectJAutoProxy
public class OnlineAppApplication {

	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(OnlineAppApplication.class, args);
		
	    ProductServiceImpl productServiceImpl = applicationContext.getBean(ProductServiceImpl.class);
	    
	    System.out.println(productServiceImpl.getProducts());
	}

}
