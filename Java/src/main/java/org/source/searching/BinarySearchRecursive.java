package org.source.searching;

import java.util.Arrays;

public class BinarySearchRecursive<T extends Comparable<T>> {
    /**
     * Implementation of the Binary Search Algorithm using Generics and recursion
     * worst case: O(log n)
     *
     * @param array Array where the search must be conducted
     * @param value Key value are searching for
     * @return Index of the key value (if the key value is not in the array, return -1)
     */
    public int find(T[] array, T value) {
        return binarySearch(array, value, 0, array.length - 1);
    }

    private <T extends Comparable<T>> int binarySearch(T[] array, T value, int left, int right) {
        if (left > right) {
            return -1; // Base case: Element not found
        }

        int middle = left + (right - left) / 2;
        int compareResult = array[middle].compareTo(value);

        if (compareResult == 0) {
            return middle; // Element found at mid index
        } else if (compareResult < 0) {
            return binarySearch(array, value, middle + 1, right); // Search in the right half
        } else {
            return binarySearch(array, value, left, middle - 1); // Search in the left half
        }
    }

    public static void main(String[] args) {
        // Example with array of integers
        BinarySearchRecursive<Integer> binarySearch = new BinarySearchRecursive<>();
        Integer[] array = {1, 2, 3, 5, 7, 9, 27};
        Integer value = 7;

        System.out.println("We are searching for " + value + " in " + Arrays.toString(array));
        System.out.println("Index of the value is " + binarySearch.find(array, value));

        // if array does not contain the value
        value = 19;
        System.out.println("We are searching for " + value + " in " + Arrays.toString(array));
        System.out.println("Index of the value is " + binarySearch.find(array, value));
    }
}
