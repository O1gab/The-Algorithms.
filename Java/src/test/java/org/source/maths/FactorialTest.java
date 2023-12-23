package org.source.maths;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FactorialTest {
    /**
     * Tests written with JUnit 5.8.1
     */

    @Test
    void testZero() {
        Assertions.assertEquals(1, Factorial.factorial(0));
        Assertions.assertEquals(1, FactorialRecursive.factorial(0));
    }

    @Test
    void testNegativeNumber() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> Factorial.factorial(-55));
        Assertions.assertThrows(IllegalArgumentException.class, () -> FactorialRecursive.factorial(-55));
        Assertions.assertThrows(IllegalArgumentException.class, () -> Factorial.factorial(-1));
        Assertions.assertThrows(IllegalArgumentException.class, () -> FactorialRecursive.factorial(-1));
    }

    @Test
    void testSmallNumbers() {
        Assertions.assertEquals(2, Factorial.factorial(2));
        Assertions.assertEquals(2, FactorialRecursive.factorial(2));
        Assertions.assertEquals(6, Factorial.factorial(3));
        Assertions.assertEquals(6, FactorialRecursive.factorial(3));
        Assertions.assertEquals(120, Factorial.factorial(5));
        Assertions.assertEquals(120, FactorialRecursive.factorial(5));
    }

    @Test
    void testBigNumbers() {
        Assertions.assertEquals(3628800, Factorial.factorial(10));
        Assertions.assertEquals(3628800, FactorialRecursive.factorial(10));
        Assertions.assertEquals(479001600, Factorial.factorial(12));
        Assertions.assertEquals(479001600, FactorialRecursive.factorial(12));
    }
}
