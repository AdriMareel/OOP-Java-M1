package com.junia.class4.lab3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class CalculatorTest {

    private final Calculator calculator = new Calculator();

    @Test
    void substractReturnsDifference() {
        assertEquals(2, calculator.substract(5, 3));
    }

    @Test
    void multiplyReturnsProduct() {
        assertEquals(15, calculator.multiply(5, 3));
    }

    @Test
    void isEvenDetectsEvenNumber() {
        assertTrue(calculator.isEven(4));
    }

    @Test
    void isEvenDetectsNotEvenNumber() {
        assertFalse(calculator.isEven(7));
    }
}
