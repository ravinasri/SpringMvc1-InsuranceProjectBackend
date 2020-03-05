package com.kgisl.vehicleinsurance.model;

public class EngineCapacity {
	
	private String engine_capacity;

	public String getEngine_capacity() {
		return engine_capacity;
	}

	public void setEngine_capacity(String engine_capacity) {
		this.engine_capacity = engine_capacity;
	}

	public EngineCapacity(String engine_capacity) {
		super();
		this.engine_capacity = engine_capacity;
	}

	public EngineCapacity() {
		super();
	}

	@Override
	public String toString() {
		return "EngineCapacity [engine_capacity=" + engine_capacity + "]";
	}
	
	

}
