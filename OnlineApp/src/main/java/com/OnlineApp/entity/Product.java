package com.OnlineApp.entity;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.Data;


@Entity
@Data
@Table

public class Product {
    
	@Id
	private int productId;
	@NotEmpty(message="Name cannot be Empty") @Size
	private String productName;
	@NotEmpty(message="Price cannot be Empty") @Size
	private int productPrice;
	
	private String productCategory;
	private Date productValidity;
}
