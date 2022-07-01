package com.example.metaphorce.service;

import java.util.List;

import com.example.metaphorce.entity.ContractType;

public interface ContractTypeService {

	public ContractType getContractType(Short id);

	public ContractType newContractType(ContractType contractType);

	public ContractType editContractType(ContractType contractType);

	public String deleteContractType(Short contractTypeId);

	public List<ContractType> getAll();
}
