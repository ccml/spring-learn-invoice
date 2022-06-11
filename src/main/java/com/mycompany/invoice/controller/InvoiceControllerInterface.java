package com.mycompany.invoice.controller;

import com.mycompany.invoice.service.InvoiceServiceInterface;

public interface InvoiceControllerInterface {
    void setInvoiceService(InvoiceServiceInterface invoiceService);
    void createInvoice();
}
