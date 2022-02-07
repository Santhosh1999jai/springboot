package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Data
@Table(name="login_table")
public class LoginModel {
	
	@Id
	@GeneratedValue
	private int id;
    private String name;
    private String email;
    private String password;
    private String phoneno;
    
}
