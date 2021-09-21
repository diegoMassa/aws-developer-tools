package com.example.demo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

	@GetMapping("/hello/{name}")
	public String sayHello(@PathVariable String name) {
		return "Hi from CodeCommitDemo - v3 " + name;
	}
}
