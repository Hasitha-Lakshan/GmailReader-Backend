package com.gmail.reader.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gmail.reader.dto.CommonResponse;
import com.gmail.reader.dto.InvoiceDetail;
import com.gmail.reader.entity.InvoiceEntity;
import com.gmail.reader.service.InvoiceService;

@RestController
@RequestMapping("api/mailservice/")
public class MailController {
	@Autowired
	private InvoiceService invoiceService;

	@PostMapping("saveinvoice")
	public ResponseEntity<CommonResponse> saveInvoices(@RequestBody InvoiceDetail invoiceDetail) {
		return new ResponseEntity<>(this.invoiceService.saveInvoices(invoiceDetail), HttpStatus.OK);
	}

	@GetMapping("getallinvoice")
	public ResponseEntity<ArrayList<InvoiceEntity>> checkForInvoices() {
		return new ResponseEntity<>(this.invoiceService.getAllInvoices(), HttpStatus.OK);
	}

}
