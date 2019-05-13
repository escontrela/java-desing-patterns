package com.design.patterns.state;

import com.design.patterns.factory.AddressFactory;
import com.design.patterns.factory.model.AddressBuilder;
import com.design.patterns.factory.model.BillingAddress;
import com.design.patterns.state.model.Order;
import com.design.patterns.strategy.PaymentStrategy;
import com.design.patterns.strategy.model.Invoice;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;

import java.math.BigDecimal;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertAll;

public class OrderStatusTest {


    @Test
    @DisplayName("Creates an order and transit for his status")
    @Tag("StatePattern")
    public void thisTestShouldCreateAndOrderForDifferentStatus(){

        BillingAddress spainAddress

                = AddressFactory.create(AddressFactory.AddressType.BILLING,
                AddressBuilder.WithSpanishAddress.get()
                        .firstName("David")
                        .lastName("P")
                        .addressLine("C/Percebe nº 6")
                        .city("Madrid")
                        .zipCode("9100")
                        .state("Madrid")
                        .vatNumber("12345678")

        );

        Order lastOrder
                = new Order(spainAddress, BigDecimal.valueOf(1000));

        lastOrder.nextStatus();
        lastOrder.nextStatus();

        assertAll("state",
                () ->  assertTrue(lastOrder.getStatus().getClass() == CustomerDelivered.class)
        );

    }
}
