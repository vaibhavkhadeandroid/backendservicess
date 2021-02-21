package com.ecommerce.vaibhav.controller;

import java.util.ArrayList;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.vaibhav.customresponce.AddProductResponce;
import com.ecommerce.vaibhav.model.addproducts.UploadProductsDao;
import com.ecommerce.vaibhav.model.addproducts.UploadProductsDto;
import com.google.common.collect.Lists;
import antlr.collections.List;
import com.ecommerce.vaibhav.service.UploadProductService;

@RestController
@CrossOrigin
public class ProductController {
	
	@Autowired
	UploadProductService UploadProductService;
	
	@PostMapping(value = "/addproduct")
	public ResponseEntity<Object>   addProduct(@RequestBody UploadProductsDto uploadProductsDto ) {
		
	String msg=	UploadProductService.saveOrUpdateProductToDB(uploadProductsDto);
	
	
	AddProductResponce loginResponse = new AddProductResponce("sucess",msg);
	return new ResponseEntity<Object>(loginResponse, HttpStatus.OK);
	

		
	}
	
	@GetMapping(value = "/getallproducts")
	public ArrayList<UploadProductsDao> getProductList() {
		
	Iterable<UploadProductsDao> iterator = UploadProductService.getAllProduct();
	 
	  
	ArrayList<UploadProductsDao> myList = Lists.newArrayList(iterator);
	
return myList;
}
}
