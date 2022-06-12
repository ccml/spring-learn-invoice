package com.mycompany.invoice.core.repository;

import com.mycompany.invoice.core.entity.Invoice;

import java.util.List;

public interface InvoiceRepositoryInterface {
    List<Invoice> list();
    void create(Invoice invoice);
}
