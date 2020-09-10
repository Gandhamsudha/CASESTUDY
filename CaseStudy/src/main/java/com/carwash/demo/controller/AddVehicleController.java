package com.carwash.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.carwash.demo.Pojo.AddVehiclePojo;
import com.carwash.demo.Repository.AddVehicleRepo;

//@CrossOrigin(origins="http://localhost:4200")
@RestController
public class AddVehicleController {
	@Autowired
	private AddVehicleRepo repo;
	
	@PostMapping("/vehicleadd")
	public String addvehicle(@RequestBody AddVehiclePojo vehicle)
	{
		System.err.println(vehicle);
      
		repo.save(vehicle);
		return "added vehicle successfully";
	}
	
	@GetMapping("/user/all")
	public List<AddVehiclePojo> getRegistration() {
		return repo.findAll();
	}
}
