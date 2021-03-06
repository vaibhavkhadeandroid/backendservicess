package com.ecommerce.vaibhav.controller;
import java.net.http.HttpHeaders;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.DisabledException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.vaibhav.config.JwtTokenUtil;
import com.ecommerce.vaibhav.customresponce.LoginResponce;
import com.ecommerce.vaibhav.model.LogoutResponce;
import com.ecommerce.vaibhav.model.UserLoginDto;
import com.ecommerce.vaibhav.model.UserLogoutDto;
import com.ecommerce.vaibhav.service.JwtUserDetailsService;
import com.ecommerce.vaibhav.service.UserDetailsLoginService;
import com.ecommerce.vaibhav.service.UserLogoutService;
@RestController
@CrossOrigin()
public class EmployeeController {

	@Autowired
	private AuthenticationManager authenticationManager;

	
	@Autowired
	UserDetailsLoginService userloginservice;
	

	@Autowired
	private JwtTokenUtil jwtTokenUtil;

	@Autowired
	private JwtUserDetailsService userDetailsService;
	
	@Autowired
	private UserLogoutService userLogoutService;
	
    @RequestMapping(value = "/greeting", method = RequestMethod.GET)
    public String getEmployees() {
    
    	
    	
    	
        return "Welcome!";
    }
    

    @PostMapping(value = "/login")
    public ResponseEntity<Object>  getLogin(@RequestBody UserLoginDto userdetails ){
    	
    	
    	userloginservice.updateLoginDetails(userdetails);
 	
    	
    	try {
			authenticate(userdetails.getUsername(),userdetails.getPassword());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		final UserDetails userDetails = userDetailsService.loadUserByUsername(userdetails.getUsername());

		final String token = jwtTokenUtil.generateToken(userDetails);

		
		
		
		
		
		
		LoginResponce loginResponse = new LoginResponce("sucess","no error",userDetails,token);
		return new ResponseEntity<Object>(loginResponse, HttpStatus.OK);
		
		
		
	
    }
    
    @PostMapping(value = "/userlogout")
    public   ResponseEntity<Object>  logoutUser(@RequestBody UserLogoutDto userdetails) {
    	
    String result	=	userLogoutService.changeloginstatus(userdetails);
    	
    	if(result=="succesfull") {
    		
    		LogoutResponce loutoutResponce=new LogoutResponce("succesfull", result);
    		return  new ResponseEntity<Object>(loutoutResponce, HttpStatus.OK);
    	}else {
    		LogoutResponce loutoutResponce=new LogoutResponce("fail", "fail");
    		return	new ResponseEntity<Object>(loutoutResponce, HttpStatus.OK);
		}
    }
    
    private void authenticate(String username, String password) throws Exception {
		try {
			authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(username, password));
		} catch (DisabledException e) {
			throw new Exception("USER_DISABLED", e);
		} catch (BadCredentialsException e) {
			throw new Exception("INVALID_CREDENTIALS", e);
		}
	}
}