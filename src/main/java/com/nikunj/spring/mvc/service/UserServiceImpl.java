package com.nikunj.spring.mvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.nikunj.spring.mvc.model.User;
import com.nikunj.spring.mvc.repository.UserRepository;

@Service
@Transactional(readOnly = true)
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserRepository repository;

	@Override
	public User findById(long id) {
		return repository.findOne(id);
	}

	@Override
	public User findByName(String name) {
		return repository.findByName(name);
	}

	@Override
	@Transactional
	public void saveUser(User user) {
		repository.saveAndFlush(user);
		
	}

	@Override
	@Transactional
	public void updateUser(User user) {
		repository.saveAndFlush(user);
		
	}

	@Override
	@Transactional
	public void deleteUserById(long id) {
		repository.delete(id);
		
	}

	@Override
	public List<User> findAllUsers() {
		return repository.findAll();
	}

	@Override
	@Transactional
	public void deleteAllUsers() {
		repository.deleteAll();
		
	}

	@Override
	public boolean isUserExist(User user) {
		return repository.exists(user.getId());
	}

}
