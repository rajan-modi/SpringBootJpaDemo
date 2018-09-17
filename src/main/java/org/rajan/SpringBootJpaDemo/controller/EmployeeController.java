package org.rajan.SpringBootJpaDemo.controller;

import java.util.List;

import org.rajan.SpringBootJpaDemo.model.Employee;
import org.rajan.SpringBootJpaDemo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
	@Autowired
	private EmployeeService service;
	
	@GetMapping(value="employees")
	public List<Employee> getEmployees(){
		return service.getEmployeesList();
	}
}
