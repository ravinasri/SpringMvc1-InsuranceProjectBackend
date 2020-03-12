package com.kgisl.vehicleinsurance.model;

public class Vehicle {

	private int user_id;
	private String registration_number;
	private String chassis_number;
	private String engine_number;
	private String registration_place;
	private String manufacturing_year;
	private String vehicle_model;
	private String vehicle_submodel;
	private String engine_capacity;
	private String seating_capacity;
	private String vehicle_color;

	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	public String getRegistration_number() {
		return registration_number;
	}

	public void setRegistration_number(String registration_number) {
		this.registration_number = registration_number;
	}

	public String getChassis_number() {
		return chassis_number;
	}

	public void setChassis_number(String chassis_number) {
		this.chassis_number = chassis_number;
	}

	public String getEngine_number() {
		return engine_number;
	}

	public void setEngine_number(String engine_number) {
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

	
	public String getVehicle_submodel() {
		return vehicle_submodel;
	}

	public void setVehicle_submodel(String vehicle_submodel) {
		this.vehicle_submodel = vehicle_submodel;
	}

	public String getEngine_capacity() {
		return engine_capacity;
	}

	public void setEngine_capacity(String engine_capacity) {
		this.engine_capacity = engine_capacity;
	}

	public String  getSeating_capacity() {
		return seating_capacity;
	}

	public void setSeating_capacity(String seating_capacity) {
		this.seating_capacity = seating_capacity;
	}

	public String getVehicle_color() {
		return vehicle_color;
	}

	public void setVehicle_color(String vehicle_color) {
		this.vehicle_color = vehicle_color;
	}
	
	public Vehicle(int user_id, String registration_number, String chassis_number, String engine_number,
			String registration_place, String manufacturing_year, String vehicle_model,String vehicle_submodel, String engine_capacity,
			String seating_capacity, String vehicle_color) {
		super();
		this.user_id = user_id;
		this.registration_number = registration_number;
		this.chassis_number = chassis_number;
		this.engine_number = engine_number;
		this.registration_place = registration_place;
		this.manufacturing_year = manufacturing_year;
		this.vehicle_model = vehicle_model;
		this.vehicle_submodel = vehicle_submodel;
		this.engine_capacity = engine_capacity;
		this.seating_capacity = seating_capacity;
		this.vehicle_color = vehicle_color;
	}

	public Vehicle() {
		super();
	}

	

	@Override
	public String toString() {
		return "Vehicle [user_id=" + user_id + ", registration_number=" + registration_number + ", chassis_number="
				+ chassis_number + ", engine_number=" + engine_number + ", registration_place=" + registration_place
				+ ", manufacturing_year=" + manufacturing_year + ", vehicle_model=" + vehicle_model
				+ ", vehicle_submodel=" + vehicle_submodel+ ", engine_capacity=" + engine_capacity + ", seating_capacity=" + seating_capacity + ", vehicle_color="
				+ vehicle_color + "]";
	}

}
