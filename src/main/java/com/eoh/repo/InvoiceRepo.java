package com.eoh.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eoh.model.Invoice;

public interface InvoiceRepo extends JpaRepository<Invoice,Long> {

}
