package com.carwash.demo.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.carwash.demo.Pojo.PaymentPojo;

public interface PaymentRepo extends MongoRepository<PaymentPojo,String> {

}
