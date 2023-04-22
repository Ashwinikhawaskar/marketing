package com.wallet.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.wallet.entities.UserDetails;
import com.wallet.services.UserService;

@Controller
public class UserController {
	
	
	@Autowired
	UserService userService;
	
	//http://localhost:8080/create
	@RequestMapping("/create")
public String createDetails(){
	
	return "create";
}
	
	@RequestMapping("/saveUser")
	public String saveOneUser(@ModelAttribute("user") UserDetails userDetail,Model modelMap ) {
		userService.saveUser(userDetail);
		modelMap.addAttribute("msg","Details saved successfully!!1");
		return "create";
	}
}
