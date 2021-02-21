package com.ecommerce.vaibhav.repository;


import org.springframework.data.repository.CrudRepository;

import com.ecommerce.vaibhav.model.cart.UserCartIemsDao;

public interface AddToCartRepository extends CrudRepository <UserCartIemsDao, Integer> {
UserCartIemsDao  findByUserid(long userid);
 
 
}
