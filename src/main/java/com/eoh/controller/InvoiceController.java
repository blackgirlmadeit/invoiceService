package com.eoh.controller;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.eoh.model.Invoice;
import com.eoh.repo.InvoiceRepo;

@RestController
public class InvoiceController {
	
	@Autowired
	private InvoiceRepo invoiceRepo;
	
	@RequestMapping(value = "invoices" , method = RequestMethod.GET)
	public List<Invoice> list(){
		
		return invoiceRepo.findAll();
		
	}
	
	@RequestMapping(value = "invoices", method = RequestMethod.POST)
	public Invoice create(@RequestBody Invoice invoice) {
		return invoiceRepo.saveAndFlush(invoice);
	}

	
	@RequestMapping(value = "invoices/{id}", method = RequestMethod.GET)
	public Optional<Invoice> get(@PathVariable Long id) {
		return invoiceRepo.findById(id);
	}
	
	/* a little unsure on how to go about doing these calculation*/
	public BigDecimal getSubTotal() {
		return null;
		
	}
	
	/* a little unsure on how to go about doing these calculation*/
	public BigDecimal getTotal() {
		return null;
		
	}
	
	/* a little unsure on how to go about doing these calculation*/
	public BigDecimal getVat() {
		return null;
		
	}
}


