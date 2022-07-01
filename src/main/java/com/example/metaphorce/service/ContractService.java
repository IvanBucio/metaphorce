package com.example.metaphorce.service;

import java.math.BigInteger;
import java.util.List;

import com.example.metaphorce.entity.Contract;

public interface ContractService {

	public Contract getContract(BigInteger id);
	
	public Contract newContract(Contract contract);
	
	public Contract editContract(Contract contract);
	
	public String deleteContract(BigInteger contractId);
	
	public List<Contract> getAll();
	
}
