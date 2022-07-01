package com.example.metaphorce.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.metaphorce.dto.EmployeeDto;
import com.example.metaphorce.entity.Employee;
import com.example.metaphorce.service.EmployeeService;

@RestController
@RequestMapping("employee")
public class EmployeeRestController {
	
	@Autowired
	private EmployeeService service;
	
	
	@GetMapping("/active")
	@ResponseBody
	public List<EmployeeDto> getActiveEmployees () {
		return service.getActiveEmployees();
	}
	
	
	@GetMapping("/all")
	public List<Employee> getAllEmployees () {
		return service.getAll();
	}
	
	
	@GetMapping("/{employee}")
	public Employee getEmployeeById(@PathVariable int employeeId) {
		
		return service.getEmployee(employeeId);
	}
	
	@PostMapping("/new")
	public Employee newEmployee(@RequestBody Employee employee) {
		
		return service.newEmployee(employee);
	}
	
	@PostMapping("/edit/")
	public Employee editEmployee(@RequestBody Employee employee) {
		return service.editEmployee(employee);
	}
	
	@PostMapping("/delete/{employee}")
	public String deleteEmployee(@PathVariable int employeeId) {
		
		return service.deleteEmployee(employeeId);
	}
}
