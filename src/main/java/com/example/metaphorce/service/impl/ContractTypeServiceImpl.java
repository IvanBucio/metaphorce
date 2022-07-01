package com.example.metaphorce.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.metaphorce.dao.ContractTypeDao;
import com.example.metaphorce.entity.ContractType;
import com.example.metaphorce.service.ContractTypeService;

@Service
public class ContractTypeServiceImpl implements ContractTypeService {
	
	@Autowired 
	private ContractTypeDao contractTypeDao;

	@Override
	public ContractType getContractType(Short id) {
		return contractTypeDao.findById(id).get();
	}

	@Override
	public ContractType newContractType(ContractType contractType) {
		return contractTypeDao.save(contractType);
	}

	@Override
	public ContractType editContractType(ContractType contractType) {
		return contractTypeDao.save(contractType);
	}

	@Override
	public String deleteContractType(Short contractTypeId) {
		contractTypeDao.deleteById(contractTypeId);
		
		return "OK";
	}

	@Override
	public List<ContractType> getAll() {
		return (List<ContractType>) contractTypeDao.findAll();
	}
	


}
