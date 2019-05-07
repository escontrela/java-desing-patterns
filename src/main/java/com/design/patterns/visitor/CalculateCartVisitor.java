package com.design.patterns.visitor;


import com.design.patterns.visitor.model.Visitor;
import com.design.patterns.visitor.model.GiftCard;
import com.design.patterns.visitor.model.Product;

import java.math.BigDecimal;

/**
 * Visitor patter is a behavioural pattern:
 * allows for one or more operation to be applied to a set of objects at runtime, decoupling the operations from the object structure.
 *
 * Visitor pattern can provide additional functionality to a class without changing it
 * Visitor lets keep related operations together defining them in the class.
 *
 * Changing the object structure classes requires redefining the interface to all visitors, which is potentially costly.
 * If the object class structure change , then it's probably better to define the operations in those classes.
 *
 */
public class CalculateCartVisitor implements Visitor {


    protected BigDecimal totalAmount = BigDecimal.valueOf(0);

    public void visit(Product item) {

        if(item.getPrice().longValue() > 0.0) {

            totalAmount = totalAmount.add(item.getPrice());
        }

    }


    public void visit(GiftCard item) {

        if(item.getPrice().longValue() > 0.0) {

            totalAmount = totalAmount.add(item.getPrice());
        }

    }

    /**
     * @return BigDecimal returns the state of the visitor
     */
    public BigDecimal getTotalAmount() {

        return totalAmount;

    }

}
