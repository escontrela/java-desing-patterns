package com.design.patterns.factory.model;

/**
 * Address class for shipping identification
 */
public class ShippingAddress extends Address {


    public ShippingAddress(String firstName, String lastName, String addressLine, String city, String state, String zipCode, String country) {

        super(firstName, lastName, addressLine, city, state, zipCode, country);
    }
}
