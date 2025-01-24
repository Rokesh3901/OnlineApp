//
//package com.OnlineApp.loggers;
//
//import org.aspectj.lang.JoinPoint;
//import org.aspectj.lang.annotation.After;
//import org.aspectj.lang.annotation.Aspect;
//import org.aspectj.lang.annotation.Before;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.stereotype.Component;
//
//@Aspect
//@Component
//public class LoggingAspectAfter {
//
//	private final Logger LOGGER = LoggerFactory.getLogger(this.getClass());
//
//	@Before("within(com.OnlineApp.service.*)")
//	public void logBeforeAllServiceClassMesthods() {
//		LOGGER.debug("For All Services");
//	}
//	
//	@After("execution(* com.OnlineApp.service.ProductServiceImpl.*(..))")
//	public void logBeforeAllMethods(JoinPoint joinPoint) {
//		LOGGER.info("****LoggingAspect.logAfterAllMethods() : " + joinPoint.getSignature().getName());
//	}
//
//	@After("execution(* com.OnlineApp.service.ProductServiceImpl.addProduct(..))")
//	public void logBeforeAddProduct(JoinPoint joinPoint) {
//		LOGGER.info("****LoggingAspect.logAfteraddproduct`() : " + joinPoint.getSignature().getName());
//	}
//
//	@After("execution(* com.OnlineApp.service.ProductServiceImpl.updateProduct(..))")
//	public void logBeforeUpdateProduct(JoinPoint joinPoint) {
//		LOGGER.info("****LoggingAspect.logAfterupdateproduct`() : " + joinPoint.getSignature().getName());
//	}
//
//	@After("execution(* com.OnlineApp.service.ProductServiceImpl.deleteProduct(..))")
//	public void logBeforeDeleteProduct(JoinPoint joinPoint) {
//		LOGGER.info("****LoggingAspect.logAfterdeleteproduct`() : " + joinPoint.getSignature().getName());
//	}
//
//	@After("execution(* com.OnlineApp.service.ProductServiceImpl.getProductById(..))")
//	public void logBeforeGetProductById(JoinPoint joinPoint) {
//		LOGGER.info("****LoggingAspect.logAftergetProductById() : " + joinPoint.getSignature().getName());
//	}
//
//	@After("execution(* com.OnlineApp.service.ProductServiceImpl.getAllProduct(..))")
//	public void logBeforeGetAllProduct(JoinPoint joinPoint) {
//		LOGGER.info("****LoggingAspect.logAftergetAllProduct() : " + joinPoint.getSignature().getName());
//	}
//
//	@After("execution(* com.OnlineApp.service.ProductServiceImpl.findByProductPriceBetween(..))")
//	public void logBeforeFindByProductPriceBetween(JoinPoint joinPoint) {
//		LOGGER.info("****LoggingAspect.logAfterfindByProductPriceBetween() : " + joinPoint.getSignature().getName());
//	}
//
//}
