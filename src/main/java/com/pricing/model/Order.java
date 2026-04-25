package com.pricing.model;

import com.pricing.enums.CustomerType;
import com.pricing.enums.DiscountCode;

import java.util.List;

public class Order {

    private List<Double> prices;
    private List<Integer> quantities;
    private CustomerType customerType;
    private DiscountCode discountCode;

    public Order(List<Double> prices, List<Integer> quantities,
                 CustomerType customerType, DiscountCode discountCode) {
        this.prices = prices;
        this.quantities = quantities;
        this.customerType = customerType;
        this.discountCode = discountCode;
    }

    public List<Double> getPrices() { return prices; }
    public List<Integer> getQuantities() { return quantities; }
    public CustomerType getCustomerType() { return customerType; }
    public DiscountCode getDiscountCode() { return discountCode; }
}