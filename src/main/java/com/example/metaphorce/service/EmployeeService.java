package com.example.metaphorce.service;

import java.util.List;

import com.example.metaphorce.dto.EmployeeDto;
import com.example.metaphorce.entity.Employee;

public interface EmployeeService {

	public Employee getEmployee(Integer id);
	
	public Employee newEmployee(Employee employee);
	
	public Employee editEmployee(Employee employee);
	
	public String deleteEmployee(Integer employeeId);
	
	public List<Employee> getAll();
	
	public List<EmployeeDto> getActiveEmployees();
}
