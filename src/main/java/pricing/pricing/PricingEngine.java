package pricing.pricing;

import java.util.List;

public class PricingEngine {

    public double calculate(List<Double> prices, List<Integer> quantities, String customerType, String discountCode) {
        double subtotal = calculateSubtotal(prices, quantities);
        double discounted = applyDiscount(subtotal, discountCode);
        double customerAdjusted = applyCustomerDiscount(discounted, customerType);
        return applyTax(customerAdjusted);
    }

    private double calculateSubtotal(List<Double> prices, List<Integer> quantities) {
        double total = 0;
        for (int i = 0; i < prices.size(); i++) {
            total += prices.get(i) * quantities.get(i);
        }
        return total;
    }

    private double applyDiscount(double total, String discountCode) {
        if ("SAVE10".equals(discountCode)) {
            return total * 0.9;
        } else if ("SAVE20".equals(discountCode)) {
            return total * 0.8;
        }
        return total;
    }

    private double applyCustomerDiscount(double total, String customerType) {
        if ("VIP".equals(customerType)) {
            return total * 0.95;
        }
        return total;
    }

    private double applyTax(double total) {
        return total * 1.19;
    }
}