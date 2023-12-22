package org.source.sorting;

import java.util.Arrays;

public class MergeSort<T extends Comparable<T>> {
    /**
     * Implementation of the Merge Sort Algorithm using Generics
     * worst case: O(n log n)
     *
     * @param array Array which needs to be sorted
     */
    public T[] sort(T[] array) {
        return mergeSort(array, 0, array.length - 1);
    }

    /**
     * Helper method: Merge Sort Algorithm using three parameters for easier work
     * @param array Array which needs to be sorted
     * @param left Left part of array (from beginning)
     * @param right Right part of array (from end)
     */
    private T[] mergeSort(T[] array, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;
            mergeSort(array, left, mid);
            mergeSort(array, mid + 1, right);
            return merge(array, left, mid, right);
        }
        return array;
    }

    /**
     * Helper method for merging
     * @param array Array which needs to be sorted
     * @param left Left part of array (from beginning)
     * @param right Right part of array (from end)
     * @param middle Middle of the given array
     */
    private T[] merge(T[] array, int left, int middle, int right) {
        int n1 = middle - left + 1;
        int n2 = right - middle;

        // Create temporary arrays
        T[] leftArray = Arrays.copyOfRange(array, left, middle + 1);
        T[] rightArray = Arrays.copyOfRange(array, middle + 1, right + 1);

        // Merge the temporary arrays
        int i = 0, j = 0;
        int k = left;
        while (i < n1 && j < n2) {
            if (leftArray[i] != null && rightArray[j] != null) {
                if (leftArray[i].compareTo(rightArray[j]) <= 0) {
                    array[k] = leftArray[i];
                    i++;
                } else {
                    array[k] = rightArray[j];
                    j++;
                }
            } else if (leftArray[i] == null) {
                array[k] = rightArray[j];
                j++;
            } else {
                array[k] = leftArray[i];
                i++;
            }
            k++;
        }

        // Copy remaining elements of leftArray[] if any
        while (i < n1) {
            array[k] = leftArray[i];
            i++;
            k++;
        }

        // Copy remaining elements of rightArray[] if any
        while (j < n2) {
            array[k] = rightArray[j];
            j++;
            k++;
        }
        return array;
    }

    public static void main(String[] args) {
        // Examlpe with array of integers
        Integer[] array = {12, 45, 3, 78, 23, 9, 17};
        System.out.println("The input array of integers is: " + Arrays.toString(array));
        MergeSort<Integer> mergeSort = new MergeSort<>();
        array = mergeSort.sort(array);
        System.out.println("The result is: " + Arrays.toString(array));

        // Example with array of strings
        String[] array_2 = {"apple", "orange", "banana", "grape", "pear"};
        System.out.println("The input array of strings is: " + Arrays.toString(array_2));
        MergeSort<String> mergeSort_2 = new MergeSort<>();
        array_2 = mergeSort_2.sort(array_2);
        System.out.println("The result is: " + Arrays.toString(array_2));
    }
}
