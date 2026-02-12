package junitPractice;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

    Calculator c = new Calculator();

    @Test void addTest() {
        assertEquals(5, c.add(2,3));
    }

    @Test void divByZeroTest() {
        assertThrows(ArithmeticException.class,
                () -> c.div(10,0));
    }
}
