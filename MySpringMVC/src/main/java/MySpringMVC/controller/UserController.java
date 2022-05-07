package MySpringMVC.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


import MySpringMVC.model.User;
import MySpringMVC.services.UserService;

@Controller
public class UserController {
	
	@Autowired
	private UserService userService;
	

	
	@RequestMapping("register")
	public String userReg()
	{
		return "userReg";
	}

	@RequestMapping(path="/registerUser", method=RequestMethod.POST)
	public String registerUser(@ModelAttribute("user") User user, ModelMap model)
	{
		
		int result = userService.Service_create(user);
		model.addAttribute("result","User created with id"+result);
		
		return"userReg";
	}
}
