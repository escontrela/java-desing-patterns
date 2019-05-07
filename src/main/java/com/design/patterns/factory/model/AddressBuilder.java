package com.design.patterns.factory.model;

import java.util.function.Supplier;

/**
 * Builder to help to create an address
 */
public class AddressBuilder {

    private String firstName;
    private String lastName;
    private String addressLine;
    private String city;
    private String state;
    private String zipCode;
    private String country;
    private String vatNumber;

    public AddressBuilder firstName(String firstName){

        this.firstName = firstName;
        return this;
    }

    public AddressBuilder lastName(String lastName){

        this.lastName = lastName;
        return this;
    }

    public AddressBuilder addressLine(String addressLine){

        this.addressLine = addressLine;
        return this;
    }

    public AddressBuilder city(String city){

        this.city = city;
        return this;
    }

    public AddressBuilder state(String state){

        this.state = state;
        return this;
    }

    public AddressBuilder zipCode(String zipCode){

        this.zipCode = zipCode;
        return this;
    }

    public AddressBuilder country(String country){

        this.country = country;
        return this;
    }

    public AddressBuilder vatNumber(String vatNumber){

        this.vatNumber = vatNumber;
        return this;
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

    public String getVatNumber() {
        return vatNumber;
    }


    public static Supplier<AddressBuilder> WithSpanishAddress = new Supplier<AddressBuilder>() {

        @Override
        public AddressBuilder get() {

            return new AddressBuilder().country("ES");
        }
    };

    public static Supplier<AddressBuilder> WithUSAddress = new Supplier<AddressBuilder>() {

        @Override
        public AddressBuilder get() {

            return new AddressBuilder().country("US");
        }
    };
}