package com.desing.patterns.visitor.model;

import com.desing.patterns.visitor.CalculateCartVisitor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * The client class, save the state with all the elements
 */
public class ShoppingCart {

    private Logger logger = LoggerFactory.getLogger(ShoppingCart.class);

    protected List<Visitable> items;


    public ShoppingCart(){

        items = new ArrayList<>();
    }

    public ShoppingCart add(Visitable item){

        items.add(item);
        return this;
    }

    public BigDecimal calculate() {

        CalculateCartVisitor visitor = new CalculateCartVisitor();

        //iterate through all the products
        for(Visitable item: items) {

            item.accept(visitor);
        }

        BigDecimal toret = visitor.getTotalAmount();
        logger.info("The total amount for this shopping cart is: {}" , toret );

        return toret;
    }


}