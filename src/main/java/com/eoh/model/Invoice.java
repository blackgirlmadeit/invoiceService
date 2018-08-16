package com.eoh.model;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Invoice {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	Long id;
	String client;
	Long vatRate;
	Date invoiceDate;

	

	public Invoice() { }

	public Invoice(Long id, String client, Long vatRate, Date invoiceDate ) {
		this.id = id;
		this.client = client;
		this.vatRate = vatRate;
		this.invoiceDate = invoiceDate;
		
		
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getClient() {
		return client;
	}

	public void setClient(String client) {
		this.client = client;
	}

	public Date getCondition() {
		return invoiceDate;
	}

	public void setCondition(Date invoiceDate) {
		this.invoiceDate = invoiceDate;
	}

	
}