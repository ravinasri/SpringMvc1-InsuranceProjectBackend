package com.kgisl.vehicleinsurance.model;

public class SeatingCapacity {

	private String seating_capacity;

	public String getSeating_capacity() {
		return seating_capacity;
	}

	public void setSeating_capacity(String seating_capacity) {
		this.seating_capacity = seating_capacity;
	}

	public SeatingCapacity(String seating_capacity) {
		super();
		this.seating_capacity = seating_capacity;
	}

	public SeatingCapacity() {
		super();
	}

	@Override
	public String toString() {
		return "SeatingCapacity [seating_capacity=" + seating_capacity + "]";
	}

}
