package com.omeraytekin.test_driven_development.money.ch5;

public class Franc {
    private int amount;

    public Franc(int amount) {
        this.amount = amount;
    }

    public Franc times(int multiplier) {
        return new Franc(amount * multiplier);
    }

    @Override
    public boolean equals(Object o) {
        Franc franc = (Franc) o;
        return amount == franc.amount;
    }
}
