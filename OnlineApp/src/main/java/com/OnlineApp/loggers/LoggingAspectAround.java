//
//package com.OnlineApp.loggers;
//
//import org.aspectj.lang.ProceedingJoinPoint;
//import org.aspectj.lang.annotation.Around;
//import org.aspectj.lang.annotation.Aspect;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.stereotype.Component;
//
//@Aspect
//
//@Component
//public class LoggingAspectAround {
//
//	private final Logger LOGGER = LoggerFactory.getLogger(this.getClass());
//
//	@Around("execution(* com.OnlineApp.service.ProductServiceImpl.*(..))")
//	public void logAroundAllMethods(ProceedingJoinPoint joinPoint) throws Throwable {
//		LOGGER.debug("****LoggingAspect.logAroundAllMethods() : " + joinPoint.getSignature().getName()
//				+ ": Before Method Execution");
//		try {
//			joinPoint.proceed();
//		} finally { // Do Something useful, If you have }
//			LOGGER.debug("****LoggingAspect.logAroundAllMethods() : " + joinPoint.getSignature().getName()
//					+ ": After Method Execution");
//		}
//
//	}
//
//	@Around("execution(* com.OnlineApp.service.ProductServiceImpl.addProduct(..))")
//	public void logAroundAddProduct(ProceedingJoinPoint joinPoint) throws Throwable {
//		LOGGER.debug("****LoggingAspect.logAroundAddProduct() : " + joinPoint.getSignature().getName()
//				+ ": Before Method Execution");
//		try {
//			joinPoint.proceed();
//		} finally { // Do Something useful, If you have }
//			LOGGER.debug("****LoggingAspect.logAroundAddProduct() : " + joinPoint.getSignature().getName()
//					+ ": After Method Execution");
//		}
//	}
//
//	@Around("execution(* com.example.demo.service.EmployeeService.addEmployee(..))")
//	public void logAroundAddEmployee(ProceedingJoinPoint joinPoint) throws Throwable {
//		LOGGER.debug("****LoggingAspect.logAroundAddEmployee() : " + joinPoint.getSignature().getName()
//				+ ": Before Method Execution");
//		try {
//			joinPoint.proceed();
//		} finally { // Do Something useful, If you have }
//			LOGGER.debug("****LoggingAspect.logAroundAddEmployee() : " + joinPoint.getSignature().getName()
//					+ ": After Method Execution");
//		}
//	}
//	
//	@Around("execution(* com.OnlineApp.service.ProductServiceImpl.updateProduct(..))")
//	public void logAroundUpdateProduct(ProceedingJoinPoint joinPoint) throws Throwable {
//		LOGGER.debug("****LoggingAspect.logAroundUpdateProduct() : " + joinPoint.getSignature().getName()
//				+ ": Before Method Execution");
//		try {
//			joinPoint.proceed();
//		} finally { // Do Something useful, If you have }
//			LOGGER.debug("****LoggingAspect.logAroundUpdateProduct() : " + joinPoint.getSignature().getName()
//					+ ": After Method Execution");
//		}
//	}
//	
//	@Around("execution(* com.OnlineApp.service.ProductServiceImpl.deleteProduct(..))")
//	public void logAroundDeleteProduct(ProceedingJoinPoint joinPoint) throws Throwable {
//		LOGGER.debug("****LoggingAspect.logAroundDeleteProduct() : " + joinPoint.getSignature().getName()
//				+ ": Before Method Execution");
//		try {
//			joinPoint.proceed();
//		} finally { // Do Something useful, If you have }
//			LOGGER.debug("****LoggingAspect.logAroundDeleteProduct() : " + joinPoint.getSignature().getName()
//					+ ": After Method Execution");
//		}
//	}
//	
//	@Around("execution(* com.OnlineApp.service.ProductServiceImpl.getProductById(..))")
//	public void logAroundGetProductById(ProceedingJoinPoint joinPoint) throws Throwable {
//		LOGGER.debug("****LoggingAspect.logAroundGetProductById() : " + joinPoint.getSignature().getName()
//				+ ": Before Method Execution");
//		try {
//			joinPoint.proceed();
//		} finally { // Do Something useful, If you have }
//			LOGGER.debug("****LoggingAspect.logAroundGetProductById() : " + joinPoint.getSignature().getName()
//					+ ": After Method Execution");
//		}
//	
//	}
//	
//	@Around("execution(* com.OnlineApp.service.ProductServiceImpl.getAllProduct(..))")
//	public void logAroundGetAllProduct(ProceedingJoinPoint joinPoint) throws Throwable {
//		LOGGER.debug("****LoggingAspect.logAroundGetAllProduct() : " + joinPoint.getSignature().getName()
//				+ ": Before Method Execution");
//		try {
//			joinPoint.proceed();
//		} finally { // Do Something useful, If you have }
//			LOGGER.debug("****LoggingAspect.logAroundGetAllProduct() : " + joinPoint.getSignature().getName()
//					+ ": After Method Execution");
//		}
//	}
//	@Around("execution(* com.OnlineApp.service.ProductServiceImpl.findByProductPriceBetween(..))")
//	public void logAroundFindByProductPriceBetween(ProceedingJoinPoint joinPoint) throws Throwable {
//		LOGGER.debug("****LoggingAspect.logAroundFindByProductPriceBetween() : " + joinPoint.getSignature().getName()
//				+ ": Before Method Execution");
//		try {
//			joinPoint.proceed();
//		} finally { // Do Something useful, If you have }
//			LOGGER.debug("****LoggingAspect.logAroundFindByProductPriceBetween() : " + joinPoint.getSignature().getName()
//					+ ": After Method Execution");
//		}
//   }
//	
//}
