package com.detection.demo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.detection.demo.Entity.Detection_Object;

@Repository
public interface DetectionRepository extends CrudRepository<Detection_Object, Integer> {

}
