package com.example.demo.service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;
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
		List<Post> posts = postrepository.findByUseYnAndCategory("Y", category);
		return posts;
	}

	public void delete(Post post) {
		int id = post.getPostId();
		postrepository.deleteById(id);
	}

	public Post find(Post post) {
		int id = post.getPostId();
		System.out.println(postrepository.findById(id));
		return postrepository.findById(id);
	}

	public Post update(Post post) {
		Post post2 = postrepository.findById(post.getPostId());
		post2.setCategory(post.getCategory());
		post2.setContent(post.getContent());
		post2.setTitle(post.getTitle());
		post2.setUseYn(post.getUseYn());
		post2.setUpdaDt(LocalDateTime.now());

		return postrepository.save(post2);
	}
}
