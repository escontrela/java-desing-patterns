package com.design.patterns.adapter.model;

import java.math.BigDecimal;

/**
 *
 */
public class ExternalProduct {

    protected BigDecimal costPrice;
    protected BigDecimal plusMargin;
    protected String code;
    protected String quality;
    protected String number;

    public ExternalProduct(BigDecimal costPrice, BigDecimal plusMargin, String code, String quality, String number) {

        this.costPrice = costPrice;
        this.plusMargin = plusMargin;
        this.code = code;
        this.quality = quality;
        this.number = number;
    }

    public BigDecimal getCostPrice() {

        return costPrice;
    }

    public BigDecimal getPlusMargin() {

        return plusMargin;
    }

    public String getCode() {

        return code;
    }

    public String getQuality() {

        return quality;
    }

    public String getNumber() {

        return number;
    }

}