package com.example.demo.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.demo.dto.EmployeeDto;
import com.example.demo.model.LocationModel;

@Repository
public interface LocationRepo extends JpaRepository<LocationModel, Integer>{
	
	@Query("select l.locid from LocationModel l where l.locid=:locid ")
	LocationModel deleteBylocid(@Param("locid") int locid);
	
	
	LocationModel findByLocid(int locid);
	
	
	@Query("select u from LocationModel u where u.district=:district")
	List<LocationModel> findBydistrict(@Param("district") String district);
	
	
	
	//@Query("select l.locid from LocationModel l where l.locid=:locid")
	//LocationModel findBylocid(int locid);
	
}
