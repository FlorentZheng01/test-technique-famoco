package com.app.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "user2")
public class User {

	
	public User(String email, String firstname, String lastname, String userId) {
		super();
		this.userId = userId;
		this.firstname = firstname;
		this.email = email;
		this.lastname = lastname;
	}
	

	public String getUserId() {
		return userId;
	}

	public String getFirstname() {
		return firstname;
	}

	public String getEmail() {
		return email;
	}

	public String getLastname() {
		return lastname;
	}

	@Id
	@GeneratedValue
	private Integer id;
	@Column(length = 15, name = "userid")
	private String userId;
	@Column(length = 15, name = "firstname")
	private String firstname;
	@Column(length = 20, name = "email")
	private String email;
	@Column(length = 15, name = "lastname")
	private String lastname;


}
