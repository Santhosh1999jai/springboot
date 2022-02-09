package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.CompanyModel;


@Repository
public interface CompanyRepo extends JpaRepository<CompanyModel, Integer>{
	
	CompanyModel findByid(int id);

}
