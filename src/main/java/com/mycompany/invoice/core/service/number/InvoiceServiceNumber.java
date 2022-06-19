package com.mycompany.invoice.core.service.number;

import com.mycompany.invoice.core.entity.Invoice;
import com.mycompany.invoice.core.repository.CustomerRepositoryInterface;
import com.mycompany.invoice.core.repository.InvoiceRepositoryInterface;
import com.mycompany.invoice.core.service.InvoiceServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class InvoiceServiceNumber implements InvoiceServiceInterface {

    private static long lastNumber = 0L;

    @Autowired
    private InvoiceRepositoryInterface invoiceRepository;

    @Autowired
    private CustomerRepositoryInterface customerRepository;

    public InvoiceRepositoryInterface getInvoiceRepository() {
        return invoiceRepository;
    }

    public void setInvoiceRepository(InvoiceRepositoryInterface invoiceRepository) {
        this.invoiceRepository = invoiceRepository;
    }

    @Transactional
    public Invoice createInvoice(Invoice invoice) {
        customerRepository.save(invoice.getCustomer());
        return invoiceRepository.save(invoice);
    }

    @Override
    public Iterable<Invoice> list() {
        return invoiceRepository.findAll();
    }

    @Override
    public Invoice getInvoiceByNumber(String number) {
        Invoice invoice = invoiceRepository.findById(number).orElseThrow();
        // Initialiser le client de la facture
        invoice.getCustomer().getName();
        return invoice;
    }
}
