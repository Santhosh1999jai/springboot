package com.example.demo.serviceiml;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import com.example.demo.dto.StudentDto;
import com.example.demo.model.StudentModel123;
import com.example.demo.repo.StudentRepo;
import com.example.demo.service.StudentService;

@Service
public class StudentServiceiml implements StudentService {

	@Autowired
	StudentRepo studentrepo;

	@Override
	public ResponseEntity<?> save(StudentDto studentdto) {

		StudentModel123 model = StudentModel123.builder().name(studentdto.getName()).address(studentdto.getAddress())
				.time(studentdto.getTime()).location(studentdto.getLocation()).schoolfees(studentdto.getSchoolfees())
				.build();

		studentrepo.save(model);

		return ResponseEntity.ok(model);
	}

	@Override
	@Scheduled(cron = "*/10 * * * * *")
	public ResponseEntity<?> getall() {
		List<StudentModel123> model = studentrepo.findAll();

		Stream<StudentModel123> studentstream = model.stream();
		Stream<StudentModel123> filterstudent = studentstream.filter(m -> m.getSchoolfees().equals("notpaid"));
//		Stream<String>mapstream=
		Stream<Object> mapstream = filterstudent
				.map(m -> new StudentModel123(m.getName(), m.getLocation(), m.getAddress(), m.getSchoolfees()));
		mapstream.forEach(System.out::println);
		return null;
	}

	@Override
	public List<StudentModel123> getbystudentname(StudentDto studentdto ) {
		
		List<StudentModel123>model=studentrepo.getbyname(studentdto.getName());
		return model;
	}

}
