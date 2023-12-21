package org.source.sorting;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Random;

public class SelectionSortTest {
    /**
     * Tests written with JUnit 5.8.1
     */
    private SelectionSort selectionSort;

    @BeforeEach
    void setUp() {
        this.selectionSort = new SelectionSort();
    }

    @Test
    void testEmptyArray() {
        Integer[] array = {};
        Assertions.assertArrayEquals(new Integer[]{}, array);
    }

    @Test
    void testIntegerArray() {
        Integer[] array = new Integer[150];
        for (int i = 0; i < 150; i++) {
            array[i] = new Random().nextInt();
        }
        System.out.println("Given array: " + Arrays.toString(array));
        Integer[] expected = array;
        Arrays.sort(expected);
        System.out.println("Sorted array: " + Arrays.toString(expected));
        Assertions.assertArrayEquals(expected, array);
    }

    @Test
    void testDoubleArray() {
        Double[] array = new Double[150];
        for (int i = 0; i < 150; i++) {
            array[i] = new Random().nextDouble();
        }
        System.out.println("Given array: " + Arrays.toString(array));
        Double[] expected = array;
        Arrays.sort(expected);
        System.out.println("Sorted array: " + Arrays.toString(expected));
        Assertions.assertArrayEquals(expected, array);
    }

    @Test
    void testFloatArray() {
        Float[] array = new Float[500];
        for (int i = 0; i < 500; i++) {
            array[i] = new Random().nextFloat();
        }
        System.out.println("Given array: " + Arrays.toString(array));
        Float[] expected = array;
        Arrays.sort(expected);
        System.out.println("Sorted array: " + Arrays.toString(expected));
        Assertions.assertArrayEquals(expected, array);
    }

    @Test
    void testStringArray() {
        String[] array = {"A", "F", "B", "E", "C", "D", "G"};
        String[] expected = {"A", "B", "C", "D", "E", "F", "G"};
        Assertions.assertArrayEquals(expected, selectionSort.sort(array));
    }
}
