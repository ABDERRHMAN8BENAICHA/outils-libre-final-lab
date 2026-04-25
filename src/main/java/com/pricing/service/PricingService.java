package com.pricing.service;

import com.pricing.discount.DiscountFactory;
import com.pricing.discount.DiscountStrategy;
import com.pricing.enums.CustomerType;
import com.pricing.model.Order;

public class PricingService {

    private final TaxService taxService = new TaxService();

    public double calculate(Order order) {
        double subtotal = calculateSubtotal(order);
        double afterDiscount = applyDiscount(subtotal, order);
        double afterCustomer = applyCustomerDiscount(afterDiscount, order);
        return taxService.applyTax(afterCustomer);
    }

    private double calculateSubtotal(Order order) {
        double total = 0;
        for (int i = 0; i < order.getPrices().size(); i++) {
            total += order.getPrices().get(i) * order.getQuantities().get(i);
        }
        return total;
    }

    private double applyDiscount(double amount, Order order) {
        DiscountStrategy strategy =
                DiscountFactory.getStrategy(order.getDiscountCode());
        return strategy.apply(amount);
    }

    private double applyCustomerDiscount(double amount, Order order) {
        if (order.getCustomerType() == CustomerType.VIP) {
            return amount * 0.95;
        }
        return amount;
    }
}