package com.detection.demo.serviceI;

import com.detection.demo.Entity.Detection_Object;

public interface DetectionServiceI {

	void saveproduct(Detection_Object detection_Object);

	Iterable<Detection_Object> getAllProduct();

	Detection_Object getproductsById(int productNumber);

	void deleteproduct(int productNumber);

	void updateproduct(Detection_Object detection_Object);

}
