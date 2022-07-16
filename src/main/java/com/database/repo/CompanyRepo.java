package com.database.repo;

import org.springframework.data.repository.CrudRepository;

import com.database.model.Company;

public interface CompanyRepo extends CrudRepository<Company, Integer>{

}
