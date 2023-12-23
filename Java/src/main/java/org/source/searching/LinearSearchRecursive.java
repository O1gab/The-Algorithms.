package org.source.searching;

import java.util.Arrays;

public class LinearSearchRecursive<T extends Comparable<T>> {
    /**
     * Implementation of the Linear Search Algorithm using Generics and recursion
     * worst case: O(n)
     *
     * @param array Array where the search must be conducted
     * @param value Key value are searching for
     * @return Index of the key value (if the key value is not in the array, return -1)
     */
    public int find(T[] array, T value) {
        return search(array, value, 0);
    }

    /**
     * Helper function: recursively finds the value in the array by incrementing the index.
     * @param array Array where the search must be conducted
     * @param value The value being searched for
     * @param index Index of the array for search
     * @return Index of the value (if the value is not in the array, return -1)
     */
    private int search(T[] array, T value, int index) {
        if (array[index] == value) return index;
        if (index == array.length - 1) return -1;
        return search(array, value, index + 1);
    }

    public static void main(String[] args) {
        // Example with array of integers
        LinearSearchRecursive linearSearchRecursive = new LinearSearchRecursive();
        Integer[] array = {4, 7, 9, 3, 2, 1, 7, 19};
        Integer value = 19;
        System.out.println("We are searching for " + value + " in " + Arrays.toString(array));
        System.out.println("Index of the value is " + linearSearchRecursive.find(array, value));

        // if array does not contain the value
        value = 5;
        System.out.println("We are searching for " + value + " in " + Arrays.toString(array));
        System.out.println("Index of the value is " + linearSearchRecursive.find(array, value));
    }
}
