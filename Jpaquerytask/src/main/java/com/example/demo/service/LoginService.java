package com.example.demo.service;

import org.springframework.stereotype.Service;

@Service
public interface LoginService {
	
	public boolean sendEmail(String toEmailId, String subject, String content);


}
