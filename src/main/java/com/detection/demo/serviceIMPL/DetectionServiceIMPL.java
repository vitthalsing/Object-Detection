package com.detection.demo.serviceIMPL;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.detection.demo.Entity.Detection_Object;
import com.detection.demo.repository.DetectionRepository;
import com.detection.demo.serviceI.DetectionServiceI;

// Declaring Service class for writing business logic
@Service
public class DetectionServiceIMPL implements DetectionServiceI {

	@Autowired
	DetectionRepository detectionrepository;

	// Implementation of saving information of the product
	@Override
	public void saveproduct(Detection_Object detection_Object) {

		detectionrepository.save(detection_Object);
	}

	// Implementation of receiving information of the product
	@Override
	public Iterable<Detection_Object> getAllProduct() {

		return detectionrepository.findAll();

	}

	// Implementation of receiving information of All products
	@Override
	public Detection_Object getproductsById(int productNumber) {

		return detectionrepository.findById(productNumber).get();
	}

	// Implementation of delete or Remove information of the product
	@Override
	public void deleteproduct(int productNumber) {

		detectionrepository.deleteById(productNumber);

	}

	// Implementation of update information of the product
	@Override
	public void updateproduct(Detection_Object detection_Object) {

		detectionrepository.save(detection_Object);
	}

}
