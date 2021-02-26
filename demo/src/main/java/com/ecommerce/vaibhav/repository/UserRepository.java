package com.ecommerce.vaibhav.repository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;



import com.ecommerce.vaibhav.model.UserDao;
public interface UserRepository extends CrudRepository<UserDao, Integer> {
    UserDao findByUsername(String username);
    UserDao findByEmailid(String emailid);
}