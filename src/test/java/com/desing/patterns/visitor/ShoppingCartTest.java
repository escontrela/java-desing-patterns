package com.desing.patterns.visitor;


import com.desing.patterns.factory.AddressFactory;
import com.desing.patterns.factory.model.AddressBuilder;
import com.desing.patterns.factory.model.BillingAddress;
import com.desing.patterns.visitor.model.GiftCard;
import com.desing.patterns.visitor.model.Product;
import com.desing.patterns.visitor.model.ShoppingCart;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;

import java.math.BigDecimal;

import static com.desing.patterns.factory.AddressFactory.create;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertAll;

/**
 * Test for demostrate the visitor pattern
 */
public class ShoppingCartTest {



    @Test
    @DisplayName("Creates a cart and calculate the total amount")
    @Tag("VisitorPattern")
    public void thisTestShouldCreateShoppingCartAndGetTheTotalAmount(){

        ShoppingCart shoppingCart = new ShoppingCart();

        Product jacket = new Product(BigDecimal.valueOf(100));
        Product shoes = new Product((BigDecimal.valueOf(40)));
        GiftCard giftCard = new GiftCard(BigDecimal.valueOf(10));

        shoppingCart.add(jacket).add(shoes).add(giftCard);

        assertAll("visitor",
                () ->  assertTrue(shoppingCart.calculate().longValue() == 150L)
        );

    }
}
