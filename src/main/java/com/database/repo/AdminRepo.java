package com.database.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.database.model.Admin;

@Repository
public interface AdminRepo extends CrudRepository<Admin, Long> {
	
	

}
