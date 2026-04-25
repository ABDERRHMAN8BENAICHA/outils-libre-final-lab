package com.pricing.discount;

public interface DiscountStrategy {
    double apply(double amount);
}