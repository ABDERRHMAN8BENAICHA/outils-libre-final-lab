package com.pricing;

import java.util.List;

public class PricingEngine {

    public double calculate(List<Double> prices, List<Integer> quantities, String customerType, String discountCode) {
        double total = 0;

        for (int i = 0; i < prices.size(); i++) {
            total += prices.get(i) * quantities.get(i);
        }

        // discount
        if (discountCode.equals("SAVE10")) {
            total = total * 0.9;
        } else if (discountCode.equals("SAVE20")) {
            total = total * 0.8;
        }

        // customer type discount
        if (customerType.equals("VIP")) {
            total = total * 0.95;
        }

        // tax
        total = total * 1.19;

        return total;
    }
}