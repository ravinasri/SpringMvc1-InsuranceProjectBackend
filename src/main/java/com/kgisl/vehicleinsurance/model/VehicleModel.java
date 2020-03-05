package com.kgisl.vehicleinsurance.model;

public class VehicleModel {

	private String vehicle_model;

	public String getVehicle_model() {
		return vehicle_model;
	}

	public void setVehicle_model(String vehicle_model) {
		this.vehicle_model = vehicle_model;
	}

	public VehicleModel(String vehicle_model) {
		super();
		this.vehicle_model = vehicle_model;
	}

	public VehicleModel() {
		super();
	}

	@Override
	public String toString() {
		return "VehicleModel [vehicle_model=" + vehicle_model + "]";
	}
	
	
}
