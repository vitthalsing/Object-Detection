package com.detection.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.detection.demo.Entity.Detection_Object;
import com.detection.demo.serviceI.DetectionServiceI;

// Declaring class as Controller to accept request

@RestController
@CrossOrigin("*")
public class DetectionController {

	@Autowired
	DetectionServiceI detectionservicei;

	// Declare for Save information of product
	@PostMapping("/product")
	private void saveProduct(@RequestBody Detection_Object detection_Object) {
		
		detectionservicei.saveproduct(detection_Object);
		System.out.println("post");
	}

	// Declare for receive information of all products
	@GetMapping("/products")
	private Iterable<Detection_Object> getAllProduct() {

		Iterable<Detection_Object> allproduct = detectionservicei.getAllProduct();
		return allproduct;

	}

	// Declare for receive information of single product
	@GetMapping("/product/{productNumber}")
	private Detection_Object getproducts(@PathVariable("productNumber") int productNumber) {
		return detectionservicei.getproductsById(productNumber);
	}

	// Declare for delete the product details by id
	@DeleteMapping("/product/{productNumber}")
	private void removeproduct(@PathVariable("productNumber") int productNumber) {
		detectionservicei.deleteproduct(productNumber);
	}

	// Declare for updating information of products
	@PutMapping("/products")
	private Detection_Object updateproduct(@RequestBody Detection_Object detection_Object) {

		detectionservicei.updateproduct(detection_Object);
		return detection_Object;
	}

}
