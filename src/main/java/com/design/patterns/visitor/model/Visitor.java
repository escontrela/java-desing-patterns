package com.design.patterns.visitor.model;


import com.design.patterns.visitor.CalculateCartVisitor;

/**
 * @see CalculateCartVisitor ;
 */
public interface Visitor{

      void visit(Product item);
      void visit(GiftCard item);
}
