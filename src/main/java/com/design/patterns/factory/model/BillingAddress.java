package com.design.patterns.factory.model;

/**
 * Address for invoicing purposes
 */
public class BillingAddress extends Address {

    protected String vatNumber;

    public BillingAddress(String firstName, String lastName, String addressLine, String city, String state, String zipCode, String country, String vatNumber) {

        super(firstName, lastName, addressLine, city, state, zipCode, country);

        this.vatNumber  = vatNumber;
    }


    public String getVatNumber() {

        return vatNumber;
    }
}
