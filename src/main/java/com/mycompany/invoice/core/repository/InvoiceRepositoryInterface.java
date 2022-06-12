package com.mycompany.invoice.core.repository;

import com.mycompany.invoice.core.entity.Invoice;

import java.util.List;

public interface InvoiceRepositoryInterface {
    List<Invoice> list();
    Invoice getById(String number);
    void create(Invoice invoice);
}
