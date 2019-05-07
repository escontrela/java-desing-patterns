package com.design.patterns.strategy;

import com.design.patterns.factory.AddressFactory;
import com.design.patterns.factory.model.AddressBuilder;
import com.design.patterns.factory.model.BillingAddress;
import com.design.patterns.strategy.model.Invoice;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.math.BigDecimal;
import java.util.stream.Stream;
import static com.design.patterns.factory.AddressFactory.create;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertAll;


/**
 * Strategy pattern tests
 */
public class PaymentStrategyTest {

    protected Logger logger = LoggerFactory.getLogger(PaymentStrategyTest.class);

    /**
     * Place here the different strategies
     * @return Stream<Arguments>
     */
    protected static Stream<Arguments> testArgumentsSupplier() {

        return Stream.of(

                Arguments.of( PaymentStrategy.mastercardPaymentMethod()) ,
                Arguments.of(PaymentStrategy.visaPaymentMethod())
        );
    }




    @ParameterizedTest(name = "Performs a invoice payment with the arguments: {0}")
    @MethodSource("testArgumentsSupplier")
    @Tag("StrategyPattern")
    public void thisTestShouldUseDifferentPaymentStrategiesToPayTheInvoice(PaymentStrategy paymentMethod){

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

        Invoice lastOrder
                = new Invoice(spainAddress, BigDecimal.valueOf(1000),paymentMethod);

        assertAll("strategy",
                () ->  assertTrue(lastOrder.doPayment())
        );

    }

}
