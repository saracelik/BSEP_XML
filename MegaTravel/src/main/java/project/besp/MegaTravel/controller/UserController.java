package project.besp.MegaTravel.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import project.besp.MegaTravel.model.User;
import project.besp.MegaTravel.service.UserService;

@RestController
@ControllerAdvice
@RequestMapping("/user")
public class UserController {

	@Autowired
	UserService userService;
	
	@Autowired 
	HttpSession session;
	
	@GetMapping(path = "/login/{userName}/{password}")
	public ResponseEntity<User> login(@PathVariable("userName") String userName,
			@PathVariable("password") String password) {
		User user = userService.login(userName, password);
		if (user!=null) {
			session.setAttribute("user", user);
			return new ResponseEntity<User>(user,HttpStatus.OK);
		}
		else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}

	
}
