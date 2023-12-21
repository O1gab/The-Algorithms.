package org.source.sorting;

import java.util.Arrays;

public class HeapSort<T extends Comparable<T>> {
    /**
     * Implementation of the Heap Sort Algorithm using Generics
     * worst case: O(n * log n)
     *
     * @param array Array which needs to be sorted
     */
    public T[] sort(T[] array) {
        int length = array.length;

        // Build heap (rearrange array)
        for (int i = length / 2 - 1; i >= 0; i--) {
            heap(array, length, i);
        }

        // One by one extract an element from heap
        for (int i = length - 1; i > 0; i--) {
            // Move current root to end
            swap(array, 0, i);

            // call max heapify on the reduced heap
            heap(array, i, 0);
        }
        return array;
    }

    /**
     * Rearranges the array elements to maintain the max-heap property at a given index.
     *
     * @param array The array to be modified into a max-heap
     * @param n Size of the heap
     * @param i Index of the node to heapify
     */
    private void heap(T[] array, int n, int i) {
        int largest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;

        // Check if left child is larger than root
        if (left < n && array[left].compareTo(array[largest]) > 0) {
            largest = left;
        }

        // Check if right child is larger than largest so far
        if (right < n && array[right].compareTo(array[largest]) > 0) {
            largest = right;
        }

        // If largest is not root
        if (largest != i) {
            swap(array, i, largest);

            // Recursively heapify the affected sub-tree
            heap(array, n, largest);
        }
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
        // Example with array of integers
        Integer[] array = {4, 10, 3, 5, 1};
        HeapSort<Integer> heapSort = new HeapSort<>();
        System.out.println("The given array: " + Arrays.toString(array));
        System.out.println("Result after Heap Sort: " + Arrays.toString(heapSort.sort(array)));

        // Test case 2: Larger array with doubles
        Double[] array_2 = {3.5, 6.2, 1.0, 9.8, 4.2, 2.7};
        HeapSort<Double> heapSort_2 = new HeapSort<>();
        System.out.println("The given array: " + Arrays.toString(array_2));
        System.out.println("Result after Heap Sort: " + Arrays.toString(heapSort_2.sort(array_2)));
    }
}
