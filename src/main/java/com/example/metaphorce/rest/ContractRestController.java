package com.example.metaphorce.rest;

import java.math.BigInteger;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.metaphorce.entity.Contract;
import com.example.metaphorce.service.ContractService;

@RestController
@RequestMapping("alumno_grado")
public class ContractRestController {
	
	@Autowired
	private ContractService service;
	
	@GetMapping("/all")
	public List<Contract> getAllContract () {
		return service.getAll();
	}
	
	
	@GetMapping("/{contractId}")
	public Contract getContractById(@PathVariable String contractId) {
		
		return service.getContract(new BigInteger(contractId));
	}
	
	@PostMapping("/new")
	public Contract newContract(@RequestBody Contract contract) {
		
		return service.newContract(contract);
	}
	
	@PostMapping("/edit/")
	public Contract editContract(@RequestBody Contract contract) {
		return service.editContract(contract);
	}
	
	@PostMapping("/delete/{contractId}")
	public String deleteContract(@PathVariable String contractId) {
		
		return service.deleteContract(new BigInteger(contractId));
	}
}
