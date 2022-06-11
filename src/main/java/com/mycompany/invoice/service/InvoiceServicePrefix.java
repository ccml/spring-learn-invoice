package com.mycompany.invoice.service;

import com.mycompany.invoice.entity.Invoice;
import com.mycompany.invoice.repository.InvoiceRepositoryInterface;

public class InvoiceServicePrefix implements InvoiceServiceInterface {
    private long lastNumber;
    private String prefix;

    public long getLastNumber() {
        return lastNumber;
    }

    public void setLastNumber(long lastNumber) {
        this.lastNumber = lastNumber;
    }

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    private InvoiceRepositoryInterface invoiceRepository;

    public InvoiceRepositoryInterface getInvoiceRepository() {
        return invoiceRepository;
    }

    public void setInvoiceRepository(InvoiceRepositoryInterface invoiceRepository) {
        this.invoiceRepository = invoiceRepository;
    }

    public void createInvoice(Invoice invoice) {
        invoice.setNumber(String.valueOf(prefix + (++lastNumber)));
        invoiceRepository.create(invoice);
    }
}
