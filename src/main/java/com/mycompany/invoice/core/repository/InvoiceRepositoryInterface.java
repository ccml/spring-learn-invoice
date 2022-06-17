package com.mycompany.invoice.core.repository;

import com.mycompany.invoice.core.entity.Invoice;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface InvoiceRepositoryInterface extends CrudRepository<Invoice, String> {

    @EntityGraph(value = "invoice.customer", type = EntityGraph.EntityGraphType.FETCH)
    Iterable<Invoice> findAll();

    /*
    List<Invoice> list();
    Invoice getById(String number);
    Invoice create(Invoice invoice);
     */
}
