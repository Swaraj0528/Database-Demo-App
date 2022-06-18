package com.database.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.database.service.AdminService;

@RestController
public class AdminContoller {
	
	@Autowired
	AdminService adminService;
	
	@GetMapping("/admin")
	public String addAdmin() {
		
		Admin admin = new Admin();
		admin.setEmail("abc@xyz.com");
		admin.setPassoword("1234");
		adminService.saveAdminData(admin);
		return "admin addded";
		
	}
}
