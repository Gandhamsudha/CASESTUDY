package com.carwash.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.carwash.demo.Pojo.AddVehiclePojo;
import com.carwash.demo.Pojo.RegistrationPojo;
import com.carwash.demo.Repository.RegistrationRepo;
//@CrossOrigin(origins = "http://localhost:4200")
@Controller
public class RegistrationController {
	@Autowired
   private 	RegistrationRepo repo;
	
	@PostMapping("/adduser")
	public  String addUser(@RequestBody RegistrationPojo regis) 
	{
		System.err.println(regis);
		repo.save(regis);
		return "Sucessfully";
	}
	@GetMapping("/login")
	public boolean validateUser(@RequestBody RegistrationPojo userlog) {

	System.out.println(userlog);
		List<RegistrationPojo> login=repo.findAll();
		System.out.println(login);
		for(RegistrationPojo dblog:login) {
			if(dblog.getEmail().equals(userlog.getEmail())&&dblog.getPassword().equals(userlog.getPassword())) {
				return true;
		}
	}
		return false;
	}

}
