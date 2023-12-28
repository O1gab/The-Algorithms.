package org.source.maths;

import org.junit.jupiter.api.Test;

public class PowTest {
    /**
     * Tests written with JUnit 5.8.1
     */

    @Test
    void testZero() {
        assert Pow.pow(0,0) == Math.pow(0, 0);
        assert Pow.pow(139392, 0) == Math.pow(139392, 0);
    }

    @Test
    void testNegativeNumbers() {
        assert Pow.pow(-3, 5) == Math.pow(-3, 5);
        assert Pow.pow(-1, 7) == Math.pow(-1, 7);
        assert Pow.pow(-101, 4) == Math.pow(-101, 4);
    }

    @Test
    void testDifferentValues() {
        assert Pow.pow(5757, 3) == Math.pow(5757, 3);
        assert Pow.pow(9, 17) == Math.pow(9, 17);
        assert Pow.pow(25, 3) == Math.pow(25, 3);
        assert Pow.pow(191, 7) == Math.pow(191, 7);
        assert Pow.pow(101, 2) == Math.pow(101, 2);
        assert Pow.pow(2, 55) == Math.pow(2, 55);
        assert Pow.pow(17, 4) == Math.pow(17, 4);
    }
}
