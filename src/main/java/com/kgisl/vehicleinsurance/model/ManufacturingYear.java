package com.kgisl.vehicleinsurance.model;

public class ManufacturingYear {
	
	private int manufacturing_year;

	public int getManufacturing_year() {
		return manufacturing_year;
	}

	public void setManufacturing_year(int manufacturing_year) {
		this.manufacturing_year = manufacturing_year;
	}

	public ManufacturingYear(int manufacturing_year) {
		super();
		this.manufacturing_year = manufacturing_year;
	}

	public ManufacturingYear() {
		super();
	}

	@Override
	public String toString() {
		return "ManufacturingYear [manufacturing_year=" + manufacturing_year + "]";
	}

}