package com.carwash.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.carwash.demo.Pojo.MembershipPojo;
import com.carwash.demo.Repository.MembershipRepository;


//@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class MembershipController {
	@Autowired
	MembershipRepository membership ;
	
	
	@GetMapping("/{id}")
	public String getOneMembership(@PathVariable String id) {
		System.out.println(" coming from UI "+id);
		List<MembershipPojo> allMembershipFromDB=membership.findAll();
		System.out.println(allMembershipFromDB);
		for(MembershipPojo  member:allMembershipFromDB) {
			System.out.println(member.getMembershipName());
			if(member.getMembershipName().equalsIgnoreCase(id)) {
				return "Your MemberShip is"+member.getMembershipName()+"  "+member.getFreewash()+" "+member.getPolishing();
			}
		
		}

		
		return "Membership found......";
	}
}


