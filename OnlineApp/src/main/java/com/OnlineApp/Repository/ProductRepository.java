package com.OnlineApp.Repository;


import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.OnlineApp.entity.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product,Integer>{

//	@Query("select p from Product p where p.productPrice between ?1 and ?2 ")
//	public List<Product> getAllProductsBetween(int initialPrice , int finalPrice);
//		
//	
//	@Query("select p1  from Product p1 where p.productCategory=?1")
//	public List<Product> getAllProductsByCategory(String category);
	
	public List<Product> findByProductPriceBetween(int initialPrice , int finalPrice);
	public List<Product> findByProductCategory(String productCategory);
	public List<Product> findByProductValidityEquals(Date date);
	
}
