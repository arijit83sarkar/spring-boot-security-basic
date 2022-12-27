package com.raven.springbootsecuritybasic.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

	/* @RequestMapping(value = "/welcome", method = RequestMethod.GET) */
	@GetMapping("/welcome")
	public String welcome() {
		return "Available courses:" +
				"<ul>" +
				"<li>Learn JAVA : Beginner to Master</li>" +
				"<li>Full Stack JAVA Developer</li>" +
				"<li>Microservices with Spring Boot</li>" +
				"<li>Complete Web Development</li>" +
				"<li>Wordpress for Beginner</li>" +
				"<li>Complete Python Development</li>" +
				"<li>Docker guide : Beginner to Master</li>" +
				"<li>Node.js : Ultimate guide</li>" +
				"</ul>";
	}
}
