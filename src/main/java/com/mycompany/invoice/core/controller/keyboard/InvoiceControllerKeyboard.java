package com.mycompany.invoice.core.controller.keyboard;

import com.mycompany.invoice.core.entity.customer.Customer;
import com.mycompany.invoice.core.entity.invoice.Invoice;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Scanner;
/*
//@Controller
public class InvoiceControllerKeyboard implements InvoiceControllerInterface {

    @Autowired
    private InvoiceServiceInterface invoiceService;

    public InvoiceServiceInterface getInvoiceService() {
        return invoiceService;
    }

    public void setInvoiceService(InvoiceServiceInterface invoiceService) {
        this.invoiceService = invoiceService;
    }

    public String createInvoice(Invoice invoice) {
        System.out.println( "What is the customer name" );
        Scanner sc = new Scanner(System.in);
        String customerName = sc.nextLine();
        invoice = new Invoice();
        Customer customer = new Customer(customerName);
        invoice.setCustomer(customer);
        invoiceService.createInvoice(invoice);
        return null;
    }
}
*/