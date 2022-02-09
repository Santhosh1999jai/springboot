package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.model.EmplyeeModel;


@Repository
public interface EmployeeRepo extends JpaRepository<EmplyeeModel, Integer>{

	EmplyeeModel findByempid(int empid);
	
	@Transactional
	@Modifying
	@Query("delete from EmplyeeModel u WHERE u.empid=:empid")
	void deleteByempid(@Param("empid")int empid);
//	
//	int removeByempid(int empid);

	
}
