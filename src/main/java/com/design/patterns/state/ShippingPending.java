package com.design.patterns.state;

import com.design.patterns.state.model.Order;

public class ShippingPending implements  OrderStatus {

    @Override
    public void nextStatus(Order order) {

        order.setStatus(new CustomerDelivered());
    }

    @Override
    public void previousStatus(Order order) {

        order.setStatus(new PaymentPending());
    }

    @Override
    public String getStatusDescription() {

        return "The order is on the warehouse pending to be send.";
    }
}
