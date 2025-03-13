package com.omeraytekin.test_driven_development.ch13;

public class Bank {
    public Money reduce(Expression source, String to) {
        return source.reduce(to);
    }
}
