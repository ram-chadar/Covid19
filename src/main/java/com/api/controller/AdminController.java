package com.api.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/admin")
public class AdminController {
	
	@GetMapping("/get-all-center")
	public ResponseEntity<String> getAllCenter(){
		return new ResponseEntity<String>("Pune Center, Mumbai Center",HttpStatus.OK) ;
			
		
	}

}
