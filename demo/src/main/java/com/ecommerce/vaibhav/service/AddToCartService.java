package com.ecommerce.vaibhav.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.vaibhav.model.cart.UserCardProducsDao;
import com.ecommerce.vaibhav.model.cart.UserCartIemsDao;
import com.ecommerce.vaibhav.model.cart.UserCartIemsDto;
import com.ecommerce.vaibhav.repository.AddToCartRepository;
@Service
public class AddToCartService {
	
	@Autowired
	AddToCartRepository addtocart;
	Boolean isupdated= false;
	
	public String addOrUpdateToCartDB(UserCartIemsDto userCartIemsDao) {
		
	UserCartIemsDao usercartitems=	addtocart.findByUserid(userCartIemsDao.getUserid());
	if(usercartitems != null) {
List<UserCardProducsDao> njdvjkj	=	  usercartitems.getProducts();
		
		for(UserCardProducsDao jndj:njdvjkj) {
			
		if(	jndj.getProductid()==userCartIemsDao.getProductid()) {
			
			
			jndj.setQuantity(userCartIemsDao.getQuantity());	
			usercartitems.setProducts(njdvjkj);
			addtocart.save(usercartitems);
			
			isupdated=true;
		}
		
		
			
		}
		if(!isupdated) {
			
			UserCardProducsDao	newcarditem=	new UserCardProducsDao();
			newcarditem.setProductid(userCartIemsDao.getProductid());
			newcarditem.setQuantity(userCartIemsDao.getQuantity());
			
			njdvjkj.add(newcarditem);
			usercartitems.setProducts(njdvjkj);
			addtocart.save(usercartitems);
			
			isupdated=false;
		}
		
		
	}
	
	else {
		UserCartIemsDao hggh=new UserCartIemsDao();
		
		hggh.setUserid(userCartIemsDao.getUserid());
		hggh.setUsername(userCartIemsDao.getUsername());
		
		List<UserCardProducsDao> gghgh=new ArrayList<UserCardProducsDao>();
		
		UserCardProducsDao gfggghgg=	new UserCardProducsDao();
		gfggghgg.setProductid(userCartIemsDao.getProductid());
		gfggghgg.setQuantity(userCartIemsDao.getQuantity());
		
		gghgh.add(gfggghgg);
		hggh.setProducts(gghgh);
		addtocart.save(hggh);
	}
		return "okkkk";
		
	}

}
