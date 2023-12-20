package org.source.maths;

public class Factorial {
    /**
    * Calculates factorial of given number
     *
     * @param number Number
     * @return Factorial of the number
    */
    public static long factorial(int number) {
        if (number < 0) throw new IllegalArgumentException("Number cannot be negative!");

        long result = 1;
        for (int i = number; i > 0; i--) {
            result *= i;
        }
        return result;
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
