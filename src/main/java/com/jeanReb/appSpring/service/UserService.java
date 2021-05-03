package com.jeanReb.appSpring.service;

import com.jeanReb.appSpring.Exceptions.UsernameOrIdNotFound;

import com.jeanReb.appSpring.entity.User;

public interface UserService {

	public Iterable<User> getAllUsers();
	
	public User createUser(User user) throws Exception;
	
	public User getUserById(Long id) throws Exception;

	public User updateUser(User user) throws Exception;
	
	public void deleteUser(Long id) throws UsernameOrIdNotFound;
	
	

	public User getLoggedUser() throws Exception;
}

