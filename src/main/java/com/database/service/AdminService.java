package com.database.service;

import org.springframework.stereotype.Service;

import com.database.model.Admin;

@Service
public interface AdminService {
	
	public Admin saveAdminData(Admin admin);
	

}
