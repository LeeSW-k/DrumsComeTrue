package com.example.drumcomestrue.db.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@Table(name= "user")
@Getter
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long userPk;

	@Column(unique = true)
	private String userId;

	@Column
	private String userName;

	@Column
	private String userPw;

	@Column
	private String phoneNumber;

	@OneToMany(mappedBy="user", cascade = CascadeType.ALL)
	private List<Sheet> sheetList = new ArrayList<Sheet>();

	@Builder
	public User(long userPk, String userId, String userName, String userPw, String phoneNumber) {
		this.userPk = userPk;
		this.userId = userId;
		this.userName = userName;
		this.userPw = userPw;
		this.phoneNumber = phoneNumber;
	}
}
