package com.design.patterns.prototype.model;

import com.design.patterns.prototype.Prototype;

import java.util.function.Consumer;

/**
 * Base customer address example
 */
public class CustomerAddress extends Prototype {

    protected String firstName;
    protected String lastName;
    protected String addressLine;
    protected String city;
    protected String state;
    protected String zipCode;
    protected String country;

    public CustomerAddress(String firstName, String lastName, String addressLine, String city, String state, String zipCode, String country) {

        this.firstName = firstName;
        this.lastName = lastName;
        this.addressLine = addressLine;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
        this.country = country;
    }

    public CustomerAddress(Consumer<CustomerAddress> original){

        original.accept(this);
        /* If there is something more this will be controlled by the constructor */
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


    @Override
    public CustomerAddress copy() throws CloneNotSupportedException {

        return  new CustomerAddress(

                copy -> {

                        copy.firstName = this.firstName;
                        copy.lastName = this.lastName;
                        copy.addressLine = this.addressLine;
                        copy.city = this.city;
                        copy.state = this.state;
                        copy.zipCode = this.zipCode;
                        copy.country = this.country;
                }
        );

    }
}
