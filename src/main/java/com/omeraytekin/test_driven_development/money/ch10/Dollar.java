package com.omeraytekin.test_driven_development.money.ch10;

public class Dollar extends Money {
    public Dollar(int amount, String currency) {
        super(amount, currency);
    }

    public Money times(int multiplier) {
        return new Dollar(amount * multiplier, "USD");
    }
}
