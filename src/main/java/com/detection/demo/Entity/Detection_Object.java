package com.detection.demo.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//Entity classes or fields of Products

@Data
@AllArgsConstructor
@NoArgsConstructor

//For making class as a Table in database
@Entity

public class Detection_Object {

	// For making primary key in database
	@Id
	
	private int productNumber;
	
	private String productName;
	
	private String productWeight;
	
	private String productDetails;
	
	private int productPrice;

}
