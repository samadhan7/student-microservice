package com.studentmicroservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class studentcontroller {
	
	@Autowired
	private studentservice ss;
	
	@GetMapping("/student/{id}")
	public ResponseEntity<studentResponse> getstudentdetails(@PathVariable("id") int id){
		
		studentResponse sr=ss.getstudentbyid(id);
		return ResponseEntity.status(HttpStatus.OK).body(sr);
	} 
	@DeleteMapping("/student")  
	public String hello() {   
	 return "Hello, world"; 
	 }
	
}
