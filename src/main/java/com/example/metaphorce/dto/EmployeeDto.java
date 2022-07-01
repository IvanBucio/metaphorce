package com.example.metaphorce.dto;

import java.util.Date;

import com.example.metaphorce.entity.Contract;

import lombok.Data;

@Data
public class EmployeeDto {

	private Integer employeeId;
	private String taxIdNumber;
	private String name;
	private Date birthDate;
	private String email;
	private String cellPhone;
	private String contractTypeName;
	private Date contractDateFrom;
	private Date contractDateTo;
	private String salaryPerDay;
}
