package com.example.demo.dto;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class StudentDto {
	private int studentid;
	private String name;
	private String schoolfees;
	private String address;
	private String location;
	private Date time;

}
