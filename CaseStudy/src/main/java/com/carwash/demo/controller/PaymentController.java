package com.carwash.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.carwash.demo.Pojo.PaymentPojo;
import com.carwash.demo.Repository.PaymentRepo;




@RestController
public class PaymentController {
	
	@Autowired
	PaymentRepo repository;
	
	//Random rand = new Random();
	
  @PostMapping("/payment1")
	public String InsertCustomer(@RequestBody PaymentPojo payment) 
  {
		 //int code=rand.nextInt(100000);
		// customer.setCouponCode(code);
	     System.out.println(payment);
		repository.save(payment);
		 return "Payment successfully paid";
		 
        
	}
//	 @GetMapping("/username")
//	  public Optional<Customer> findCoupon(@RequestBody Customer customer ) {
//	  String username=customer.getUsername();
//		return repository.findById(username);
//	   
//	  }
//	

}

