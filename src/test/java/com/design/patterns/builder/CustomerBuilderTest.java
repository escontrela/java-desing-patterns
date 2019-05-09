package com.design.patterns.builder;

import com.design.patterns.builder.model.Customer;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertAll;

/**
 * Tests assets to demo the builder pattern
 */
public class CustomerBuilderTest {

    @Test
    @DisplayName("Creates a builder")
    @Tag("BuilderPattern")
    public void thisTestShouldCreateCustomerWithBuilder(){

        Customer me = new CustomerBuilder().with(p -> p.firstName = "David")
                                           .with(
                                                   p ->{
                                                          p.lastName = "P.";
                                                          p.countryISO = "ES";
                                                          p.email = "es@example.com";
                                                          p.middleName = "d";
                                                   }
                                           ).create();

        assertAll("builder",

                () ->  assertTrue(me.getFirstName().equalsIgnoreCase("David")),
                () ->  assertTrue(me.getLastName().equalsIgnoreCase("P."))

                );

    }
}
