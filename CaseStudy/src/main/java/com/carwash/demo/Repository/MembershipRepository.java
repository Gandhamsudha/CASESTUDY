package com.carwash.demo.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.carwash.demo.Pojo.MembershipPojo;


public interface MembershipRepository extends MongoRepository<MembershipPojo,String> {

}
