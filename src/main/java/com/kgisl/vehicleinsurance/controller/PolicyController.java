package com.kgisl.vehicleinsurance.controller;
import java.sql.SQLException;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import com.kgisl.vehicleinsurance.dao.PolicyDao;
import com.kgisl.vehicleinsurance.model.Policy;
import com.kgisl.vehicleinsurance.model.PolicyPlan;
import com.kgisl.vehicleinsurance.model.PolicyType;
/**
 * 
 * @author Ravina Thangavel
 * 
 *         Handles requests for the application home page.
 * 
 */

@Controller
@RequestMapping("/policy")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class PolicyController {

	PolicyDao policyDao;

	PolicyController(PolicyDao policyDao) {
		this.policyDao = policyDao;
		System.out.println("setting policyDao using constructor injection.");
	}

	@RequestMapping(method = RequestMethod.GET)
	public @ResponseBody List<Policy> getAll() {
		System.out.println("tes");
		return policyDao.getAll();

	}

	@RequestMapping(method = RequestMethod.POST)
	public String add(@RequestBody Policy p) throws SQLException {
		policyDao.add(p);
		return "redirect:/policy";
	}

	@RequestMapping(value = "/{user_id}", method = RequestMethod.GET)
	public @ResponseBody List<Policy> getById(@PathVariable int user_id) throws Exception {
		return policyDao.getById(user_id);

	}
	
	@RequestMapping(value = "/all/{user_id}", method = RequestMethod.GET)
	public @ResponseBody List<Policy> getAllById(@PathVariable int user_id) throws Exception {
		return policyDao.getAllById(user_id);

	}
	
	@RequestMapping(value = "/getType", method = RequestMethod.GET)
	public @ResponseBody List<PolicyType> getType() throws Exception {
		return policyDao.getType();

	}
	
	@RequestMapping(value = "/getPlan", method = RequestMethod.GET)
	public @ResponseBody List<PolicyPlan> getPlan() throws Exception {
		return policyDao.getPlan();

	}
}
