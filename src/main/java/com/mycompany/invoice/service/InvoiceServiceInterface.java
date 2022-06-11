package com.mycompany.invoice.service;

import com.mycompany.invoice.entity.Invoice;
import com.mycompany.invoice.repository.InvoiceRepositoryInterface;

import java.util.List;

public interface InvoiceServiceInterface {
    List<Invoice> list();
    void setInvoiceRepository(InvoiceRepositoryInterface invoiceRepository);
    void createInvoice(Invoice invoice);
}
