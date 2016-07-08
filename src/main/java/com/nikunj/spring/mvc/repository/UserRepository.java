package com.nikunj.spring.mvc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nikunj.spring.mvc.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{

	public User findByName(String name);
}
