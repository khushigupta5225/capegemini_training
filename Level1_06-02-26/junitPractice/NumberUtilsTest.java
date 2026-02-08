package junitPractice;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.*;
import org.junit.jupiter.params.provider.ValueSource;

public class NumberUtilsTest {

    NumberUtils n = new NumberUtils();

    @ParameterizedTest
    @ValueSource(ints = {2,4,6,7,9})
    void evenTest(int num) {
        if (num % 2 == 0)
            assertTrue(n.isEven(num));
        else
            assertFalse(n.isEven(num));
    }
}
