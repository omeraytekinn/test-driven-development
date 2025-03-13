package com.omeraytekin.test_driven_development.ch6;

public abstract class Money {
    protected int amount;

    @Override
    public boolean equals(Object o) {
        Money dollar = (Money) o;
        return amount == dollar.amount;
    }
}
