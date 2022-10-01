package com.metacube.demo.dao;

import org.springframework.data.repository.query.Param;
import com.metacube.demo.entities.User;

public interface UserService {
	public boolean existsByName(String name);
	public User save(User user);
	public User findByName(@Param("name") String name);
	public boolean existsById(long id);
	
}
