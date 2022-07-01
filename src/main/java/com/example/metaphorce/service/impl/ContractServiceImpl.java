package com.example.metaphorce.service.impl;

import java.math.BigInteger;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.metaphorce.dao.ContractDao;
import com.example.metaphorce.entity.Contract;
import com.example.metaphorce.service.ContractService;

@Service
public class ContractServiceImpl implements ContractService {
	
	@Autowired 
	private ContractDao contractDao;

	@Override
	public Contract getContract(BigInteger id) {
		return contractDao.findById(id).get();
	}

	@Override
	public Contract newContract(Contract contract) {
		return contractDao.save(contract);
	}

	@Override
	public Contract editContract(Contract contract) {
		return contractDao.save(contract);
	}

	@Override
	public String deleteContract(BigInteger contractId) {
		contractDao.deleteById(contractId);
		
		return "OK";
	}

	@Override
	public List<Contract> getAll() {
		return (List<Contract>) contractDao.findAll();
	}
	
}
