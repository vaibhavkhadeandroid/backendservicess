package com.ecommerce.vaibhav.repository;



import java.util.ArrayList;

import org.springframework.data.repository.CrudRepository;

import com.ecommerce.vaibhav.model.addproducts.UploadProductsDao;

public interface ProductReposirory extends CrudRepository <UploadProductsDao,Integer> {
	ArrayList<UploadProductsDao> findByProductid(long id);
	
	
	}
