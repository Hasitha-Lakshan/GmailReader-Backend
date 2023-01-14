package com.gmail.reader.repository;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.gmail.reader.entity.InvoiceEntity;

@Repository
public interface InvoiceRepository extends JpaRepository<InvoiceEntity, String> {

	@Query(value = "select * from invoices", nativeQuery = true)
	ArrayList<InvoiceEntity> getAllInvoiceDetails();

}
