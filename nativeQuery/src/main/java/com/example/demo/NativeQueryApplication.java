package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.scheduling.annotation.EnableScheduling;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
@EnableScheduling
@EntityScan( basePackages = {"com.example.demo"} )
public class NativeQueryApplication {

	public static void main(String[] args) {
		SpringApplication.run(NativeQueryApplication.class, args);
	}

}
