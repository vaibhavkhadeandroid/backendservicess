package com.ecommerce.vaibhav.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.vaibhav.model.addproducts.UploadProductsDao;
import com.ecommerce.vaibhav.model.addproducts.UploadProductsDto;
import com.ecommerce.vaibhav.repository.ProductReposirory;
@Service
public class UploadProductService {

	@Autowired
	ProductReposirory products;
	

	
	public String saveOrUpdateProductToDB (  UploadProductsDto uploadProductsDto
	) {
		try {
		
			
			
			
	ArrayList<UploadProductsDao> productid=	products.findByProductid(Long.parseLong(uploadProductsDto.getProductid()));
		
		if(productid != null && productid.size()>0) {
			
			productid.get(0).setCostprice(uploadProductsDto.getCostprice());
			productid.get(0).setDiscount(uploadProductsDto.getDiscount());
			productid.get(0).setNumberofitem(uploadProductsDto.getNumberofitem());
			productid.get(0).setProductcatagory(uploadProductsDto.getProductcatagory());
			productid.get(0).setProductimageurl(uploadProductsDto.getProductimageurl());
			
			productid.get(0).setSize(uploadProductsDto.getSize());
			productid.get(0).setProductname(uploadProductsDto.getProductname());
			productid.get(0).setSellingprice(uploadProductsDto.getSellingprice());
			productid.get(0).setUolodeddate(uploadProductsDto.getUploadproductdate());
			products.saveAll(productid);
			
			return "Succesfully updated";
			
			
			
		}else {
			
			UploadProductsDao addproducts=new UploadProductsDao();
			addproducts.setCostprice(uploadProductsDto.getCostprice());
			addproducts.setDiscount(uploadProductsDto.getDiscount());
			addproducts.setNumberofitem(uploadProductsDto.getNumberofitem());
			addproducts.setProductcatagory(uploadProductsDto.getProductcatagory());
			addproducts.setProductimageurl(uploadProductsDto.getProductimageurl());
			
			addproducts.setSize(uploadProductsDto.getSize());
			addproducts.setProductname(uploadProductsDto.getProductname());
			addproducts.setSellingprice(uploadProductsDto.getSellingprice());
			addproducts.setUolodeddate(uploadProductsDto.getUploadproductdate());
			products.save(addproducts);
			return "Succesfully Added";
		}
			
		
		}catch (Exception e) {
			// TODO: handle exception
			
			e.printStackTrace();
		}
		return "okkk";
		
		
	}
	
	public Iterable<UploadProductsDao> getAllProduct(){
		
		
		return products.findAll();
		
	}
}
