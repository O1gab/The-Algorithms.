package org.source.sorting;

import java.util.Arrays;
import java.util.Random;

public class SelectionSort<T extends Comparable<T>> {
    /**
     * Implementation of the Selection Sort Algorithm using Generics
     * worst case: O(n²)
     *
     * @param array Array which needs to be sorted
     */
    public T[] sort(T[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[minIndex].compareTo(array[j]) > 0) {
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                swap(array, i, minIndex);
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

    /* Some examples of using the algorithm */
    public static void main(String[] args) {


        // Example with unsorted array of integers
        SelectionSort<Integer> selectionSort = new SelectionSort<>();
        Integer[] array = {3, 5, 2, 4, 9, 0, 0, 0, 1, 45, 82009, Integer.MIN_VALUE};

        System.out.println("The input array of integers is: " + Arrays.toString(array));

        array = selectionSort.sort(array);

        System.out.println("The result is: " + Arrays.toString(array));


        // Example with big unsorted array of doubles
        SelectionSort<Double> selectionSort_double = new SelectionSort<>();
        Double[] array_2 = new Double[150];

        for (int i = 0; i < 150; i++) {
            array_2[i] = new Random().nextDouble();
        }

        System.out.println("The input array of doubles is: " + Arrays.toString(array_2));

        array_2 = selectionSort_double.sort(array_2);

        System.out.println("The result is: " + Arrays.toString(array_2));


        // Example with array of chars
        SelectionSort<Character> selectionSort_char = new SelectionSort<>();
        Character[] array_char = {'G', '(', 'A', ')', '1', 'O', 'q', '#', 'B', 'c'};

        System.out.println("The input array of chars is: " + Arrays.toString(array_char));

        array_char = selectionSort_char.sort(array_char);

        System.out.println("The result is: " + Arrays.toString(array_char));
    }
}
