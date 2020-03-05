package com.kgisl.vehicleinsurance.model;

public class User {

	private int user_id;
	private String username;
	private String email;
	private String dob;
	private String phone_no;
	private String address;

	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}



	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getPhone_no() {
		return phone_no;
	}

	public void setPhone_no(String phone_no) {
		this.phone_no = phone_no;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public User(int user_id, String username, String email, String dob, String phone_no, String address) {
		super();
		this.user_id = user_id;
		this.username = username;
		this.email = email;
		this.dob = dob;
		this.phone_no = phone_no;
		this.address = address;
	}

	public User() {
		super();
	}

	@Override
	public String toString() {
		return "User [user_id=" + user_id + ", username=" + username + ", email=" + email + ", dob=" + dob + ", phone_no="
				+ phone_no + ", address=" + address + "]";
	}

}
