package org.rajan.SpringBootJpaDemo.service;

import java.util.List;

import org.rajan.SpringBootJpaDemo.model.Employee;
import org.rajan.SpringBootJpaDemo.repository.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
	
	@Autowired
	private EmployeeRepo employeeRepo;
	
	public List<Employee> getEmployeesList(){
		return employeeRepo.findAll();
	}
}

