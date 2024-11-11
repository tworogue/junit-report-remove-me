package org.example;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import java.util.stream.IntStream;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class YetAnotherTest {

    @ParameterizedTest
    @MethodSource("generateNumbers")
    void testIsPrime(int input) {
        for (int i = 0; i < 20; i++) {
            System.err.println("ERR: Running test: " + input);
            System.out.println("OUT: Running test: " + input);
        }
        assertTrue(isPrime(input));
    }

    public static IntStream generateNumbers() {
        return IntStream.range(1, 55);
    }

    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        if (number == 2 || number == 3) {
            return true;
        }
        if (number % 2 == 0 || number % 3 == 0) {
            return false;
        }

        int sqrt = (int) Math.sqrt(number);
        for (int i = 5; i <= sqrt; i += 6) {
            if (number % i == 0 || number % (i + 2) == 0) {
                return false;
            }
        }

        return true;
    }

}
