package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Post;
import com.example.demo.service.Postservice;

@CrossOrigin("*")
@RestController
public class Postcontroller {
	@Autowired
	private Postservice postservice;

	@PostMapping(path = "/regipost")
	public ResponseEntity<Object> regist(@RequestBody Post post) {
		System.out.println(post);
		postservice.regi(post);

		return new ResponseEntity<Object>(HttpStatus.OK);
	}

	@GetMapping(path = "/main")
	public ResponseEntity<Object> viewPost() {

		return new ResponseEntity<Object>(postservice.view(), HttpStatus.OK);
	}

	@GetMapping(path = "/blog/{category}")
	public ResponseEntity<Object> category1(@PathVariable("category") String category) {

		return new ResponseEntity<Object>(postservice.diary(category), HttpStatus.OK);
	}
}
