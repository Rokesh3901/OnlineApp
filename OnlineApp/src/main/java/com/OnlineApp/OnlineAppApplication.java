package com.OnlineApp;


import java.util.Date;


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
	    
	    
		//Date d1 = new Date(2025,9,03);
	  // System.out.println(productServiceImpl.findByProductValidityEquals(d1));
	    
	    System.out.println(productServiceImpl.findByProductPriceBetween(10000,20000));
	}

}
