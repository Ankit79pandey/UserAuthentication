package com.simplilearn.security.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.simplilearn.security.Models.User;
import com.simplilearn.security.Services.UserService;

@RestController
@RequestMapping("/admin")
public class UserController {

	@Autowired
	private UserService userService;
	
	
	
	
	@GetMapping("/")
	public List<User> getAllUsers(){
		
		return this.userService.getAllUser(); 
	}
	@GetMapping("/homepage")
	public String Homepage() {
		return "You are in admin Portal";
	}
	
}
