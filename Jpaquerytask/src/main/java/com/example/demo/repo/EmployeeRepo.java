package com.example.demo.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.demo.dto.DeleteDto;
import com.example.demo.dto.EmployeeDto;
import com.example.demo.model.EmployeeModel;

@Repository
public interface EmployeeRepo extends JpaRepository<EmployeeModel, Integer>{
	
	//EmployeeModel deleteByid(DeleteDto employeedto);
	
	@Query("select u from EmployeeModel u where u.empname=:empname")
	List<EmployeeModel>findByempname(@Param("empname") String empname);

}
