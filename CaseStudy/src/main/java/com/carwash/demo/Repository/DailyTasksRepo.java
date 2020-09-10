package com.carwash.demo.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.carwash.demo.Pojo.DailyTasksPojo;

public interface DailyTasksRepo extends MongoRepository<DailyTasksPojo,String> {

}
