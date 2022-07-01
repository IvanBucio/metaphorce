package com.example.metaphorce.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.lang.NonNull;

import com.fasterxml.jackson.annotation.JsonBackReference;

import lombok.Data;

@Entity
@Data
public class Employee extends BaseEntity implements Serializable {

	private static final long serialVersionUID = 8969156063258808972L;

	@Id
	private Integer employeeId;
	
	@Column(length = 13)
	@NonNull
	private String taxIdNumber;
	
	@Column(length = 60)
	@NonNull
	private String name;
	
	@Column(length = 120)
	@NonNull
	private String lastName;
	
	@Column
	@NonNull
	@Temporal(TemporalType.DATE)
	private Date birthDate;
	
	@Column(length = 60)
	@NonNull
	private String email;
	
	@Column(length = 20)
	@NonNull
	private String cellPhone;
	
	@JsonBackReference("contract")
	@OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinColumn(name = "contractId", nullable = false, updatable = false, insertable = false)
	private Contract contract;
}
