package com.OnlineApp.loggers;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspectBefore {

	private final Logger LOGGER = LoggerFactory.getLogger(this.getClass());

	@Before("execution(* com.OnlineApp.service.ProductServiceImpl.*(..))")
	public void logBeforeAllMethods(JoinPoint joinPoint) {
		LOGGER.info("****LoggingAspect.logBeforeAllMethods() : " + joinPoint.getSignature().getName());
	}

	@Before("execution(* com.OnlineApp.service.ProductServiceImpl.addProduct(..))")
	public void logBeforeAddProduct(JoinPoint joinPoint) {
		LOGGER.info("****LoggingAspect.logBeforeaddproduct`() : " + joinPoint.getSignature().getName());
	}

	@Before("execution(* com.OnlineApp.service.ProductServiceImpl.updateProduct(..))")
	public void logBeforeUpdateProduct(JoinPoint joinPoint) {
		LOGGER.info("****LoggingAspect.logBeforeupdateproduct`() : " + joinPoint.getSignature().getName());
	}

	@Before("execution(* com.OnlineApp.service.ProductServiceImpl.deleteProduct(..))")
	public void logBeforeDeleteProduct(JoinPoint joinPoint) {
		LOGGER.info("****LoggingAspect.logBeforedeleteproduct`() : " + joinPoint.getSignature().getName());
	}

	@Before("execution(* com.OnlineApp.service.ProductServiceImpl.getProductById(..))")
	public void logBeforeGetProductById(JoinPoint joinPoint) {
		LOGGER.info("****LoggingAspect.logBeforegetProductById() : " + joinPoint.getSignature().getName());
	}

	@Before("execution(* com.OnlineApp.service.ProductServiceImpl.getAllProduct(..))")
	public void logBeforeGetAllProduct(JoinPoint joinPoint) {
		LOGGER.info("****LoggingAspect.logBeforegetAllProduct() : " + joinPoint.getSignature().getName());
	}

	@Before("execution(* com.OnlineApp.service.ProductServiceImpl.findByProductPriceBetween(..))")
	public void logBeforeFindByProductPriceBetween(JoinPoint joinPoint) {
		LOGGER.info("****LoggingAspect.logBeforefindByProductPriceBetween() : " + joinPoint.getSignature().getName());
	}

}