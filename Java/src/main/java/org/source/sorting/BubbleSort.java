package org.source.sorting;

import java.util.Arrays;

public class BubbleSort<T extends Comparable<T>> {
    /**
     * Implementation of the Bubble Sort Algorithm using Generics
     * worst case: O(n²)
     *
     * @param array Array to be sorted
     */
    public T[] sort(T[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j].compareTo(array[j + 1]) > 0) {
                    // Swap arr[j] and arr[j+1]
                    swap(array, j, j+1);
                }
            }
        }
        return array;
    }
    /**
     * This private method swaps elements within the given array
     * @param array The given array
     * @param i Index of the element to be swapped with the element at index j
     * @param j Index of the element to be swapped with the element at index i
     */
    private void swap(T[] array, int i, int j) {
        T temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static void main(String[] args) {
        // Example with small unsorted array of integers
        BubbleSort<Integer> bubbleSort = new BubbleSort<>();
        Integer[] array = {64, 34, 25, 12, 22, 11, 90};
        System.out.println("Array before sorting: " + Arrays.toString(array));

        array = bubbleSort.sort(array);
        System.out.println("Array after sorting: " + Arrays.toString(array));
    }
}
