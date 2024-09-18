package com.app.pojos;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;



@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Entity
@Table(name = "debitcards")

public class Cards extends BaseEntity {
	
	@Column(name = "cardHolderName",length = 50)
	private String cardHolderName;
	
	@Column(name = "cvv",length = 50)
	private String cvv;
	
	@Column(name = "cardNumber",length = 50,unique = true)
	private String cardNumber;
	
	@Column(name = "expdate")
	private LocalDate expdate;
	
	@ManyToOne
	@JoinColumn(name = "customerId")
	private Customer customer;
	
	
	
	

}
