package com.example.demo.serviceIml;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.demo.dto.BookDto;
import com.example.demo.dto.MessageReponse;
import com.example.demo.model.BookModel;
import com.example.demo.repo.BookRepo;
import com.example.demo.service.BookService;

@Service
public class BookServiceIml implements BookService{
	
	@Autowired
    Environment env;
	
	@Autowired
	BookRepo bookrepo;

	@Override
	public ResponseEntity<?> save(BookDto bookdto) {
		try {
			
		BookModel obj=BookModel.builder().bookid(bookdto.getBookid())
				.bookname(bookdto.getBookname()).location(bookdto.getLocation())
				.price(bookdto.getPrice()).build();
		
	  obj=bookrepo.save(obj);
	  
	  return ResponseEntity.ok(new MessageReponse("Success",HttpStatus.OK.value(),obj));
	    
		}
		catch(Exception e) {
			return ResponseEntity.ok( new MessageReponse(env.getProperty("errormessage"),HttpStatus.BAD_REQUEST.value()));
		}
	}
	//return ResponseEntity.ok(new MessageResponse(env.getProperty("errorid"),HttpStatus.BAD_REQUEST.value()));

	@Override
	public ResponseEntity<?> update(BookDto bookdto) {
		try {
		BookModel model=bookrepo.findBybookid(bookdto.getBookid());
		BookModel model1=BookModel.builder().bookid(model.getBookid()).bookname(bookdto.getBookname())
				.location(bookdto.getLocation()).price(bookdto.getPrice()).build();
		
		
		
		
		model1=bookrepo.save(model1);
			
		return ResponseEntity.ok(new MessageReponse("Sucess",HttpStatus.OK.value(),model1));
	}
	catch(Exception e) {
		return ResponseEntity.ok(new MessageReponse(env.getProperty("updateerror"),HttpStatus.BAD_REQUEST.value()));
	}
	}

	@Override
	public List<BookModel> getall() {
		
		 List<BookModel>get=bookrepo.findAll();
		return get;
	}

	@Override
	public ResponseEntity<?> findbyid(BookDto bookdto) {
		try
		{
		BookModel bookmodel= bookrepo.findBybookd(bookdto.getBookid());
		
		BookModel objjjj=BookModel.builder().bookid(bookmodel.getBookid()).build();
	

		
		return ResponseEntity.ok(new MessageReponse("Sucess",HttpStatus.OK.value(),bookmodel));	
		}
		catch(Exception e) {
			return ResponseEntity.ok(new MessageReponse(env.getProperty("updateerror"),HttpStatus.BAD_REQUEST.value()));

		}
		}
	@Override
	public String delete(int bookid) {
		bookrepo.deleteById(bookid);
		return "sucessfully deleted";
	}

	
	
	
	

	
}