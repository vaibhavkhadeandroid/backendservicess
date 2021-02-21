package com.ecommerce.vaibhav.customresponce;

public class AddProductResponce {
	

	private	String status;
	private	String errormessage;
	public AddProductResponce(String status, String errormessage) {
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
