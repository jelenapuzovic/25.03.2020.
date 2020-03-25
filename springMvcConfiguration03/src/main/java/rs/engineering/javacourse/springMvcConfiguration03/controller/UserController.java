package rs.engineering.javacourse.springMvcConfiguration03.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;


import rs.engineering.javacourse.springMvcConfiguration03.dto.User;
import rs.engineering.javacourse.springMvcConfiguration03.dto.UserSaved;

@Controller
@RequestMapping(value = "/users")
public class UserController{
	
	UserSaved userSaved = new UserSaved();

	@RequestMapping(method = RequestMethod.GET)
	public ModelAndView home(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView modelAndView = new ModelAndView("user/users");
		modelAndView.addObject("action", "Action: view all users");
		return modelAndView;
		
	}
	@RequestMapping(value ="/add", method = RequestMethod.GET)
	public String add(HttpServletRequest request, HttpServletResponse response) {
		request.setAttribute("action", "Action: add new user");
		return "user/add";
	}

	@ModelAttribute(name = "user")
	public User user() {
		return new User("n/a","n/a","n/a","n/a");
	}
	
	
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public String save(@ModelAttribute(name = "user") User user) {
		userSaved.save(user);
		userSaved.toString();
	
		return "redirect:/users/addUser";
	}
	
	@RequestMapping(value ="/addUser", method = RequestMethod.GET)
	public String addUser(HttpServletRequest request, HttpServletResponse response) {
		request.setAttribute("action", "Action: add new user");
		return "user/addUser";
	}

	
	

}
