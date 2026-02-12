package junitPractice;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class DividerTest {

    @Test void exceptionTest() {
        Divider d = new Divider();
        assertThrows(ArithmeticException.class,
                () -> d.divide(5,0));
    }
}
