package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.User;
import com.example.demo.service.Userservice;

@CrossOrigin("*")
@RestController
public class Usercontroller {
	@Autowired
	private Userservice userService;

	@PostMapping(path = "/regi")
	public ResponseEntity<Object> regist(@RequestBody User user) {
		System.out.println(user);

		userService.add(user);

		return new ResponseEntity<Object>(HttpStatus.OK);
	}

	@PostMapping(path = "/login")
	public ResponseEntity<Object> signin(@RequestBody User user) {
		User entity = userService.login(user);
		return new ResponseEntity<Object>(entity, HttpStatus.OK);
	}
}
