package org.source.sorting;

import java.util.Arrays;

public class BubbleSortRecursive<T extends Comparable<T>> {
    /**
     * Implementation of the Bubble Sort Algorithm using Generics and recursion
     * worst case: O(n²)
     *
     * @param array Array to be sorted
     */
    public T[] sort(T[] array) {
        return recursiveBubbleSort(array, array.length);
    }

    /**
     * Helper sort method
     * @param array The given array
     * @param length Length of the array
     */
    private T[] recursiveBubbleSort(T[] array, int length) {
        // Base case: If array has only one element, it's already sorted
        if (length == 1) {
            return array;
        }

        for (int i = 0; i < length - 1; i++) {
            if (array[i].compareTo(array[i + 1]) > 0) {
                // Swap arr[i] and arr[i+1]
                T temp = array[i];
                array[i] = array[i + 1];
                array[i + 1] = temp;
            }
        }

        // Recursively call sort with a smaller portion of the array
        return recursiveBubbleSort(array, length - 1);
    }

    public static void main(String[] args) {
        // Example with small unsorted array of integers
        BubbleSortRecursive<Integer> bubbleSortRecursive = new BubbleSortRecursive<>();
        Integer[] array = {64, 34, 25, 12, 22, 11, 90};
        System.out.println("Array before sorting: " + Arrays.toString(array));

        array = bubbleSortRecursive.sort(array);
        System.out.println("Array after sorting: " + Arrays.toString(array));
    }

}
