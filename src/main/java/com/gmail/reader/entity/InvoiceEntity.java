package com.gmail.reader.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

@Entity
@Table(name = "invoices")
public class InvoiceEntity {
	@Id
	@NotEmpty
	@Column(unique = true)
	private String invoiceId;
	@Column
	private String subject;
	@Column
	private Date date;
	@Column
	private String invoiceFrom;
	@Column
	private String invoiceTo;

	public String getInvoiceId() {
		return invoiceId;
	}

	public void setInvoiceId(String invoiceId) {
		this.invoiceId = invoiceId;
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

}
