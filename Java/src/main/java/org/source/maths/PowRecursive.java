package org.source.maths;

public class PowRecursive {
    public static long pow(int x, int y) {
        if (y == 0) return 1;
        return x * pow(x, y - 1);
    }

    public static void main(String[] args) {
        // Some examples
        System.out.println("2 to the power of 3 equals: " + pow(2, 3));
        System.out.println("25 to the power of 0 equals: " + pow(25, 0));
        System.out.println("100 to the power of 3 equals: " + pow(100, 3));
    }
}
