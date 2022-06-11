package com.mycompany.invoice;


import com.mycompany.invoice.controller.InvoiceControllerInterface;
import com.mycompany.invoice.service.InvoiceServiceInterface;
import com.mycompany.invoice.service.prefix.InvoiceServicePrefix;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.*;

/**
 * Hello world!
 *
 */
@Configuration
@ComponentScan(basePackages = {
        "com.mycompany.invoice.controller.web",
        /* "com.mycompany.invoice.service.prefix", */
        "com.mycompany.invoice.repository.database"
})
@PropertySource("classpath:application.properties")
public class App
{
    public static void main( String[] args )
    {
        ApplicationContext context = new AnnotationConfigApplicationContext(App.class);

        InvoiceControllerInterface invoiceController = (InvoiceControllerInterface) context.getBean(InvoiceControllerInterface.class);
        invoiceController.createInvoice();
    }

    @Bean
    public InvoiceServiceInterface configureInvoiceService() {
        return new InvoiceServicePrefix();
    }
}
