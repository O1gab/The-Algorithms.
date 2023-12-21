package org.source.sorting;
import java.util.Arrays;

public class QuickSort<T extends Comparable<T>> {
    /**
     * Implementation of the Quick Sort Algorithm using Generics
     * worst case: O(n²)
     *
     * @param array Array which needs to be sorted
     */
    public T[] sort(T[] array) {
        return sort(array, 0, array.length - 1); // Call the helper sort method with initial array bounds
    }

    /**
     * Helper sort method
     * @param array The given array
     * @param low The lower bound of the array
     * @param high The highest bound of the array
     */
    private T[] sort(T[] array, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(array, low, high);
            sort(array, low, pivotIndex - 1); // Recursively sort the left part of the array before the pivot
            sort(array, pivotIndex + 1, high); // Recursively sort the right part of the array after the pivot
        }
        return array;
    }

    /**
     * Method to partition the array into subarrays around a pivot element
     * @param array The given array
     * @param low The lower bound of the array
     * @param high The highest bound of the array
     */
    private int partition(T[] array, int low, int high) {
        T pivot = array[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (array[j].compareTo(pivot) < 0) {
                i++;
                swap(array, i, j);
            }
        }

        swap(array, i + 1, high); // Swap pivot element and first element > pivot
        return i + 1;
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
        QuickSort<Integer> quickSort = new QuickSort<>();
        Integer[] array = {3, 5, 6, 2, 1, 7, 89, 73, 91};

        System.out.println("The given input array of integers: " + Arrays.toString(array));

        quickSort.sort(array);
        System.out.println("The result after QuickSort: " + Arrays.toString(array));

    }
}