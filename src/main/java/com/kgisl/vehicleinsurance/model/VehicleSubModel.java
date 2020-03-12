package com.kgisl.vehicleinsurance.model;

public class VehicleSubModel {

	private String vehicle_model;
	private String vehicle_submodel;

	
	
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

	public VehicleSubModel(String vehicle_model,String vehicle_submodel) {
		super();
		this.vehicle_model=vehicle_model;
		this.vehicle_submodel = vehicle_submodel;
	}

	public VehicleSubModel() {
		super();
	}

	@Override
	public String toString() {
		return "VehicleSubModel [vehicle_model=" + vehicle_model + ", vehicle_submodel=" + vehicle_submodel + "]";
	}

	
	
}
