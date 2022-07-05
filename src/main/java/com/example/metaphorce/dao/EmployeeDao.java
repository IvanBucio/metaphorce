package com.example.metaphorce.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.example.metaphorce.entity.Employee;

public interface EmployeeDao extends CrudRepository<Employee, Integer> {
	
	@Query(value = "select e from Employee e join Contract c on c.employee.employeeId = e.employeeId where c.isActive = TRUE")
	List<Employee> findEmployeesForActiveContract();
	
}

