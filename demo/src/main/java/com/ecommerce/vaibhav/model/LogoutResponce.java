package com.ecommerce.vaibhav.model;

public class LogoutResponce {
	
	
	private	String status;
	private	String errormessage;
	
	
	
	public LogoutResponce(String status, String errormessage) {
		super();
		this.status = status;
		this.errormessage = errormessage;
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
	
	
	
	

}
