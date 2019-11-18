package com.juanonlab.azure.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*", methods = { RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.PATCH })
@RestController
@RequestMapping("/apiazure")
public class Hello {

	@Value("${spring.tip1}")
	private String tip1;

	@Value("${spring.tip2}")
	private String tip2;

	@GetMapping("/hello")
	public String hello() {

		return "Hola mundo!! : " + tip1 + " " + tip2;
	}

}
