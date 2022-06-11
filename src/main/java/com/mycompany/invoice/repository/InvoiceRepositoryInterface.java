package com.mycompany.invoice.repository;

import com.mycompany.invoice.entity.Invoice;

import java.util.List;

public interface InvoiceRepositoryInterface {
    List<Invoice> list();
    void create(Invoice invoice);
}
