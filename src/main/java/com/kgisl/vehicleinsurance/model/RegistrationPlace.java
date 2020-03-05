package com.kgisl.vehicleinsurance.model;

public class RegistrationPlace {
	
	private String registration_place;

	public String getRegistration_place() {
		return registration_place;
	}

	public void setRegistration_place(String registration_place) {
		this.registration_place = registration_place;
	}

	public RegistrationPlace(String registration_place) {
		super();
		this.registration_place = registration_place;
	}

	public RegistrationPlace() {
		super();
	}

	@Override
	public String toString() {
		return "RegistrationPlace [registration_place=" + registration_place + "]";
	}
	
	

}
