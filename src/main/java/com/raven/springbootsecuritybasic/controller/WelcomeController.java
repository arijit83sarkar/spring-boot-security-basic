package com.raven.springbootsecuritybasic.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

	@GetMapping("/welcome")
	public String welcome() {
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append("Available courses:");
		stringBuilder.append("<ul>");
		stringBuilder.append("<li>Learn JAVA : Beginner to Master</li>");
		stringBuilder.append("<li>Full Stack JAVA Developer</li>");
		stringBuilder.append("<li>Microservcies with Spring Boot</li>");
		stringBuilder.append("<li>Complete Web Development</li>");
		stringBuilder.append("<li>Wordpress for Beginner</li>");
		stringBuilder.append("<li>Complete Python Development : Beginner to Master</li>");
		stringBuilder.append("<li>Docker guide : Beginner to Master</li>");
		stringBuilder.append("<li>Node.js : Ultimate guide</li>");
		stringBuilder.append("</ul>");
		
		return stringBuilder.toString();
	}
}
