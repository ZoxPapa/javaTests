import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import seminars.third.hw.MainHW;

import static org.junit.jupiter.api.Assertions.*;

public class Homework6tests {
    MainHW main;
    @BeforeEach
    void createMain(){
        this.main = new MainHW();
    }

    @Test
    void evenOddCheckTrueTest(){
        assertTrue(main.evenOddCheck(2));
        assertTrue(main.evenOddCheck(-16));
        assertTrue(main.evenOddCheck(0));
        assertFalse(main.evenOddCheck(1));
        assertFalse(main.evenOddCheck(-3));
    }
    @ParameterizedTest
    @ValueSource(ints = {26, 50, 99})
    void intInIntervalTest(int n){
        assertTrue(main.numberInInterval(n));
    }

    @ParameterizedTest
    @ValueSource(ints = {-100, 25, 100, 1234})
    void intOutIntervalTest(int n){
        assertFalse(main.numberInInterval(n));
    }
}

