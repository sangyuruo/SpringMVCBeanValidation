package com.example.form.controllers;

import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.example.form.model.User;
import com.example.form.model.User.FormOne;
import com.example.form.model.User.FormTwo;

@Controller
@SessionAttributes("user")
public class UserController {

	private static final Logger logger = LoggerFactory.getLogger(UserController.class);
	
	private Map<String, User> users = null;
	
	public UserController(){
		users = new HashMap<String, User>();
	}

	@RequestMapping(value = "/formOne", method = RequestMethod.GET)
	public String saveFormOne(Model model) {
		logger.info("Returning formOne.jsp page");
		model.addAttribute("user", new User());
		return "formOne";
	}
	@RequestMapping(value = "/formTwo", method = RequestMethod.GET)
	public String saveFormTwo() {
		return "formTwo";
	}
	@RequestMapping(value = "/formOne", method = RequestMethod.POST)
	public String saveCustomerAction(@Validated(value=FormOne.class)  @ModelAttribute User user,
			BindingResult bindingResult, Model model) {
		if (bindingResult.hasErrors()) {
			logger.info("Returning formOne.jsp page");
			return "formOne";
		}
		logger.info("Returning formTwo.jsp page");
		model.addAttribute("user", user);
		users.put(user.getEmail(), user);
		return "formTwo";
	}
	@RequestMapping(value = "/formTwo", method = RequestMethod.POST)
	public String saveFormTwo(@Validated(value=FormTwo.class)  @ModelAttribute User user,
			BindingResult bindingResult, Model model) {
		if (bindingResult.hasErrors()) {
			logger.info("Returning formOne.jsp page");
			return "formTwo";
		}
		logger.info("Returning formSummary.jsp page");
		model.addAttribute("user", user);
		users.put(user.getEmail(), user);
		return "formSummary";
	}
}