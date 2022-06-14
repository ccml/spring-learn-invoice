package com.mycompany.invoice.core.controller.keyboard;

import com.mycompany.invoice.core.controller.InvoiceControllerInterface;
import com.mycompany.invoice.core.entity.Invoice;
import com.mycompany.invoice.core.service.InvoiceServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Scanner;

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
        invoice.setCustomerName(customerName);
        invoiceService.createInvoice(invoice);
        return null;
    }
}
