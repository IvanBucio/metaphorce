package com.example.metaphorce.util;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Data
public class ModelMapUtil {
	
	private ModelMapper mapper;
	
	public ModelMapUtil() {
		this.mapper = new ModelMapper();
	}
	
}
