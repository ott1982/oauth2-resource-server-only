package com.orioltristany.oauth2resourceserveronly.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/unsecurized")
public class UnsecurizedController {

	@GetMapping
	public ResponseEntity<String> get() {
		return new ResponseEntity<>("unsecurized", HttpStatus.OK);
	}
}
