package com.ecommerce.vaibhav.service;


import java.util.ArrayList;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.vaibhav.model.UserLoginDao;
import com.ecommerce.vaibhav.model.UserLogoutDto;
import com.ecommerce.vaibhav.repository.UserLoginRepository;
@Service
public class UserLogoutService {
	
	@Autowired
	UserLoginRepository loginusers;
	
	public String  changeloginstatus(UserLogoutDto userdetails) {
		
		ArrayList <UserLoginDao> details=	loginusers.findByUsername(userdetails.getUsername().toString());
		
		
		if(!details.isEmpty()&&details.size()>=0&&details.get(0).getIslogin()) {
			
			details.get(0).setIslogin(false);
			details.get(0).setLogintime(new Date());
			loginusers.saveAll(details);
			return "succesfull";
			
		}else {
			
			return "fail";
		}
	}

}
