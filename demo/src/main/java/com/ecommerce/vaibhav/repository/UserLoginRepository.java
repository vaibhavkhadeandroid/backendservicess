package com.ecommerce.vaibhav.repository;

import java.util.ArrayList;

import org.springframework.data.repository.CrudRepository;

import com.ecommerce.vaibhav.model.UserLoginDao;

import antlr.collections.List;

public interface UserLoginRepository extends CrudRepository <UserLoginDao,Integer> {
ArrayList <UserLoginDao> findByUsername(String username);
 

}
