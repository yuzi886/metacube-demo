package com.metacube.demo.dao;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.metacube.demo.entities.User;


public interface UserRespository extends CrudRepository<User, Long> {
	@Query("SELECT e FROM User e WHERE e.name =:names")
	User findByName(@Param("names") String names);
	
	

}
