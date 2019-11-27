package com.juanonlab.azure.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.juanonlab.azure.pojo.NumeroRefranes;
import com.juanonlab.azure.pojo.Refran;
import com.juanonlab.azure.service.RefranService;

@CrossOrigin(origins = "*", methods = { RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.PATCH })
@RestController
@RequestMapping("/apiazure")
public class Refranes {

	@Autowired
	RefranService refranService;

	@GetMapping("/mejorrefran")
	public ResponseEntity<Refran> refran() {
		return new ResponseEntity<>(refranService.getBestRefran(), HttpStatus.OK);
	}

	@GetMapping("/refranes/{numero}")
	public ResponseEntity<List<Refran>> refranes(@PathVariable final Integer numero) {
		return new ResponseEntity<>(refranService.getRefranes(numero), HttpStatus.OK);
	}

	@GetMapping("/numerorefranes")
	public ResponseEntity<NumeroRefranes> numerorefranes() {
		return new ResponseEntity<>(new NumeroRefranes(refranService.getnumRefranes()), HttpStatus.OK);
	}

	@GetMapping("/refranes/random")
	public ResponseEntity<Refran> refranRandom() {
		return new ResponseEntity<>(refranService.getRefranRandom(), HttpStatus.OK);
	}

}
