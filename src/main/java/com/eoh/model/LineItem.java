package com.eoh.model;

import java.math.BigDecimal;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class LineItem {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	Long id;
	Long quantity;
	String description;
	BigDecimal unitPrice;
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getQuantity() {
		return quantity;
	}
	public void setQuantity(Long quantity) {
		this.quantity = quantity;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public BigDecimal getUnitPrice() {
		return unitPrice;
	}
	public void setUnitPrice(BigDecimal unitPrice) {
		this.unitPrice = unitPrice;
	}
	
	/* a little unsure on how to go about doing these calculation*/
	public BigDecimal getLineItemTotal() {
		
		return unitPrice.multiply(getUnitPrice());
		
	}
	
}
