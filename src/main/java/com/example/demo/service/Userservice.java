package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.User;
import com.example.demo.repository.Userrepository;
@Service
public class Userservice {
	@Autowired
	private Userrepository userRepository;
	public User add(User user) {
		return userRepository.save(user);
	}
	public User login(User user) {
		return userRepository.findByUserIdAndPassword(user.getUserId(),user.getPassword());
	}

}
