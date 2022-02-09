package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.dto.CompanyDto;
import com.example.demo.dto.EmployeeDto;
import com.example.demo.model.EmplyeeModel;



@Service
public interface EmployeeService {
	

 EmplyeeModel model(EmployeeDto employeedto);

 EmplyeeModel empp(EmployeeDto employeedto);

//EmplyeeModel saveemp(EmployeeDto employeedto);

 String updateemp(EmployeeDto employeedto) ;

 List<EmplyeeModel>findall();

 String delete(int empid);



}
