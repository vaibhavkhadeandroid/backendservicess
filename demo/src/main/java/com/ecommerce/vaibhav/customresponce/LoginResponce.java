package com.ecommerce.vaibhav.customresponce;


import org.springframework.security.core.userdetails.UserDetails;

public class LoginResponce {
	
private	String status;
private	String errormessage;
private UserDetails userDetails;
private String authenticationtoken;
public LoginResponce(String status, String errormessage, UserDetails userDetails, String authenticationtoken) {
	super();
	this.status = status;
	this.errormessage = errormessage;
	this.userDetails = userDetails;
	this.authenticationtoken = authenticationtoken;
}
public String getStatus() {
	return status;
}
public void setStatus(String status) {
	this.status = status;
}
public String getErrormessage() {
	return errormessage;
}
public void setErrormessage(String errormessage) {
	this.errormessage = errormessage;
}
public UserDetails getUserDetails() {
	return userDetails;
}
public void setUserDetails(UserDetails userDetails) {
	this.userDetails = userDetails;
}
public String getAuthenticationtoken() {
	return authenticationtoken;
}
public void setAuthenticationtoken(String authenticationtoken) {
	this.authenticationtoken = authenticationtoken;
}


}
