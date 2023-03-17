package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Post;
import com.example.demo.model.User;
@Repository
public interface Postrepository extends JpaRepository<Post, String> {
	public User findByUseYn(String UseYn);
}
