package com.example.metaphorce.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.example.metaphorce.entity.Employee;

public interface EmployeeDao extends CrudRepository<Employee, Integer> {
	
}

