package com.ibm.bean;

public class User {
	String userName, email, contact, password;

	public User(String userName, String email, String contact, String password) {
		this.userName = userName;
		this.email = email;
		this.contact = contact;
		this.password = password;
	}

	public User(String userName, String password) {
		this.userName = userName;
		this.password = password;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
