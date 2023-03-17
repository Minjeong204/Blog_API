package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.model.User;
import com.example.demo.repository.Userrepository;
import com.example.demo.service.Postservice;
import com.example.demo.service.Userservice;

@SpringBootTest
class BlogApplicationTests {
	@Autowired
	private Userrepository userRepository;
	@Autowired
	private Postservice postservice;

	@Test
	void contextLoads() {

		System.out.println(postservice.view().get(0).getPostId());
	}

}
