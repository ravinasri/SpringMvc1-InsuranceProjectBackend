package com.kgisl.vehicleinsurance.controller;

import java.sql.SQLException;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import com.kgisl.vehicleinsurance.dao.VehicleDao;
import com.kgisl.vehicleinsurance.model.EngineCapacity;
import com.kgisl.vehicleinsurance.model.ManufacturingYear;
import com.kgisl.vehicleinsurance.model.RegistrationPlace;
import com.kgisl.vehicleinsurance.model.SeatingCapacity;
import com.kgisl.vehicleinsurance.model.User;
import com.kgisl.vehicleinsurance.model.Vehicle;
import com.kgisl.vehicleinsurance.model.VehicleColor;
import com.kgisl.vehicleinsurance.model.VehicleModel;
import com.kgisl.vehicleinsurance.model.VehicleSubModel;
/**
 * 
 * @author Ravina Thangavel
 * 
 *         Handles requests for the application home page.
 * 
 */

@Controller
@RequestMapping("/vehicle")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class VehicleController {

	VehicleDao vehicleDao;

	VehicleController(VehicleDao vehicleDao) {
		this.vehicleDao = vehicleDao;
		System.out.println("setting vehicleDao using constructor injection.");
	}

	@RequestMapping(method = RequestMethod.GET)
	public @ResponseBody List<Vehicle> getAll() {

		return vehicleDao.getAll();
	}

	@RequestMapping(value ="/add",method = RequestMethod.POST)
	public String add(@RequestBody Vehicle v) throws SQLException {
		vehicleDao.add(v);
		return "redirect:/vehicle";
	}

	@RequestMapping(value = "/{user_id}", method = RequestMethod.GET)
	public @ResponseBody List<Vehicle> getById(@PathVariable int user_id) throws Exception {
		return vehicleDao.getById(user_id);

	}
	
	@RequestMapping(value = "/getPlace", method = RequestMethod.GET)
	public @ResponseBody List<RegistrationPlace> getPlace() throws Exception {
		return vehicleDao.getPlace();

	}
	
	@RequestMapping(value = "/getModels", method = RequestMethod.GET)
	public @ResponseBody List<VehicleModel> getModels() throws Exception {
		return vehicleDao.getModels();

	}
	
	@RequestMapping(value = "/getSeatCapacity", method = RequestMethod.GET)
	public @ResponseBody List<SeatingCapacity> getSeatCapacity() throws Exception {
		return vehicleDao.getSeatCapacity();

	}
	
	
	
	@RequestMapping(value = "/getColors", method = RequestMethod.GET)
	public @ResponseBody List<VehicleColor> getColors() throws Exception {
		return vehicleDao.getColors();

	}
	
	@RequestMapping(value = "/getYear", method = RequestMethod.GET)
	public @ResponseBody List<ManufacturingYear> getYear() throws Exception {
		return vehicleDao.getYear();

	}
	
	@RequestMapping(value = "/getCC", method = RequestMethod.GET)
	public @ResponseBody List<EngineCapacity> getCC() throws Exception {
		return vehicleDao.getCC();

	}
	
	@RequestMapping(value = "/getSubModel/", method = RequestMethod.GET)
	public @ResponseBody List<VehicleSubModel> getSubModels(@RequestParam String vehicle_model) throws Exception {
		return vehicleDao.getSubModels(vehicle_model);

	}

}
