package org.example;

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

}
