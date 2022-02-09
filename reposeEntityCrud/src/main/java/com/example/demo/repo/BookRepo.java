package com.example.demo.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.demo.model.BookModel;


@Repository
public interface BookRepo extends JpaRepository<BookModel, Integer>{
	@Query("select u from BookModel u where u.bookid=:bookid")
	BookModel findBybookid(@Param("bookid") int bookid);
	

	@Query("select u from BookModel u where u.bookid=:bookid")
	BookModel findBybookd(@Param("bookid") int bookid);
	}


//@Query("SELECT u from SalaryModel u WHERE u.salary>=:salary ")
//List<SalaryModel> FindBysalary(@Param("salary") int salary);