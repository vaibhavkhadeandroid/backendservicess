package com.ecommerce.vaibhav.service;

import java.util.ArrayList;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.vaibhav.model.UserLoginDao;
import com.ecommerce.vaibhav.model.UserLoginDto;
import com.ecommerce.vaibhav.repository.UserLoginRepository;

@Service
public class UserDetailsLoginService  {
	
	@Autowired
	UserLoginRepository loginusers;
	
	
	public void updateLoginDetails(UserLoginDto userdetails) {
		
		ArrayList <UserLoginDao> details=	loginusers.findByUsername(userdetails.getUsername());
		if(!details.isEmpty()&&details.size()>=0) {
			details.get(0).setLogintime(new Date());
			details.get(0).setMobiletype(userdetails.getMobiletype());
			
			loginusers.saveAll(details);
		
	
		}else
		{
			UserLoginDao userlogin =new UserLoginDao();
			userlogin.setUsername(userdetails.getUsername());
			userlogin.setIslogin(true);
			userlogin.setLogintime(new Date());
			userlogin.setMobiletype(userdetails.getMobiletype());
			
	loginusers.save(userlogin)	;	
		}
		
	}

}
