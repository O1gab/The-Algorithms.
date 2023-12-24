package org.source.searching;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.Random;

public class LinearSearchTest {
    /**
     * Tests written with JUnit 5.8.1
     */
    private LinearSearch linearSearch;
    private LinearSearchRecursive linearSearchRecursive;

    @BeforeEach
    void setUp() {
        this.linearSearch = new LinearSearch();
        this.linearSearchRecursive = new LinearSearchRecursive();
    }

    @Test
    void testEmptyArray() {
        Integer[] array = {};
        Assertions.assertEquals(-1, linearSearch.find(array, 0));
        Assertions.assertEquals(-1, linearSearchRecursive.find(array, 0));
    }

    @Test
    void testSingleElementArray() {
        Float[] array = {54579.5F};
        Assertions.assertEquals(0, linearSearch.find(array, 54579.5f));
        Assertions.assertEquals(0, linearSearchRecursive.find(array, 54579.5f));
        Assertions.assertEquals(-1, linearSearch.find(array, Float.MAX_VALUE));
        Assertions.assertEquals(-1, linearSearchRecursive.find(array, Float.MAX_VALUE));
    }

    @Test
    void testArrayOfIntegers() {
        Integer[] array = new Integer[500];
        for (int i = 0; i < 500; i++) {
            array[i] = new Random().nextInt();
        }
        array[5] = 37;
        Arrays.sort(array);
        Assertions.assertEquals(Arrays.stream(array).toList().indexOf(37), linearSearch.find(array, 37));
        Assertions.assertEquals(Arrays.stream(array).toList().indexOf(37), linearSearchRecursive.find(array, 37));
    }

    @Test
    void testArrayOfLongs() {
        Long[] array = new Long[150];
        for (int i = 0; i < 150; i++) {
            array[i] = new Random().nextLong();
        }
        array[1] = 5050550L;
        Arrays.sort(array);
        Assertions.assertEquals(Arrays.stream(array).toList().indexOf(5050550L), linearSearch.find(array, 5050550L));
        Assertions.assertEquals(Arrays.stream(array).toList().indexOf(5050550L), linearSearchRecursive.find(array, 5050550L));
    }
}
