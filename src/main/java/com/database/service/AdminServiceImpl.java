package com.database.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.database.model.Admin;
import com.database.repo.AdminRepo;

@Service
public class AdminServiceImpl implements AdminService {

	@Autowired
	AdminRepo adminRepo;
	
	@Override
	public Admin saveAdminData(Admin admin) {
		
		Admin save = adminRepo.save(admin);
		
		
		return save;
	}

}
