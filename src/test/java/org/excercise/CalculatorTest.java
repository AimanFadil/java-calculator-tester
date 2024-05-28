package org.excercise;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    Calculator calc = new Calculator();
    @Test
    void add() {
        assertEquals(130, calc.add(100, 30) );
        assertEquals(28, calc.add(-2.2f, 30.2f) );
        assertEquals(25, calc.add(-15.3f, 40.3f) );
    }

    @Test
    void substract() {
        assertEquals(70,calc.substract(100, 30) );
        assertEquals(-21,calc.substract(-10.5f, 10.5f) );
        assertEquals(1.2f,calc.substract(86.5f, 85.3f),0.01);
    }

    @Test
    void divide() {
        assertEquals(3.3333333f, calc.divide(100, 30));
        assertEquals(-3.2, calc.divide(-25.6f, 8),0.01);
        assertEquals(3.95f, calc.divide(180.3f, 45.6f),0.01);
    }

    @Test
    void multiply() {
        assertEquals(3000,calc.multiply(100, 30));
        assertEquals(-253.2f,calc.multiply(-12, 21.1f),0.01);
        assertEquals(-4731.8f,calc.multiply(59, -80.2f),0.01);
    }
}