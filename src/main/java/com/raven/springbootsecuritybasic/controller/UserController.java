package com.raven.springbootsecuritybasic.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

	@GetMapping("/myCourses")
	public String myCourses() {
		return "Enrolled courses:" +
				"<ul>" +
				"<li>Full Stack JAVA Developer (85% done)</li>" +
				"<li>Microservices with Spring Boot (55 % done)</li>" +
				"<li>Docker guide : Beginner to Master (65% done)</li>" +
				"</ul>";
	}
}
