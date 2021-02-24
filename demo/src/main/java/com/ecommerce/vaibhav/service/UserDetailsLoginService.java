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
			
			details.get(0).setBrand(userdetails.getBrand());
			details.get(0).setImeinumber(userdetails.getImeinumber());
			details.get(0).setManifacturer(userdetails.getManifacturer());
			details.get(0).setModelnumber(userdetails.getModelnumber());
			details.get(0).setSdk(userdetails.getSdk());
			details.get(0).setVersioncode(userdetails.getVersioncode());
			
			
			loginusers.saveAll(details);
		
	
		}else
		{
			UserLoginDao userlogin =new UserLoginDao();
			userlogin.setUsername(userdetails.getUsername());
			userlogin.setIslogin(true);
			userlogin.setLogintime(new Date());
			userlogin.setMobiletype(userdetails.getMobiletype());

			userlogin.setBrand(userdetails.getBrand());
			userlogin.setImeinumber(userdetails.getImeinumber());
			userlogin.setManifacturer(userdetails.getManifacturer());
			userlogin.setModelnumber(userdetails.getModelnumber());
			userlogin.setSdk(userdetails.getSdk());
			userlogin.setVersioncode(userdetails.getVersioncode());
			
	loginusers.save(userlogin)	;	
		}
		
	}

}
