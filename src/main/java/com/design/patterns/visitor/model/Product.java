package com.design.patterns.visitor.model;

import java.math.BigDecimal;


/**
 * Example representation for a product on the shopping cart
 */
public class Product implements Visitable{

    private BigDecimal price;

    public Product(BigDecimal price){

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
