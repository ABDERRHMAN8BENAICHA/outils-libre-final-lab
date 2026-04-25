package com.pricing.discount;

public class Save10Discount implements DiscountStrategy {
    @Override
    public double apply(double amount) {
        return amount * 0.9;
    }
}