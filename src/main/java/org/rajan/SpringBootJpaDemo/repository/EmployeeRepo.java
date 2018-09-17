package org.rajan.SpringBootJpaDemo.repository;

import java.util.List;

import org.rajan.SpringBootJpaDemo.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepo extends JpaRepository<Employee, Integer>{
	
}
