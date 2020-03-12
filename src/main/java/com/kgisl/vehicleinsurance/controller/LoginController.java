package com.kgisl.vehicleinsurance.controller;

import java.sql.SQLException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.kgisl.vehicleinsurance.dao.LoginDao;
import com.kgisl.vehicleinsurance.model.Login;

/**
 * 
 * @author Ravina Thangavel
 * 
 *         Handles requests for the application home page.
 * 
 */

@Controller
@RequestMapping("/login")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class LoginController {

	LoginDao loginDao;

	LoginController(LoginDao loginDao) {
		this.loginDao = loginDao;
		System.out.println("setting loginDao using constructor injection.");
	}

	@RequestMapping(method = RequestMethod.GET)
	public @ResponseBody List<Login> getAll(@RequestParam String username,@RequestParam String password) {
		System.out.println("tesss"+username+"vvgvg "+password);
		return loginDao.getAll(username, password);

	}

	@RequestMapping(method = RequestMethod.POST)
	public String add(@RequestBody Login l) throws SQLException {
		loginDao.add(l);
		return "redirect:/login";
	}

//	@RequestMapping(value = "/{user_id}", method = RequestMethod.GET)
//	public @ResponseBody List<Login> getById(@PathVariable int user_id) throws Exception {
//		return loginDao.getById(user_id);
//
//	}

//	@RequestMapping(method = RequestMethod.POST)
//	public @ResponseBody int getAll(@RequestBody Login log) {
//		System.out.println("sdgrt");
//		int a2 = loginDao.getAll(log);
//		return a2;
//	}

}
