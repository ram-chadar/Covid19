package com.api.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {
	
	@GetMapping("/search-vancine/{name}")
	public ResponseEntity<String> getCenter(){
		return new ResponseEntity<String>("Pune Center",HttpStatus.OK) ;
			
		
	}

}
