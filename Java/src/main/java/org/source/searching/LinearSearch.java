package org.source.searching;

import java.util.Arrays;

public class LinearSearch<T extends Comparable<T>> {
    /**
     * Implementation of the Linear Search Algorithm using Generics
     * worst case: O(n)
     *
     * @param array Array where the search must be conducted
     * @param value Key value are searching for
     * @return Index of the key value (if the key value is not in the array, return -1)
     */
    public int find(T[] array, T value) {
        for (int i = 0; i < array.length; i++) {
            if (array[i].compareTo(value) == 0) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        // Example with array of integers
        LinearSearch linearSearch = new LinearSearch();
        Integer[] array = {45, 22, 4, 2, 4, 5, 9, 19199, Integer.MAX_VALUE, 7, 91, 1, 5, 0};
        Integer value = 19199;
        System.out.println("We are searching for " + value + " in " + Arrays.toString(array));
        System.out.println("Index of the value is " + linearSearch.find(array, value));

        // if array does not contain the value
        value = 777;
        System.out.println("We are searching for " + value + " in " + Arrays.toString(array));
        System.out.println("Index of the value is " + linearSearch.find(array, value));
    }
}
