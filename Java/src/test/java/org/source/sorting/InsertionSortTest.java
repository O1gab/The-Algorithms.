package org.source.sorting;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

public class InsertionSortTest {
    /**
     * Tests written with JUnit 5.8.1
     */
    private InsertionSort insertionSort;

    @BeforeEach
    void setUp() {
        this.insertionSort = new InsertionSort();
    }

    @Test
    void testEmptyArray() {
        Integer[] array = {};
        assertArrayEquals(new Integer[]{}, insertionSort.sort(array));
    }

    @Test
    void testSortedArray() {
        Integer[] sortedArray = {1, 2, 3, 4, 5};
        Integer[] expected = {1, 2, 3, 4, 5};
        assertArrayEquals(expected, insertionSort.sort(sortedArray));
    }

    @Test
    void testReverseSortedArray() {
        Integer[] reverseSortedArray = {5, 4, 3, 2, 1};
        Integer[] expected = {1, 2, 3, 4, 5};
        assertArrayEquals(expected, insertionSort.sort(reverseSortedArray));
    }

    @Test
    void testArrayWithDuplicates() {
        Integer[] arrayWithDuplicates = {3, 2, 5, 2, 1, 3};
        Integer[] expected = {1, 2, 2, 3, 3, 5};
        assertArrayEquals(expected, insertionSort.sort(arrayWithDuplicates));
    }

    @Test
    void testStringArray() {
        String[] array = {"c", "a", "e", "b", "d"};
        assertArrayEquals(new String[] {"a", "b", "c", "d", "e"}, insertionSort.sort(array));
    }

    @Test
    void testCharArray() {
        Character[] array = {'A', 'B', 'D', 'a', 'e', 'C', 'E', 'b', 'c', 'd'};
        Character[] expected = {'A', 'B', 'C', 'D', 'E', 'a', 'b', 'c', 'd', 'e'};
        assertArrayEquals(expected, insertionSort.sort(array));
    }

    @Test
    void testByteArray() {
        Byte[] array = {1, 9, 8, 4, 2, 4, 1};
        Byte[] expected = {1, 1, 2, 4, 4, 8, 9};
        assertArrayEquals(expected, insertionSort.sort(array));
    }
}
