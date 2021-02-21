package com.ecommerce.vaibhav.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.OK)
public class Userallreadyexistexception extends RuntimeException {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1555L;

	public Userallreadyexistexception(String message) {
		super(message);
	}
}