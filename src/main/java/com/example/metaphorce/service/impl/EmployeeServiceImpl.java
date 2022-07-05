package com.example.metaphorce.service.impl;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.metaphorce.dao.EmployeeDao;
import com.example.metaphorce.dto.EmployeeDto;
import com.example.metaphorce.entity.Employee;
import com.example.metaphorce.service.EmployeeService;
import com.example.metaphorce.util.ModelMapUtil;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired 
	private EmployeeDao employeeDao;
	
	@Autowired 
	private ModelMapUtil mapper;

	@Override
	public Employee getEmployee(Integer id) {
		return employeeDao.findById(id).get();
	}

	@Override
	public Employee newEmployee(Employee employee) {
		return employeeDao.save(employee);
	}

	@Override
	public Employee editEmployee(Employee employee) {
		return employeeDao.save(employee);
	}

	@Override
	public String deleteEmployee(Integer employeeId) {
		employeeDao.deleteById(employeeId);
		
		return "OK";
	}

	@Override
	public List<Employee> getAll() {
		return (List<Employee>) employeeDao.findAll();
	}
	
	@Override
	public List<EmployeeDto> getActiveEmployees() {
		List<Employee> employeeList = employeeDao.findEmployeesForActiveContract();
		
		//List<EmployeeDto> employeeDtoList = StreamSupport.stream(employeeList.spliterator(), false).map(this::convertToDto).collect(Collectors.toList());
		List<EmployeeDto> employeeDtoList = employeeList.stream().map(this::convertToDto).collect(Collectors.toList());
		
		return employeeDtoList ;
	}
	
	private EmployeeDto convertToDto (Employee employee) {
		EmployeeDto dto = mapper.getMapper().map(employee, EmployeeDto.class);
		dto.setName(employee.getName().concat(" ").concat(employee.getLastName()));
		if(employee.getContract() != null) {
			dto.setSalaryPerDay(employee.getContract().getSalaryPerDay().toString());
			dto.setContractDateFrom(employee.getContract().getDateFrom());
			dto.setContractDateTo(employee.getContract().getDateTo());
			dto.setContractTypeName(employee.getContract().getContractType().getName());
		}
		return dto;
	}

}
