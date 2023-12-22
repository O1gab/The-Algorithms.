package org.source.sorting;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

public class QuickSortTest {
    /**
     * Tests written with JUnit 5.8.1
     */
    private QuickSort quickSort;

    @BeforeEach
    void setUp() {
        this.quickSort = new QuickSort();
    }

    @Test
    void testEmptyArray() {
        Integer[] array = {};
        assertArrayEquals(new Integer[]{}, quickSort.sort(array));
    }

    @Test
    void testArrayOfIntegers() {
        Integer[] array = new Integer[50];

        for (int i = 0; i < 50; i++) {
            array[i] = new Random().nextInt();
        }
        System.out.println("Given array: " + Arrays.toString(array));
        Integer[] expected =  array;
        Arrays.sort(expected);
        System.out.println("Sorted array: " + Arrays.toString(array));
        assertArrayEquals(expected, quickSort.sort(array));
    }

    @Test
    void testArrayOfDoubles() {
        Double[] array = new Double[50];

        for (int i = 0; i < 50; i++) {
            array[i] = new Random().nextDouble();
        }
        System.out.println("Given array: " + Arrays.toString(array));
        Double[] expected =  array;
        Arrays.sort(expected);
        System.out.println("Sorted array: " + Arrays.toString(array));
        assertArrayEquals(expected, quickSort.sort(array));
    }

    @Test
    void testArrayOfFloat() {
        Float[] array = new Float[50];

        for (int i = 0; i < 50; i++) {
            array[i] = new Random().nextFloat();
        }
        System.out.println("Given array: " + Arrays.toString(array));
        Float[] expected =  array;
        Arrays.sort(expected);
        System.out.println("Sorted array: " + Arrays.toString(expected));
        assertArrayEquals(expected, quickSort.sort(array));
    }

    @Test
    void testArrayOfChars() {
        Character[] alphabet = new Character[]{'g', 'b', 'd', 'a', 'f', 'c', 'e', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        System.out.println("Given array: " + Arrays.toString(alphabet));
        Character[] expected = alphabet;
        Arrays.sort(expected);
        System.out.println("Sorted array: " + Arrays.toString(expected));
        assertArrayEquals(expected, quickSort.sort(alphabet));
    }
}
