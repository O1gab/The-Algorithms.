package org.source.sorting;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Random;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class RadixSortTest {
    /**
     * Tests written with JUnit 5.8.1
     */
    private RadixSort radixSort;

    @BeforeEach
    void setUp() {
        this.radixSort = new RadixSort();
    }

    @Test
    void testEmptyArray() {
        int[] array = {};
        assertArrayEquals(new int[]{}, radixSort.sort(array));
    }

    @Test
    void testMiddleArray() {
        int[] array = new int[150];
        for (int i = 0; i < 150; i++) {
            array[i] = new Random().nextInt();
        }

        System.out.println("Given array: " + Arrays.toString(array));
        System.out.println("Sorted array: " + Arrays.toString(radixSort.sort(array)));
        Assertions.assertArrayEquals(Arrays.stream(array).sorted().toArray(), array);
    }

    @Test
    void testBigArray() {
        int[] array = new int[1000];
        for (int i = 0; i < 1000; i++) {
            array[i] = new Random().nextInt();
        }

        System.out.println("Given array: " + Arrays.toString(array));
        System.out.println("Sorted array: " + Arrays.toString(radixSort.sort(array)));
        Assertions.assertArrayEquals(Arrays.stream(array).sorted().toArray(), array);
    }
}
