package com.example.demo.model;

import java.time.LocalDateTime;

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
@Table(name = "blog")
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Post {
	@Id
	@Column(name = "POST_ID")
	private int PostId;

	@Column(name = "title")
	private String title;

	@Column(name = "CATEGORY")
	private String category;
	
	@Column(name = "CONTENT")
	private String content;

	@Column(name = "USE_YN")
	private String useYn;

	@Column(name = "REGI_USER")
	private String regiUser;

	@Column(name = "REGI_DT")
	private LocalDateTime regiDt;

	@Column(name = "UPDA_DT")
	private LocalDateTime updaDt;

}
