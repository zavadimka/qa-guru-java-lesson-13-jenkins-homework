package tests.simple;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import tests.TestBase;

import static org.junit.jupiter.api.Assertions.assertTrue;

@Tag("Simple")
public class PositiveTests {

    @Test
    void positiveTest1(){
        assertTrue(true);
    }

    @Test
    void positiveTest2(){
        assertTrue(true);
    }

    @Test
    void positiveTest3(){
        assertTrue(true);
    }
}
