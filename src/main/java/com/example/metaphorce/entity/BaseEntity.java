package com.example.metaphorce.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.lang.NonNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BaseEntity {

	@Column
	@NonNull
	private boolean isActive;
	
	@Column
	@NonNull
	@Temporal(TemporalType.TIMESTAMP)
	private Date dateCreated;
}
