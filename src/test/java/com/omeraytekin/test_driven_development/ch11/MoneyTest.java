package com.omeraytekin.test_driven_development.ch11;

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
}
