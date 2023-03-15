package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.User;

@Repository
public interface Userrepository extends JpaRepository<User, String> {
	public User findByUserIdAndPassword(String userId, String password);
}
