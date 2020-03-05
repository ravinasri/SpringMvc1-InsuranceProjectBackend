package com.kgisl.vehicleinsurance.model;

public class Policy {
	
	
	
	private String name;
	private String email;
	private String dob;
	private int phone_no;
	private String address;
	
	
	private int registration_number;
	private int chassis_number;
	private int engine_number;
	private String registration_place;
	private String manufacturing_year;
	private String vehicle_model;
	private String engine_capacity;
	private int seating_capacity;
	private String vehicle_color;

	
	private int user_id;
	private String policy_type;
	private String policy_plan;
	private String start_date;
	private String end_date;
	
	
	
	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	public String getPolicy_type() {
		return policy_type;
	}

	public void setPolicy_type(String policy_type) {
		this.policy_type = policy_type;
	}

	public String getPolicy_plan() {
		return policy_plan;
	}

	public void setPolicy_plan(String policy_plan) {
		this.policy_plan = policy_plan;
	}

	public String getStart_date() {
		return start_date;
	}

	public void setStart_date(String start_date) {
		this.start_date = start_date;
	}

	public String getEnd_date() {
		return end_date;
	}

	public void setEnd_date(String end_date) {
		this.end_date = end_date;
	}
	
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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

	public int getPhone_no() {
		return phone_no;
	}

	public void setPhone_no(int phone_no) {
		this.phone_no = phone_no;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getRegistration_number() {
		return registration_number;
	}

	public void setRegistration_number(int registration_number) {
		this.registration_number = registration_number;
	}

	public int getChassis_number() {
		return chassis_number;
	}

	public void setChassis_number(int chassis_number) {
		this.chassis_number = chassis_number;
	}

	public int getEngine_number() {
		return engine_number;
	}

	public void setEngine_number(int engine_number) {
		this.engine_number = engine_number;
	}

	public String getRegistration_place() {
		return registration_place;
	}

	public void setRegistration_place(String registration_place) {
		this.registration_place = registration_place;
	}

	public String getManufacturing_year() {
		return manufacturing_year;
	}

	public void setManufacturing_year(String manufacturing_year) {
		this.manufacturing_year = manufacturing_year;
	}

	public String getVehicle_model() {
		return vehicle_model;
	}

	public void setVehicle_model(String vehicle_model) {
		this.vehicle_model = vehicle_model;
	}

	public String getEngine_capacity() {
		return engine_capacity;
	}

	public void setEngine_capacity(String engine_capacity) {
		this.engine_capacity = engine_capacity;
	}

	public int getSeating_capacity() {
		return seating_capacity;
	}

	public void setSeating_capacity(int seating_capacity) {
		this.seating_capacity = seating_capacity;
	}

	public String getVehicle_color() {
		return vehicle_color;
	}

	public void setVehicle_color(String vehicle_color) {
		this.vehicle_color = vehicle_color;
	}
	
	

	public Policy(String name, String email, String dob, int phone_no, String address, int registration_number,
			int chassis_number, int engine_number, String registration_place, String manufacturing_year,
			String vehicle_model, String engine_capacity, int seating_capacity, String vehicle_color, int user_id,
			String policy_type, String policy_plan, String start_date, String end_date) {
		super();
		this.name = name;
		this.email = email;
		this.dob = dob;
		this.phone_no = phone_no;
		this.address = address;
		this.registration_number = registration_number;
		this.chassis_number = chassis_number;
		this.engine_number = engine_number;
		this.registration_place = registration_place;
		this.manufacturing_year = manufacturing_year;
		this.vehicle_model = vehicle_model;
		this.engine_capacity = engine_capacity;
		this.seating_capacity = seating_capacity;
		this.vehicle_color = vehicle_color;
		this.user_id = user_id;
		this.policy_type = policy_type;
		this.policy_plan = policy_plan;
		this.start_date = start_date;
		this.end_date = end_date;
	}

	public Policy(int user_id, String policy_type, String policy_plan, String start_date, String end_date) {
		super();
		this.user_id = user_id;
		this.policy_type = policy_type;
		this.policy_plan = policy_plan;
		this.start_date = start_date;
		this.end_date = end_date;

	}

	public Policy() {
		super();
	}

	
	
	@Override
	public String toString() {
		return "policy [user_id=" + user_id + ", policy_type=" + policy_type + ", policy_plan=" + policy_plan
				+ ", start_date=" + start_date + ", end_date=" + end_date + "]";
	}
	
	

}
