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
import com.kgisl.vehicleinsurance.dao.UserDao;
import com.kgisl.vehicleinsurance.model.User;

/**
 * 
 * @author Ravina Thangavel
 * 
 *         Handles requests for the application home page.
 * 
 */

@Controller
@RequestMapping("/user")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class UserController {

	UserDao userDao;

	UserController(UserDao userDao) {
		this.userDao = userDao;
		System.out.println("setting userDao using constructor injection.");
	}

	@RequestMapping(method = RequestMethod.GET)
	public @ResponseBody List<User> getAll() {
		System.out.println("tes");
		return userDao.getAll();

	}

	@RequestMapping(method = RequestMethod.POST)
	public String add(@RequestBody User u) throws SQLException {
		userDao.add(u);
		return "redirect:/user";
	}

	@RequestMapping(value = "/{user_id}", method = RequestMethod.GET)
	public @ResponseBody List<User> getById(@PathVariable int user_id) throws Exception {
    return userDao.getById(user_id);

	}
}
