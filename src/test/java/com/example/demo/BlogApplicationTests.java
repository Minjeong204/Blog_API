package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.model.User;
import com.example.demo.repository.Userrepository;

@SpringBootTest
class BlogApplicationTests {
	@Autowired
	private Userrepository userRepository;
	@Test
	void contextLoads() {
		User user = new User();
		User user2 = userRepository.findByUserIdAndPassword("anjell0204","mark0809*");
		System.out.println(user2);
	}

}
