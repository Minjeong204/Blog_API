package com.example.demo.service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Post;
import com.example.demo.repository.Postrepository;

@Service
public class Postservice {
	@Autowired
	private Postrepository postrepository;

	public List<Post> view() {
		List<Post> posts = postrepository.findByUseYn("Y");
		return posts;
	}

	public Post regi(Post post) {
		Random random = new Random(); // 랜덤 객체 생성(디폴트 시드값 : 현재시간)
		LocalDateTime date = LocalDateTime.now();
		post.setRegiDt(date);
		post.setPostId(random.nextInt(900));
		return postrepository.save(post);
	}

	public List<Post> diary(String category) {
		List<Post> posts = postrepository.findByCategory(category);
		return posts;
	}
}
