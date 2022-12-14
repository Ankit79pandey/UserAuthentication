package com.simplilearn.security.Controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class HomeController {

	@GetMapping("/home")
	public String home() {
		return "This is user portal";
	}

	@GetMapping("/login")
	public String login() {
		return "This is login page";
	}

	@GetMapping("/register")
	public String register() {
		return "This is registration page";
	}
}
