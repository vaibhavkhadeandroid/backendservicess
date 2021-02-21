package com.ecommerce.vaibhav.model.cart;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity 
public class UserCartIemsDao {
	
	
	@Id
	private long userid;
	@Column
	private String username;
	

    @ElementCollection  
   
    private List<UserCardProducsDao  > products=new ArrayList<UserCardProducsDao>();  
	
	
	
	
	public long getUserid() {
		return userid;
	}
	public void setUserid(long userid) {
		this.userid = userid;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public List<UserCardProducsDao  > getProducts() {
		return products;
	}
	public void setProducts(List<UserCardProducsDao  > products) {
		this.products = products;
	}

}
