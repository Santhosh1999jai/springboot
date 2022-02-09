package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@PropertySource("classpath:Response.properties")
public class ReposeEntityCrudApplication {

	public static void main(String[] args) {
		SpringApplication.run(ReposeEntityCrudApplication.class, args);
	}

}
