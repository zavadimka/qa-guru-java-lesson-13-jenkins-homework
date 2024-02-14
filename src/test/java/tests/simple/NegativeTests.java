package tests.simple;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

@Tag("Simple")
public class NegativeTests {

    @Test
    void negativeTest1(){
        assertTrue(false);
    }

    @Test
    void negativeTest2(){
        assertTrue(false);
    }

    @Test
    void negativeTest3(){
        assertTrue(false);
    }
}
