package com.example.metaphorce.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.metaphorce.entity.ContractType;
import com.example.metaphorce.service.ContractTypeService;

@RestController
@RequestMapping("/contractType")
public class ContractTypeRestController {
	
	@Autowired
	private ContractTypeService service;
	
	@GetMapping("/all")
	public List<ContractType> getAllContractTypes () {
		return service.getAll();
	}
	
	
	@GetMapping("/{contractTypeId}")
	public ContractType getContractTypeById(@PathVariable int contractTypeId) {
		
		return service.getContractType((short) contractTypeId);
	}
	
	@PostMapping("/new")
	public ContractType newContractType(@RequestBody ContractType contractType) {
		
		return service.newContractType(contractType);
	}
	
	@PostMapping("/edit")
	public ContractType editContractType(@RequestBody ContractType contractType) {
		return service.editContractType(contractType);
	}
	
	@PostMapping("/delete/{contractTypeId}")
	public String deleteContractType(@PathVariable int contractTypeId) {
		
		return service.deleteContractType((short) contractTypeId);
	}
}
