package com.springboot.demo.controller;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class TaskController {
	@GetMapping("/task")
	public String displayTask()
	{
		return "Task demo..";
	}
	@GetMapping("/task/showMyInfo")
	public String showInfo()
	{
		return "Kamini jha ,ghaziabad,up";
	}
	@GetMapping("/task/showMyHobbies")
	public List<String> displayHobbies()
	{
		return List.of("Mandala designing","Watching series ","talking");
	}
}
