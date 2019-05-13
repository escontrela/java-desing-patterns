package com.design.patterns.state;

import com.design.patterns.state.model.Order;

public class PaymentPending implements  OrderStatus {

    @Override
    public void nextStatus(Order order) {

            order.setStatus(new ShippingPending());
    }

    @Override
    public void previousStatus(Order order) {

        order.setStatus(this);
    }

    @Override
    public String getStatusDescription() {

        return "The payment for the order is not done yet.";
    }

}
