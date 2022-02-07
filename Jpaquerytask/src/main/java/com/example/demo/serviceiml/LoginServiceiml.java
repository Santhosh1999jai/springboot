package com.example.demo.serviceiml;

import org.springframework.stereotype.Service;

import com.example.demo.service.LoginService;


@Service
public class LoginServiceiml implements LoginService{

	@Override
	public boolean sendEmail(String toEmailId, String subject, String content) {
		// TODO Auto-generated method stub
		return false;
	}

}
