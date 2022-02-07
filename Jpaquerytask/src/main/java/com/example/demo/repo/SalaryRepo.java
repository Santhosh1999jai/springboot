package com.example.demo.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.demo.model.SalaryModel;

@Repository
public interface SalaryRepo extends JpaRepository<SalaryModel, Integer>{

	
	SalaryModel findBysalaid(int salaid);
	
	@Query("SELECT u from SalaryModel u WHERE u.salary>=:salary ")
	List<SalaryModel> FindBysalary(@Param("salary") int salary);
	
}

