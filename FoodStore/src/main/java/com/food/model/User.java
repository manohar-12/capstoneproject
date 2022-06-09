package com.food.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="User")
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
private int id;

	@Column(name="fname")
private String fname;
    @Column(name="lname")
private String lname;

    @Column(name="email")
private String email;

    @Column(name="password")
private String password;

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getFname() {
	return fname;
}

public void setFname(String fname) {
	this.fname = fname;
}

public String getLname() {
	return lname;
}

public void setLname(String lname) {
	this.lname = lname;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

public String getPassword() {
	return password;
}

public void setPassword(String password) {
	this.password = password;
}

public User() {	
}
	public User(String fname,String lname,String email,String password) {
		super();
		this.email=email;
		this.password=password;
		this.fname=fname;
		this.lname=lname;
}
}