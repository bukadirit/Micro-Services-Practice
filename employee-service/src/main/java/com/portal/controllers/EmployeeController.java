package com.portal.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

	@GetMapping
	public ResponseEntity<String> employee() {
		return ResponseEntity.ok().body("You have reached the employee portal.");
	}
}
