package com.mac.registration.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.mac.registration.entity.User;
import com.mac.registration.service.RegistrationService;

@Controller
public class RegistrationController {

	@Autowired
	private RegistrationService userService;

	@RequestMapping(value = "/users", method = RequestMethod.GET)
	public String listUsers(Model model) {
		model.addAttribute("user", new User());
		model.addAttribute("listUsers", userService.listUsers());
		return "user";
	}

	@RequestMapping(value = "/user/{id}")
	public String getUserById(@PathVariable("id") int userId) {
		userService.getUser(userId);
		return "redirect:/users";
	}

	@RequestMapping(value = "/user/add", method = RequestMethod.POST)
	public String addUser(@ModelAttribute("user") User user) {

		if (user.getId() > 0) {
			userService.updateUser(user);
		} else {
			userService.addUser(user);
		}

		return "redirect:/users";
	}

	@RequestMapping(value = "/edit/{id}")
	public String editUser(@PathVariable("id") int id, Model model) {
		model.addAttribute("user", userService.getUser(id));
		model.addAttribute("listUsers", userService.listUsers());
		return "user";
	}

	@RequestMapping(value = "/remove/{id}")
	public String removeUser(@PathVariable("id") int userId) {
		userService.removeUser(userId);
		return "redirect:/users";
	}

}
