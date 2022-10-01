package com.metacube.demo.dao;

import org.springframework.beans.factory.annotation.Autowired;

import com.metacube.demo.entities.User;

public class UserServiceImpl implements UserService{
	@Autowired
	private UserRespository userRepository;

	@Override
	public boolean existsByName(String name) {
		User u = findByName(name);
		return existsById(u.getId());
	}

	@Override
	public User save(User user) {
		return userRepository.save(user);
	}

	@Override
	public User findByName(String name) {
		return userRepository.findByName(name);
	}

	@Override
	public boolean existsById(long id) {
		return userRepository.existsById(id);
	}
	
	

}
