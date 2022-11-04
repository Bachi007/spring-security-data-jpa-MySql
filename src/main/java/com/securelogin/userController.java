package com.securelogin;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class userController {

	@GetMapping("/")
	public String home() {
		return ("<h1>Welcome</h1>");
	}
	
	@GetMapping("/user")
	public String userdashboard() {
		return ("<h1>Welcome to user dashboard</h1>");
	}
	
	@GetMapping("/admin")
	public String admindashboard() {
		return ("<h1>Welcome to admin dashboard</h1>");
	}
}
