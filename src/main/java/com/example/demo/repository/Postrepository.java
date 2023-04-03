package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Post;

@Repository
public interface Postrepository extends JpaRepository<Post, Integer>, PostRepositoryCustom {
	public List<Post> findByUseYn(String UseYn);
	public List<Post> findByUseYnAndCategory(String UseYn,String category);
	public Post findByTitle(String Title);
	public Post findById(int id);
}
