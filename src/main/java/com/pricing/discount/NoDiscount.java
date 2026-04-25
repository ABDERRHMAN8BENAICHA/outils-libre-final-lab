package com.pricing.discount;

public class NoDiscount implements DiscountStrategy {
    @Override
    public double apply(double amount) {
        return amount;
    }
}