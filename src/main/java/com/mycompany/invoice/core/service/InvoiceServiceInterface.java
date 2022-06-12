package com.mycompany.invoice.core.service;

import com.mycompany.invoice.core.entity.Invoice;
import com.mycompany.invoice.core.repository.InvoiceRepositoryInterface;

import java.util.List;

public interface InvoiceServiceInterface {
    List<Invoice> list();
    void setInvoiceRepository(InvoiceRepositoryInterface invoiceRepository);
    void createInvoice(Invoice invoice);
}
