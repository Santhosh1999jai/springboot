package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.dto.DeleteDto;
import com.example.demo.dto.EmployeeDto;
import com.example.demo.model.EmployeeModel;
import com.example.demo.model.LocationModel;

@Service
public interface EmployeeService {

	
	EmployeeModel save(EmployeeDto employeedto);
	
	
	List<EmployeeModel> getByname(EmployeeDto employeedto);
	
	List<LocationModel> findall();
	
	
	String updateemp(EmployeeDto employeedto);
	
	
	String delete(int locid);
}
