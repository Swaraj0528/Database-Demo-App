package com.database.controller;

import org.mindrot.jbcrypt.BCrypt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.database.model.Admin;
import com.database.repo.AdminRepo;
import com.database.service.AdminService;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
public class AdminContoller {
	
	@Autowired
	AdminService adminService;
	@Autowired
	AdminRepo adminRepo;
	
	@GetMapping("/admin")
	public String addAdmin() {
		
		Admin admin = new Admin();
		log.info("Here addAdmin Method Starts");
		//admin.setEmail("Hello@gmail.com");
		//admin.setPassoword(hashPassword("Admin123"));
		//adminService.saveAdminData(admin);
		Admin findById = adminRepo.SearchByEmail("Hello@gmail.com");
		log.info("Admin User Name:{}",findById.getEmail());
		checkPass("Admin123",findById.getPassoword());
		return "admin addded";
		
	}
	
	
	private String hashPassword(String plainTextPassword){
		return BCrypt.hashpw(plainTextPassword, BCrypt.gensalt());
	}
	
	private void checkPass(String plainPassword, String hashedPassword) {
		if (BCrypt.checkpw(plainPassword, hashedPassword))
			System.out.println("The password matches.");
		else
			System.out.println("The password does not match.");
	}
	
	
}
