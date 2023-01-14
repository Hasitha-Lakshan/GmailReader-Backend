package com.gmail.reader.service;

import java.util.ArrayList;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gmail.reader.dto.CommonResponse;
import com.gmail.reader.dto.InvoiceDetail;
import com.gmail.reader.entity.InvoiceEntity;
import com.gmail.reader.repository.InvoiceRepository;

@Service
public class InvoiceService {

	@Autowired
	private CommonResponse commonResponse;

	@Autowired
	private InvoiceRepository invoiceRepository;

	// This method is used to map invoice details from InvoiceDetail type to InvoiceEntity and save the details in database
	public CommonResponse saveInvoices(InvoiceDetail invoiceDetail) {

		if (invoiceDetail != null) {
			InvoiceEntity invoiceEntity = new InvoiceEntity();
			invoiceEntity.setInvoiceId(invoiceDetail.getId());
			invoiceEntity.setDate(invoiceDetail.getDate());
			invoiceEntity.setInvoiceFrom(invoiceDetail.getInvoiceFrom());
			invoiceEntity.setInvoiceTo(invoiceDetail.getInvoiceTo());
			invoiceEntity.setSubject(invoiceDetail.getSubject());
			invoiceRepository.save(invoiceEntity);

			commonResponse.setMessage("Data saved");
			commonResponse.setTimeStamp(new Date());
			commonResponse.setStatus(true);
			return commonResponse;

		} else {
			commonResponse.setMessage("Data is null");
			commonResponse.setTimeStamp(new Date());
			commonResponse.setStatus(false);
			return commonResponse;
		}

	}

	// This method is used to get all invoice details from database
	public ArrayList<InvoiceEntity> getAllInvoices() {
		ArrayList<InvoiceEntity> invoiceList = this.invoiceRepository.getAllInvoiceDetails();
		return invoiceList;
	}

}
