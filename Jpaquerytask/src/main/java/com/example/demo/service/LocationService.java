package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.dto.EmployeeDto;
import com.example.demo.model.LocationModel;

@Service
public interface LocationService {

	String updatelocation(EmployeeDto employeedto);
	
	LocationModel findBylocid(EmployeeDto employeedto);
	
	List<LocationModel> findBydistrict(EmployeeDto employeedto);
	
}
