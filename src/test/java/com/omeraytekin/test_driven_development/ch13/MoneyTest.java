package com.omeraytekin.test_driven_development.ch13;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class MoneyTest {
    @Test
    public void testMultiplication() {
        Money fiveDolar = Money.dollar(5);
        assertEquals(Money.dollar(10), fiveDolar.times(2));
        assertEquals(Money.dollar(15), fiveDolar.times(3));
    }

    @Test
    public void testEquality() {
        assertTrue(Money.dollar(5).equals(Money.dollar(5)));
        assertFalse(Money.dollar(6).equals(Money.dollar(5)));
        assertFalse(Money.franc(5).equals(Money.dollar(5)));
    }

    @Test
    public void testSimpleAddition() {
        Money fiveDollar = Money.dollar(5);
        Expression sum = fiveDollar.plus(fiveDollar);
        Bank bank = new Bank();
        Money reduced = bank.reduce(sum, "USD");
        assertEquals(Money.dollar(10), reduced);
    }

    @Test
    public void testPlusReturnsSum() {
        Money fiveDollar = Money.dollar(5);
        Expression result = fiveDollar.plus(fiveDollar);
        Sum sum = (Sum) result;
        assertEquals(fiveDollar, sum.augend);
        assertEquals(fiveDollar, sum.addend);
    }

    @Test
    public void testReduceSum() {
        Expression sum = new Sum(Money.dollar(3), Money.dollar(4));
        Bank bank = new Bank();
        Money result = bank.reduce(sum, "USD");
        assertEquals(Money.dollar(7), result);
    }

    @Test
    public void testReduceMoney() {
        Bank bank = new Bank();
        Money result = bank.reduce(Money.dollar(1), "USD");
        assertEquals(Money.dollar(1), result);
    }
}
