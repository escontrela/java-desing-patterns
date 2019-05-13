package com.design.patterns.state.model;

import com.design.patterns.factory.model.Address;
import com.design.patterns.state.OrderStatus;
import com.design.patterns.state.PaymentPending;
import com.design.patterns.strategy.model.Invoice;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Order {


    protected Logger logger = LoggerFactory.getLogger(Invoice .class);

    protected OrderStatus status = null;

    protected Address billingCustomerAddress;
    protected BigDecimal amount;
    protected LocalDate localDate;


    public Order(Address billingCustomerAddress, BigDecimal amount) {

        this.billingCustomerAddress = billingCustomerAddress;
        this.amount = amount;
        this.localDate = LocalDate.now();
        status = new PaymentPending();
    }

    public OrderStatus getStatus() {

        return status;
    }

    public void setStatus(OrderStatus status) {

        this.status = status;
    }

    public String statusDescription(){

        return status.getStatusDescription();
    }

    public void nextStatus(){

        status.nextStatus(this);
    }

    public void prevStatus(){

        status.previousStatus(this);
    }
}
