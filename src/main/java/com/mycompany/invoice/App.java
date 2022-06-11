package com.mycompany.invoice;


import com.mycompany.invoice.controller.InvoiceControllerInterface;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.*;

/**
 * Hello world!
 *
 */
@SpringBootApplication
public class App
{
    public static void main( String[] args )
    {
        //ApplicationContext context = new AnnotationConfigApplicationContext(App.class);
        ApplicationContext context = SpringApplication.run(App.class, args);

        InvoiceControllerInterface invoiceController = (InvoiceControllerInterface) context.getBean(InvoiceControllerInterface.class);
        invoiceController.createInvoice();
    }

}
