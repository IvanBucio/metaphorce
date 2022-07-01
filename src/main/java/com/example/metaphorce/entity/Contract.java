package com.example.metaphorce.entity;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.lang.NonNull;

import com.fasterxml.jackson.annotation.JsonBackReference;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
public class Contract extends BaseEntity implements Serializable {

	public Contract(boolean isActive, Date dateCreated) {
		super(isActive, dateCreated);
	}

	private static final long serialVersionUID = 2257034874884505056L;

	@Id
	private BigInteger contractId;
	
	@ManyToOne
	@JoinColumn(name = "contractTypeId", nullable = false, updatable = false, insertable = false)
	@JsonBackReference("employee")
	//@ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private Employee employeeId;
	
	@ManyToOne
	@JoinColumn(name = "contractTypeId", nullable = false, updatable = false, insertable = false)
	@JsonBackReference("contractType")
	//@ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private ContractType contractType;
	
	@Column
	@NonNull
	@Temporal(TemporalType.TIMESTAMP)
	private Date dateFrom;
	
	@Column
	@NonNull
	@Temporal(TemporalType.TIMESTAMP)
	private Date dateTo;
	
	@Column
	@NonNull
	private Double salaryPerDay;
	
}
