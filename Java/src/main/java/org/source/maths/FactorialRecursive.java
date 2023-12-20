package org.source.maths;

public class FactorialRecursive {
    /**
     * Calculates factorial of given number using recursion
     *
     * @param number Number
     * @return Factorial of the number
     */
    public static long factorial(int number) {
        if (number < 0) throw new IllegalArgumentException("Number cannot be negative!");
        if (number == 0 || number == 1) return 1;
        return number * factorial(--number);
    }

    public static void main(String[] args) {
        // Example with small number
        int number = 4;
        System.out.println("Factorial of the number " + number + " equals " + factorial(number));

        // Example with 0
        number = 0;
        System.out.println("Factorial of the number " + number + " equals " + factorial(number));
    }
}
