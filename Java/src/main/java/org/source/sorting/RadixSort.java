package org.source.sorting;

import java.util.Arrays;
import java.util.Random;

public class RadixSort<T extends Comparable<T>> {
    /**
     * Implementation of the Radix Sort Algorithm using Generics
     * worst case: O(d⋅(n+k)), where k is the range of the input (maximum element), d is the number of digits in the maximum element
     *
     * @param array Array which needs to be sorted
     */
     public int[] sort(int[] array) {
         int[] positive = Arrays.stream(array).filter(num -> num >= 0).toArray();
         int[] negative = Arrays.stream(array).filter(num -> num < 0).toArray();

         // Sort positive numbers
         int max = getMax(positive);
         int exp = 1;
         while (max / exp > 0) {
             countingSort(positive, exp);
             exp *= 10;
         }

         // Sort negative numbers (convert to positive for sorting, then revert)
         for (int i = 0; i < negative.length; i++) {
             negative[i] *= -1;
         }
         max = getMax(negative);
         exp = 1;
         while (max / exp > 0) {
             countingSort(negative, exp);
             exp *= 10;
         }
         for (int i = 0; i < negative.length; i++) {
             negative[i] *= -1;
         }

         // Merge positive and negative arrays back into the original array
         int posIndex = 0, negIndex = negative.length - 1, arrIndex = 0;
         while (negIndex >= 0) {
             array[arrIndex++] = negative[negIndex--];
         }
         while (posIndex < positive.length) {
             array[arrIndex++] = positive[posIndex++];
         }
         return array;
     }
    /**
     * Helper method: RadixSort Algorithm using two parameters;
     * @param array Array which needs to be sorted
     * @param exp Number of decimals
     */
    private void countingSort(int[] array, int exp) {
        int n = array.length;
        int[] output = new int[n];
        int[] count = new int[10];

        for (int i = 0; i < n; i++) {
            count[(array[i] / exp) % 10]++;
        }

        for (int i = 1; i < 10; i++) {
            count[i] += count[i - 1];
        }

        for (int i = n - 1; i >= 0; i--) {
            output[count[(array[i] / exp) % 10] - 1] = array[i];
            count[(array[i] / exp) % 10]--;
        }

        System.arraycopy(output, 0, array, 0, n);
    }

    /**
     * Helper method: gets the maximum value of element
     * @param array Array which needs to be sorted
     */
    private static int getMax(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        // Small-size array of integers
        RadixSort<Integer> radixSort = new RadixSort<>();
        int[] array = new int[25];
        for (int i = 0; i < 25; i++) {
            array[i] = new Random().nextInt();
        }

        System.out.println("The input array of integers is: " + Arrays.toString(array));

        array = radixSort.sort(array);

        System.out.println("The result is: " + Arrays.toString(array));
    }
}
