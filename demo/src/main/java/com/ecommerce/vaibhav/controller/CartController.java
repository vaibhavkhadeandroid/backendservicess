package com.ecommerce.vaibhav.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.vaibhav.model.cart.UserCartIemsDto;



@RestController
public class CartController {
	
	
	@Autowired
	com.ecommerce.vaibhav.service.AddToCartService AddToCartService;
	
	@PostMapping(value = "/addorupdatetocart")
	public String addToCart(  @RequestBody UserCartIemsDto cartitems) {
		
		
		
		
		
		AddToCartService.addOrUpdateToCartDB(cartitems);
		
		return "ighg";
		
	}

}
