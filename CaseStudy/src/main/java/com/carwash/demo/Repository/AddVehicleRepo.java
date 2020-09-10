package com.carwash.demo.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.carwash.demo.Pojo.AddVehiclePojo;

public interface  AddVehicleRepo extends MongoRepository<AddVehiclePojo,String>{

}
