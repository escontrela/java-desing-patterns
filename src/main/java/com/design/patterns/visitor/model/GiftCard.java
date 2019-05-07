package com.design.patterns.visitor.model;

import java.math.BigDecimal;


/**
 * Example representation of a giftCard
 */
public class GiftCard implements Visitable{

    private BigDecimal price;

    public GiftCard(BigDecimal price){

        this.price = price;
    }


    public BigDecimal getPrice() {

        return price;
    }

    @Override
    public void accept(Visitor visitor) {

        visitor.visit(this);
    }
}