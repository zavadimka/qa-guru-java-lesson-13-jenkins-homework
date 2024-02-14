package tests.simple;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

@Tag("Simple")
public class SkippedTests {

    @Test
    @Disabled("Some reason")
    void skippedTest1(){
        assertTrue(true);
    }

    @Test
    @Disabled("Some reason")
    void skippedTest2(){
        assertTrue(true);
    }

    @Test
    @Disabled("Some reason")
    void skippedTest3(){
        assertTrue(true);
    }
}
