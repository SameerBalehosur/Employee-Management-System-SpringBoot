package com.te.ems.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.te.ems.service.EmployeeService;

@RestController
public class EmployeeController {
	@Autowired
	private EmployeeService service;
	
	@DeleteMapping("/delete/{empId}")
	public ResponseEntity<?> deleteData(@PathVariable int empId) {
		try {
			service.delete(empId);
			return new ResponseEntity<String>("Data deleted", HttpStatus.OK);
		} catch (Exception e) {
			e.printStackTrace();
			return new ResponseEntity<String>("data not deleted", HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
}
