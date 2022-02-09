package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.demo.dto.CompanyDto;
import com.example.demo.model.CompanyModel;


@Service
public interface CompanyService {
	
	 String save(CompanyDto companydto);
	 
	 List<CompanyModel> findAll();
	 
	 String update(CompanyDto companydto);
	 
	// String deletebyid(int id);
	 
	 CompanyModel getByid(CompanyDto companydto);
	 
	 
	 
	 
		 //String savemap( Request request); 

	 
}
