package com.ecommerce.vaibhav.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.ecommerce.vaibhav.model.UserDao;
import com.ecommerce.vaibhav.model.UserDto;
import com.ecommerce.vaibhav.repository.UserRepository;

import java.util.ArrayList;

@Service
public class JwtUserDetailsService implements UserDetailsService {
	@Autowired
	private UserRepository userDao;

	@Autowired
	private PasswordEncoder bcryptEncoder;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		UserDao user = userDao.findByUsername(username);
		if (user == null) {
			throw new UsernameNotFoundException("User not found with username: " + username);
		}
		return new org.springframework.security.core.userdetails.User(user.getUsername(), user.getPassword(),
				new ArrayList<>());
	}

	public UserDao save(UserDto user) {
		UserDao newUser = new UserDao();
		newUser.setUsername(user.getUsername());
		newUser.setPassword(bcryptEncoder.encode(user.getPassword()));		
	//	newUser.setPassword(user.getPassword());
		

		
		newUser.setEmailid(user.getEmailid());
		return userDao.save(newUser);
	}
	public Boolean checkEmailIdIsExist (String userName) {
	UserDao  user=	userDao.findByUsername(userName);
		if(user == null) {
			return false;
		}
		else {
			return true;
		}
		
	}
}