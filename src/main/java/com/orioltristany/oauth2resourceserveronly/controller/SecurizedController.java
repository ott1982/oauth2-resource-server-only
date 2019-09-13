package com.orioltristany.oauth2resourceserveronly.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/securized")
public class SecurizedController {

	@GetMapping
	public ResponseEntity<String> get() {
		return new ResponseEntity<>("securized", HttpStatus.OK);
	}
}
