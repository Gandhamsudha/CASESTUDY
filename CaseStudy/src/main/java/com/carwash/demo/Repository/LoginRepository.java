package com.carwash.demo.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.carwash.demo.Pojo.LoginPojo;

public interface LoginRepository extends MongoRepository<LoginPojo,String> {

}
