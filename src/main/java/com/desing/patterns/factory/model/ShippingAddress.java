package com.desing.patterns.factory.model;

import com.desing.patterns.factory.model.Address;

/**
 * Address class for shipping identification
 */
public class ShippingAddress extends Address {


    public ShippingAddress(String firstName, String lastName, String addressLine, String city, String state, String zipCode, String country) {

        super(firstName, lastName, addressLine, city, state, zipCode, country);
    }
}
