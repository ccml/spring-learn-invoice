package com.mycompany.invoice.core.controller;

import com.mycompany.invoice.core.entity.Invoice;
import com.mycompany.invoice.core.service.InvoiceServiceInterface;

public interface InvoiceControllerInterface {
    void setInvoiceService(InvoiceServiceInterface invoiceService);
    String createInvoice(Invoice invoice);
}
