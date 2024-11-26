package org.example;

import org.example.something.Calculator;
import org.example.something.Calculator2;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SomeTest {

    @Test
    @Disabled("Тест временно отключен")
    public void q() {
        Calculator calculator = new Calculator();
        int result = calculator.add(2, 3);
        assertEquals(5, result);
    }

    @Test
    public void w() {
        Calculator calculator = new Calculator();
        int result = calculator.add(2, 3);
        assertEquals(3, result);
    }

    @Test
    public void e() {
        Calculator2 calculator = new Calculator2();
        int result = calculator.add(2, 3);
        assertEquals(5, result);
    }

}
