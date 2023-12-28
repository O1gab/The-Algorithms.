package org.source.maths;

public class Pow {
    /**
     * Returns the result of raising x to the power y (x^y)
     *
     * @param x base value
     * @param y power value
     * @return Factorial of the number
     */
    public static long pow(int x, int y) {
        long result = 1;
        for (int i = 0; i < y; i++) {
            result *= x;
        }
        return result;
    }

    public static void main(String[] args) {
        // Some examples
        System.out.println("2 to the power of 3 equals: " + pow(2, 3));
        System.out.println("25 to the power of 0 equals: " + pow(25, 0));
        System.out.println("100 to the power of 3 equals: " + pow(100, 3));
    }
}
