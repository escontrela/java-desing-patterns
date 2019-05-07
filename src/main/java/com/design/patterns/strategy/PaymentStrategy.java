package com.design.patterns.strategy;

import java.math.BigDecimal;
import java.util.Optional;

/**
 * The strategy pattern (structural GoF pattern) define and encapsulate a family of algorithms and allow them to interchange for each other. Abstract the client for the logic of each algorithm.
 * Use it when:
 *
 *       - The client is not interested on  the data inside the algorithm.
 *       - Many related classes differs slightly in their behaviour.
 *       - Different behaviour of one algorithm is need.
 *       - When you need do refactor a class with many conditional algorithm.
 */
public interface PaymentStrategy {

    /**
     * call the payment gateway to pay the amount
     * @param amount BigDecimal amount to pay
     * @return response gateway message!
     */
    Optional<String> doPayment(BigDecimal amount, String customerId);

    /**
     * Visa strategy payment method
     * @return true the payment was done
     */
    static PaymentStrategy visaPaymentMethod() {

        return (amount,customerId) ->  Optional.of("The payment was done with VISA.");
    }

    /**
     * Mastercard strategy payment method
     * @return true the payment was done
     */
    static PaymentStrategy mastercardPaymentMethod() {

        return (amount,customerId) ->   Optional.of("The payment was done with MASTERCARD.");
    }
}
