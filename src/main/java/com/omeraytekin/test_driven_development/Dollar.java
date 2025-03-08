package com.omeraytekin.test_driven_development;

public class Dollar {
    public int amount;

    public Dollar(int amount) {
        this.amount = amount;
    }

    public void times(int multiplier) {
        amount = amount * multiplier;
    }
}
