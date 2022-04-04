package com.springboot.demo.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class HomeController {

@GetMapping("/")
public String index()
{
	return "Hello visitor!";
}

		
}
