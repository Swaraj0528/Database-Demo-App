package com.database.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.database.model.Company;
import com.database.model.Employee;
import com.database.repo.CompanyRepo;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
public class CompanyController {
	
	@Autowired
	CompanyRepo companyRepo;
	
	@GetMapping("/saveEmp")
	public String saveEmployeeData() {
		
		Employee e = Employee.builder().name("Tanjiro").build();
		log.info("Employee:{}",e);
		Company com = Company.builder().department("IT").emp(e).build();
		log.info("Company Details:{}",com);
		Company save = companyRepo.save(com);
		if(save!=null)
		return "Successfull";
		else {
			return "Data not persisted";
		}
	}

}
