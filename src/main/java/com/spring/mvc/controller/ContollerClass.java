package com.spring.mvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import com.spring.mvc.entity.User;

@Controller
public class ContollerClass {

	
	
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
		//int result = userDao.saveUser(user);
		System.out.println("User with "+ result + " id, is saved.");
		return "singingUp";		
	}
	
*/	
/*	
	// Save user using ORM
	@RequestMapping(path ="/singup" ,method = RequestMethod.POST)
	public String singUp(@ModelAttribute User user, Model model) {
		System.out.println("singUp  controller");
		int result = userDao.saveUser(user);
		System.out.println("Model pass to save() of HT and got id: "+result);
		return "singingUp";		
	}	
*/
	
	//Demo for RedirectView
	@RequestMapping("/search")
	public RedirectView search(@RequestParam("keywords") String query) {
		if(query=="") {
			System.out.println("Please enter something");
		}
		else {
			
		}
		System.out.println("Serach url handler is runnig");
		String url = "https://www.google.com/search?q="+query;
		RedirectView redirectView = new RedirectView();
		redirectView.setUrl(url);
		return redirectView;
	}
}
