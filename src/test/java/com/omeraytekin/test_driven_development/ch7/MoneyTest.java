package com.omeraytekin.test_driven_development.ch7;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class MoneyTest {

    @Test
    public void testMultiplication() {
        Dollar fiveDolar = new Dollar(5);
        Franc fiveFranc = new Franc(5);
        assertEquals(new Dollar(10), fiveDolar.times(2));
        assertEquals(new Dollar(15), fiveDolar.times(3));
        assertEquals(new Franc(10), fiveFranc.times(2));
        assertEquals(new Franc(15), fiveFranc.times(3));
    }

    @SuppressWarnings("unlikely-arg-type")
    @Test
    public void testEquality() {
        assertTrue(new Dollar(5).equals(new Dollar(5)));
        assertFalse(new Dollar(6).equals(new Dollar(5)));
        assertTrue(new Franc(5).equals(new Franc(5)));
        assertFalse(new Franc(6).equals(new Franc(5)));
        assertFalse(new Franc(5).equals(new Dollar(5)));
    }
}
