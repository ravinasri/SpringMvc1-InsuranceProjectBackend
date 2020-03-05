package com.kgisl.vehicleinsurance.model;

public class VehicleColor {
	
	private String vehicle_color;

	public String getVehicle_color() {
		return vehicle_color;
	}

	public void setVehicle_color(String vehicle_color) {
		this.vehicle_color = vehicle_color;
	}

	public VehicleColor(String vehicle_color) {
		super();
		this.vehicle_color = vehicle_color;
	}

	public VehicleColor() {
		super();
	}

	@Override
	public String toString() {
		return "VehicleColor [vehicle_color=" + vehicle_color + "]";
	}
	
	
	

}
