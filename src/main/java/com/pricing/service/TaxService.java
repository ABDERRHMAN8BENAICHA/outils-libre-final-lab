package com.pricing.service;

public class TaxService {

    private static final double TAX_RATE = 0.19;

    public double applyTax(double amount) {
        return amount * (1 + TAX_RATE);
    }
}