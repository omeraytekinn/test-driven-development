package com.omeraytekin.test_driven_development.money.ch8;

public class Dollar extends Money {
    public Dollar(int amount) {
        this.amount = amount;
    }

    public Money times(int multiplier) {
        return new Dollar(amount * multiplier);
    }
}
