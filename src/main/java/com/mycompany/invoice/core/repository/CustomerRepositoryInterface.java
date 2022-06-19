package com.mycompany.invoice.core.repository;

import com.mycompany.invoice.core.entity.Customer;
import com.mycompany.invoice.core.entity.Invoice;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.repository.CrudRepository;

public interface CustomerRepositoryInterface extends CrudRepository<Customer, Long> {

    /*
    List<Invoice> list();
    Invoice getById(String number);
    Invoice create(Invoice invoice);
     */
}
