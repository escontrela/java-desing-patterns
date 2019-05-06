package com.desing.patterns.visitor.model;


/**
 * @see com.desing.patterns.visitor.CalculateCartVisitor;
 */
public interface Visitor{

      void visit(Product item);
      void visit(GiftCard item);
}
