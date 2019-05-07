package com.design.patterns.factory.model;

/**
 * Base address representation
 */
public class Address {

    protected String firstName;
    protected String lastName;
    protected String addressLine;
    protected String city;
    protected String state;
    protected String zipCode;
    protected String country;

    public Address(String firstName, String lastName, String addressLine, String city, String state, String zipCode, String country) {

        this.firstName = firstName;
        this.lastName = lastName;
        this.addressLine = addressLine;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
        this.country = country;
    }

    public String getFirstName() {

        return firstName;
    }

    public String getLastName() {

        return lastName;
    }

    public String getAddressLine() {

        return addressLine;
    }

    public String getCity() {

        return city;
    }

    public String getState() {

        return state;
    }

    public String getZipCode() {

        return zipCode;
    }

    public String getCountry() {

        return country;
    }

}
