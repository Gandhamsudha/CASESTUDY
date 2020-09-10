package com.carwash.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.carwash.demo.Pojo.DailyTasksPojo;
import com.carwash.demo.Repository.DailyTasksRepo;

//@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class DailyTasksController {
	@Autowired
	DailyTasksRepo  repo;
	
	@GetMapping("/getallusers")
	public
	List<DailyTasksPojo> getAllUser(){
		return repo.findAll();
		}
}
