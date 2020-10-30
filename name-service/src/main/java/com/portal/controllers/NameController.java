package com.portal.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.portal.models.Name;
import com.portal.repositories.NameRepository;

@RestController
public class NameController {


	@Autowired
	private NameRepository nameRepository;
	
	@GetMapping
	public ResponseEntity<List<Name>> name(){
		List<Name> all = nameRepository.findAll();
		
		if(all.isEmpty()) {
			return ResponseEntity.noContent().build();
		}
		
		return ResponseEntity.ok(all);
	}
}
