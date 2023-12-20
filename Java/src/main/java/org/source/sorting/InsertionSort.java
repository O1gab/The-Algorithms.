package org.source.sorting;

import java.util.Arrays;

public class InsertionSort<T extends Comparable<T>> {
    /**
     * Implementation of the Insertion Sort Algorithm using Generics
     * worst case: O(n²)
     *
     * @param array The array which needs to be sorted
     */
    public T[] sort(T[] array) {
        for (int i = 1; i < array.length; i++) {
            T value = array[i]; // current value
            int j = i - 1;

            while (j >= 0 && array[j].compareTo(value) > 0) { // change the position of values that are smaller than the current value
                array[j + 1] = array[j];
                j = j - 1;
            }
            array[j + 1] = value;
        }
        return array;
    }

    /* Some examples of using the algorithm */
    public static void main(String[] args) {
        // Small-size array of integers
        InsertionSort<Integer> insertionSort = new InsertionSort();
        Integer[] array = {5, 3, 4, 7};

        System.out.println("The input array of integers is: " + Arrays.toString(array));

        array = insertionSort.sort(array);

        System.out.println("The result is: " + Arrays.toString(array));


        // Middle-size array of doubles with repeating values
        InsertionSort<Double> insertionSort_2 = new InsertionSort();
        Double[] array_2 = {3.0, 0., 99.8, 43.657, 3.0, 2737., 7.3, 1.111, 70.5789, 59.59};

        System.out.println("The input array of doubles is: " + Arrays.toString(array_2));

        array_2 = insertionSort_2.sort(array_2);

        System.out.println("The result is: " + Arrays.toString(array_2));
    }
}