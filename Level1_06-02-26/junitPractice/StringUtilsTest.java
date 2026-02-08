package junitPractice;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class StringUtilsTest {

    StringUtils s = new StringUtils();

    @Test void palindromeTest() {
        assertTrue(s.isPalindrome("madam"));
        assertFalse(s.isPalindrome("java"));
    }
}
