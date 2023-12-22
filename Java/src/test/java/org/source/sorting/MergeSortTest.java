package org.source.sorting;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Random;

public class MergeSortTest {
    /**
     * Tests written with JUnit 5.8.1
     */
    private MergeSort mergeSort;

    @BeforeEach
    void setUp() {
        this.mergeSort = new MergeSort();
    }

    @Test
    void testEmptyArray() {
        Integer[] array = {};
        Assertions.assertArrayEquals(new Integer[]{}, mergeSort.sort(array));
    }

    @Test
    void testArrayOfIntegers() {
        Integer[] array = new Integer[100];
        for (int i = 0; i < 100; i++) {
            array[i] = new Random().nextInt();
        }
        System.out.println("Given array: " + Arrays.toString(array));
        System.out.println("Sorted array: " + Arrays.toString(mergeSort.sort(array)));
        Assertions.assertArrayEquals(Arrays.stream(array).sorted().toArray(), mergeSort.sort(array));
    }

    @Test
    void testArrayOfDoubles() {
        Double[] array = {3.3, 5.45, 92.7, 101.5, Double.MIN_VALUE, 3.4, 0.234234, 9.};
        Double[] expected = {Double.MIN_VALUE, 0.234234, 3.3, 3.4, 5.45, 9.0, 92.7, 101.5};
        System.out.println("Given array: " + Arrays.toString(array));
        System.out.println("Sorted array: " + Arrays.toString(mergeSort.sort(array)));
        Assertions.assertArrayEquals(expected, mergeSort.sort(array));
    }

    @Test
    void testArrayOfStrings() {
        String[] array = {"Anna", "Johannes", "Ben", "Florian", "Ben", "Ben", "Moritz"};
        String[] expected = {"Anna", "Ben", "Ben", "Ben", "Florian", "Johannes", "Moritz"};
        System.out.println("Given array: " + Arrays.toString(array));
        System.out.println("Sorted array: " + Arrays.toString(mergeSort.sort(array)));
        Assertions.assertArrayEquals(expected, mergeSort.sort(array));
    }
}
