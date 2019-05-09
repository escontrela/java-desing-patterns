package com.design.patterns.builder;
import com.design.patterns.builder.model.Customer;
import java.util.function.Consumer;

/**
 * The builder design pattern (GoF creational pattern)
 *
 * Allows to create different ways of create an object  avoiding constructor pollution.
 * Helps to create and object when a lot of steps are involved.
 *
 * (Sometimes this will be  a static class inside the "customer" class
 */
public class CustomerBuilder {

    public String firstName;
    public String middleName;
    public String lastName;
    public String email;
    public String countryISO;


    public CustomerBuilder with(Consumer<CustomerBuilder> builderFunction) {

        builderFunction.accept(this);
        return this;
    }


    public Customer create() {

        return new Customer(firstName,middleName,lastName,email,countryISO);
    }
}