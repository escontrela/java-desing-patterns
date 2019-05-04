package com.desing.patterns.factory;

import com.desing.patterns.factory.model.AddressBuilder;
import com.desing.patterns.factory.model.BillingAddress;
import com.desing.patterns.factory.model.ShippingAddress;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static com.desing.patterns.factory.AddressFactory.*;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertAll;


/**
 * Test cases for factory pattern
 */
public class AddressFactoryTest {

    protected Logger logger = LoggerFactory.getLogger(AddressFactoryTest.class);

   // @ParameterizedTest(name = "Performs a Guest session ping with the arguments: {0}:({1},{2})")
   // @MethodSource("testArgumentsSupplier")

    @Test
    @DisplayName("Creates a spanish billing address using the factory address class")
    @Tag("FactoryPattern")
    public void thisTestShouldCreateSpainBillingAddress(){

      BillingAddress spainAddress

                    = create(AddressType.BILLING,
                                AddressBuilder.WithSpanishAddress.get()
                                                .firstName("David")
                                                .lastName("P")
                                                .addressLine("C/Percebe nº 6")
                                                .city("Madrid")
                                                .zipCode("9100")
                                                .state("Madrid")
                                                .vatNumber("12345678")

                                );

       logger.info("The spanish billing address was created for {} {}."
               , spainAddress.getFirstName() , spainAddress.getLastName());

        assertAll("addressFactory",
                () ->  assertNotNull(spainAddress),
                () ->  assertTrue(spainAddress.getCountry().equalsIgnoreCase("ES"))
        );

    }


    @Test
    @DisplayName("Creates a spanish billing address using the factory address class")
    @Tag("FactoryPattern")
    public void thisTestShouldCreateUSShippingAddress(){

        ShippingAddress usAddress

                = create(AddressType.SHIPPING,
                AddressBuilder.WithUSAddress.get()
                        .firstName("Mr US")
                        .lastName("X")
                        .addressLine("C/Percebe nº 6")
                        .city("New York")
                        .zipCode("9101")
                        .state("NY")
        );

        logger.info("The US shipping address was created for {} {}."
                , usAddress.getFirstName() , usAddress.getLastName());

        assertAll("addressFactory",
                () ->  assertNotNull(usAddress),
                () ->  assertTrue(usAddress.getCountry().equalsIgnoreCase("US"))
        );

    }




}
