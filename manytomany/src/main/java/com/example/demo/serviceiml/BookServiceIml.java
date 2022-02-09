package com.example.demo.serviceiml;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dto.BookDto;
import com.example.demo.model.BookModel;
import com.example.demo.model.StoreModel;
import com.example.demo.repo.BookRepo;
import com.example.demo.repo.StoreRepo;
import com.example.demo.service.BookService;

@Service
public class BookServiceIml implements BookService {

	@Autowired
	BookRepo bookrepo;

	@Autowired
	StoreRepo storerepo;

	@Override
	public BookModel save(BookDto bookdto) {
		BookModel model = new BookModel();
		model.setBookid(bookdto.getBookid());
		model.setBookname(bookdto.getBookname());

		StoreModel model1 = new StoreModel();
		model1.setStoreid(bookdto.getStoreid());
		model1.setStoremodel(bookdto.getStoremodel());

		model.getStore().add(model1);
		model1.getBookmodel().add(model);

		storerepo.save(model1);
		return bookrepo.save(model);
	}

	@Override
	public BookModel get(BookDto bookdto) {
		BookModel modell = bookrepo.findById(bookdto.getBookid()).get();

		return modell;
	}

	@Override
	public List<BookModel> getall() {
		List<BookModel> modelll = (List<BookModel>) bookrepo.findAll();
		return modelll;
	}

	@Override
	public BookModel findbtid(BookDto bookdto) {
		BookModel obj = bookrepo.findById(bookdto.getBookid()).get();

		StoreModel obj2 = StoreModel.builder().storeid(bookdto.getStoreid()).storemodel(bookdto.getStoremodel())
				.build();
//		StoreModel obj2=new StoreModel();
//		obj2.setStoreid(bookdto.getStoreid());
//		obj2.setStoremodel(bookdto.getStoremodel());
//		
		obj2.getBookmodel().add(obj);
		obj.getStore().add(obj2);

		storerepo.save(obj2);

		return obj;
	}

}