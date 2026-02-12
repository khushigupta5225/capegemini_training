package junitPractice;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.util.*;

public class ListManagerTest {

    @Test void listTest() {
        ListManager lm = new ListManager();
        List<Integer> list = new ArrayList<>();

        lm.add(list, 10);
        lm.add(list, 20);

        assertEquals(2, lm.size(list));

        lm.remove(list, 10);
        assertEquals(1, lm.size(list));
    }
}
