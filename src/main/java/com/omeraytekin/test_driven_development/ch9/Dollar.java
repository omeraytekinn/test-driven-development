package com.omeraytekin.test_driven_development.ch9;

public class Dollar extends Money {
    public Dollar(int amount, String currency) {
        super(amount, currency);
    }

    public Money times(int multiplier) {
        return new Dollar(amount * multiplier, "USD");
    }
}
