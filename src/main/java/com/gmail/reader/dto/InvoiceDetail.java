package com.gmail.reader.dto;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class InvoiceDetail {

	private String id;
	private String invoiceFrom;
	private String invoiceTo;
	private String subject;
	@JsonFormat(pattern = "dd-MM-yyyy hh:mm:ss a")
	private Date date;
	private String body;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getInvoiceFrom() {
		return invoiceFrom;
	}

	public void setInvoiceFrom(String invoiceFrom) {
		this.invoiceFrom = invoiceFrom;
	}

	public String getInvoiceTo() {
		return invoiceTo;
	}

	public void setInvoiceTo(String invoiceTo) {
		this.invoiceTo = invoiceTo;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

}
