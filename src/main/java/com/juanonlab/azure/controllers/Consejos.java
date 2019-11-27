package com.juanonlab.azure.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.juanonlab.azure.pojo.Consejo;

@CrossOrigin(origins = "*", methods = { RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.PATCH })
@RestController
@RequestMapping("/apiazure")
public class Consejos {

	@Value("${spring.tip1}")
	private String tip1;

	@Value("${spring.tip2}")
	private String tip2;

	@GetMapping("/consejos")
	public ResponseEntity<Consejo> frases() {
		return new ResponseEntity<>(new Consejo(tip1 + ", " + tip2), HttpStatus.OK);
	}

}
