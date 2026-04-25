package com.pricing.discount;

import com.pricing.enums.DiscountCode;

public class DiscountFactory {

    public static DiscountStrategy getStrategy(DiscountCode code) {
        return switch (code) {
            case SAVE10 -> new Save10Discount();
            case SAVE20 -> new Save20Discount();
            default -> new NoDiscount();
        };
    }
}