package com.design.patterns.builder.model;

public class Customer {

    protected String firstName;
    protected String middleName;
    protected String lastName;
    protected String email;
    protected String countryISO;

    public Customer(String firstName, String middleName, String lastName, String email, String countryISO) {

        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.email = email;
        this.countryISO = countryISO;
    }


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCountryISO() {
        return countryISO;
    }

    public void setCountryISO(String countryISO) {
        this.countryISO = countryISO;
    }

}
