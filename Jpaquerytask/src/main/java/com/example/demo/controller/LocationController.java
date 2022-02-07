package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.EmployeeDto;
import com.example.demo.model.LocationModel;
import com.example.demo.service.LocationService;

@RestController
public class LocationController {

	@Autowired
	LocationService locationservice;
	
	
	@PutMapping(value="/updatelocation",produces="application/json")
	public String updatelocation(@RequestBody EmployeeDto employeedto) {
		String output=locationservice.updatelocation(employeedto);
		return output;
		
	}
	
	@GetMapping(value="/getbylocid",produces="application/json")
	public LocationModel findBylocid(@RequestBody EmployeeDto employeedto)  throws Exception{
		try {
		LocationModel output=locationservice.findBylocid(employeedto);
		return output;
		}
		catch(Exception e) {
			e.getMessage();
		}
		return null;
	}
	
	@GetMapping(value="/geybydistrict",produces="application/json")
	public List<LocationModel> districet(@RequestBody  EmployeeDto employeedto){
		List<LocationModel>output=locationservice.findBydistrict(employeedto);
		return output;
		
	}
	
}
