package com.design.patterns.adapter;

import com.design.patterns.adapter.model.ExternalProduct;

import java.math.BigDecimal;

/**
 * The adapter pattern (structural GoF design pattern).
 * Is used to allow two incompatible classes to communicate. The adapter is a translator between the two types.
 **/
public interface ProductInfo {

    String getPartnumber();
    BigDecimal getPrice();


    /**
     * Adapter
     * @param externalProduct Adaptee
     * @return Compatible ProductInfo class
     */
    static ProductInfo adapt(ExternalProduct externalProduct){

        return new ProductInfo() {

            @Override
            public String getPartnumber() {

                StringBuilder sb = new StringBuilder();

                return sb.append(externalProduct.getCode())
                        .append(externalProduct.getQuality())
                        .append(externalProduct.getNumber()).toString();
            }

            @Override
            public BigDecimal getPrice() {

                return externalProduct.getCostPrice().add(externalProduct.getPlusMargin());
            }
        };
    }
}
