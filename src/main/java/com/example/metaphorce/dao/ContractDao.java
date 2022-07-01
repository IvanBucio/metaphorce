package com.example.metaphorce.dao;

import java.math.BigInteger;

import org.springframework.data.repository.CrudRepository;

import com.example.metaphorce.entity.Contract;

public interface ContractDao extends CrudRepository<Contract, BigInteger> {
	
}

