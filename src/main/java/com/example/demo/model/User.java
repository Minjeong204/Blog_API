package com.example.demo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@Entity
@Table(name = "users")
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class User {

	@Column(name = "name")
	private String name;

	@Id
	@Column(name = "USERID")
	private String userId;

	@Column(name = "password")
	private String password;

	

}
