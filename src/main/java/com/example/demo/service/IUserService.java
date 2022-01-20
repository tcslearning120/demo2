package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.UserRepositery;
import com.example.demo.entity.User;
@Service
public class IUserService {
	@Autowired // DI
	UserRepositery userRepository;
	public void saveUser(User user) {
		userRepository.save(user);
	}

}