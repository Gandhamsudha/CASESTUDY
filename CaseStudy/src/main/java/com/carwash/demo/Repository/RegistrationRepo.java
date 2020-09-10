package com.carwash.demo.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.carwash.demo.Registration;
import com.carwash.demo.Pojo.RegistrationPojo;

public interface RegistrationRepo extends MongoRepository<RegistrationPojo,String> {

}
