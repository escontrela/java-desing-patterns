package com.desing.patterns.strategy.model;

import com.desing.patterns.factory.model.Address;
import com.desing.patterns.strategy.PaymentStrategy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Optional;

/**
 * Example of invoice payment for strategy pattern purposes
 */
public class Invoice {

    protected Logger logger = LoggerFactory.getLogger(Invoice.class);

    protected Address billingCustomerAddress;
    protected BigDecimal invoiceAmount;
    protected LocalDate localDate;

    protected PaymentStrategy paymentMethod;

    public Invoice(Address billingCustomerAddress, BigDecimal invoiceAmount,PaymentStrategy paymentMethod) {

        this.billingCustomerAddress = billingCustomerAddress;
        this.invoiceAmount = invoiceAmount;
        this.paymentMethod = paymentMethod;

        localDate = LocalDate.now();
    }


    public boolean doPayment(){

        Optional<String> toret = paymentMethod
                                .doPayment(invoiceAmount,billingCustomerAddress.getFirstName());

        if (toret.isPresent()) {

            logger.info("The payment for the invoice of {} was {}", billingCustomerAddress.getFirstName(), toret.get());
            return true;
        }

        return false;
    }



}
