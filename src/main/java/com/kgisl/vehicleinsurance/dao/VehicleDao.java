package com.kgisl.vehicleinsurance.dao;

import java.util.List;

import com.kgisl.vehicleinsurance.model.EngineCapacity;
import com.kgisl.vehicleinsurance.model.ManufacturingYear;
import com.kgisl.vehicleinsurance.model.RegistrationPlace;
import com.kgisl.vehicleinsurance.model.SeatingCapacity;
import com.kgisl.vehicleinsurance.model.Vehicle;
import com.kgisl.vehicleinsurance.model.VehicleColor;
import com.kgisl.vehicleinsurance.model.VehicleModel;
import com.kgisl.vehicleinsurance.model.VehicleSubModel;

public interface VehicleDao {
	
	public List<Vehicle> getAll();

	public Boolean add(final Vehicle v);

	public List<Vehicle> getById(int user_id);
	
	public List<VehicleModel> getModels();
	
	public List<VehicleSubModel> getSubModels(String vehicle_model);
	
	public List<RegistrationPlace> getPlace();
	
	public List<VehicleColor> getColors();
	
	public List<SeatingCapacity> getSeatCapacity();
	
	public List<ManufacturingYear> getYear();
	
	public List<EngineCapacity> getCC();
}
