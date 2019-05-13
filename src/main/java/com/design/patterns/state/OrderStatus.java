package com.design.patterns.state;

import com.design.patterns.state.model.Order;

/**
 * StatePattern (GoF behavioural pattern)
 * Used to alter the behaviour of an object as its internal state changes,
 * so allows  change the object class at run-time without changing the interface used to access the object.
 *
 */
public interface OrderStatus {

    void nextStatus(Order order);
    void previousStatus(Order order);
    String getStatusDescription();

}
