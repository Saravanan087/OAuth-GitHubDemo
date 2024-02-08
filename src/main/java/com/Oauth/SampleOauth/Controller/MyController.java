package com.Oauth.SampleOauth.Controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class MyController {

	
	@GetMapping("/Home")
	public ResponseEntity<?> welcome(){
		
		
		return new ResponseEntity<> ("Welcome",HttpStatus.OK);
	}
	
	@GetMapping("/Security")
	public ResponseEntity<?> Security(){
		
		
		return new ResponseEntity<> ("Login Successful!",HttpStatus.OK);
	}
	
}
