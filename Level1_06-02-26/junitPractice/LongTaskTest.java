package junitPractice;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

public class LongTaskTest {

    @Test
    @Timeout(2)
    void timeoutTest() throws InterruptedException {
        new LongTask().run();
    }
}

