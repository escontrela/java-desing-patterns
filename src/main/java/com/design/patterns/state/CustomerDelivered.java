package com.design.patterns.state;

import com.design.patterns.state.model.Order;

public class CustomerDelivered implements OrderStatus {

    @Override
    public void nextStatus(Order order) {

        order.setStatus(this);
    }

    @Override
    public void previousStatus(Order order) {

        order.setStatus(new ShippingPending());
    }

    @Override
    public String getStatusDescription() {
        return "The order was recived for the customer";
    }
}
