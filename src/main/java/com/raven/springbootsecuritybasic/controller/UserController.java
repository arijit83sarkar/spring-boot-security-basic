package com.raven.springbootsecuritybasic.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

	@GetMapping("/myCourses")
	public String myCourses() {
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append("Enrolled courses:");
		stringBuilder.append("<ul>");
		stringBuilder.append("<li>Full Stack JAVA Developer (85% completed)</li>");
		stringBuilder.append("<li>Microservcies with Spring Boot (55 % completed)</li>");
		stringBuilder.append("<li>Docker guide : Beginner to Master (65% completed)</li>");
		stringBuilder.append("</ul>");

		return stringBuilder.toString();
	}
}
