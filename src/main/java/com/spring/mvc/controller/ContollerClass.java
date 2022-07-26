package com.spring.mvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.spring.mvc.entity.User;
import com.spring.mvc.service.UserService;

@Controller
public class ContollerClass {
	
	private UserService userService;
	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	
	// Sending data from controller to view page using Model
	@RequestMapping("/home")
	public String home(Model model) {
		model.addAttribute("name", "Lucifer");
		return "home";
	}

	// Sending data from controller to view page using ModelAndView
	@RequestMapping("/contact")
	public ModelAndView contact() {
		ModelAndView mv = new ModelAndView();
		mv.addObject("name", "Morphious");
		mv.addObject("city", "Dream");
		mv.addObject("phone", 789234234);
		return mv;
	}
/*
	// Using @RequestParam
	@RequestMapping("/singup")
	public String singUp(@RequestParam("name") String userName, @RequestParam("email") String userEmail,
			@RequestParam("password") String userPassword, Model model) {
		// Create User object
		User user = new User();
		user.setName(userName);
		user.setEmail(userEmail);
		user.setPassword(userPassword);

		// setting User attributes to Model
		model.addAttribute("name", userName);
		model.addAttribute("email", userEmail);
		model.addAttribute("password", userPassword);

		// or we can pass the user object
		model.addAttribute("user", user);
		return "singup";
	}
*/
	
/*
	// Using @ModelAttribute
	@RequestMapping(path ="/singup" ,method = RequestMethod.POST)
	public String singUp(@ModelAttribute User user, Model model) {
		return "singingUp";		
	}
*/
	// Save user using ORM
	@RequestMapping(path ="/singup" ,method = RequestMethod.POST)
	public String singUp(@ModelAttribute User user, Model model) {
		System.out.println("singUp  controller");
		//userService.creatUser(user);
		hibernateTemplate.save(model);
		return "singingUp";		
	}	

}
