package com.example.demo.repo;

import java.util.List;
import java.util.stream.Stream;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.demo.model.StudentModel123;


@Repository
public interface StudentRepo extends JpaRepository<StudentModel123, Integer>{

	
	@Modifying
	@Query(value="SELECT * FROM student_model123 a where a.name=:name",nativeQuery = true)
	  public List<StudentModel123> getbyname( @Param("name") String name);
	
	
	
	
	
	
//	@Query(value="select * from author a where a.first_name= :firstName", nativeQuery=true)
//    List<Author> getAuthorsByFirstName(String firstName)
	
	
	
//	@Query("select u from StudentModel u where u.schoolfees=:schoolfees")
//	List<StudentModel>findByschoolfees(@Param("schoolfees")String schoolfess);
////	
//	StudentModel findByschoolfees();

	//Stream<StudentModel> findByschoolfees();

}




//@Query("select u from EmployeeModel u where u.empname=:empname")
//List<EmployeeModel>findByempname(@Param("empname") String empname);
