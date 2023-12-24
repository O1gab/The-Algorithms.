package org.source.searching;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.Random;

public class BinarySearchTest {
    /**
     * Tests written with JUnit 5.8.1
     */
    private BinarySearch binarySearch;
    private BinarySearchRecursive binarySearchRecursive;

    @BeforeEach
    void setUp() {
        this.binarySearch = new BinarySearch();
        this.binarySearchRecursive = new BinarySearchRecursive();
    }

    @Test
    void testEmptyArray() {
        Integer[] array = {};
        Assertions.assertEquals(-1, binarySearch.find(array, 0));
        Assertions.assertEquals(-1, binarySearchRecursive.find(array, 0));
    }

    @Test
    void testSingleElementArray() {
        Double[] array = {2.7};
        Assertions.assertEquals(0, binarySearch.find(array, 2.7));
        Assertions.assertEquals(0, binarySearchRecursive.find(array, 2.7));

        Assertions.assertEquals(-1, binarySearch.find(array, 7.));
        Assertions.assertEquals(-1, binarySearchRecursive.find(array, 7.));
    }

    @Test
    void testArrayOfIntegers() {
        Integer[] array = new Integer[125];
        for (int i = 0; i < 125; i++) {
            array[i] = new Random().nextInt();
        }
        array[55] = 7; // random index
        Arrays.sort(array);
        Assertions.assertEquals(Arrays.stream(array).toList().indexOf(7), binarySearch.find(array, 7));
        Assertions.assertEquals(Arrays.stream(array).toList().indexOf(7), binarySearchRecursive.find(array, 7));
    }

    @Test
    void testArrayOfDoubles() {
        Double[] array = new Double[225];
        for (int i = 0; i < 225; i++) {
            array[i] = new Random().nextDouble();
        }
        array[37] = 91.9; // random index
        Arrays.sort(array);
        Assertions.assertEquals(Arrays.stream(array).toList().indexOf(91.9), binarySearch.find(array, 91.9));
        Assertions.assertEquals(Arrays.stream(array).toList().indexOf(91.9), binarySearchRecursive.find(array, 91.9));
    }

    @Test
    void testArrayOfStrings() {
        String[] array = {"Annabel", "Annika", "Ben", "Douglas", "Gregor", "Ivanka", "Johannes", "Kostas", "Peter", "Zara"};
        Assertions.assertEquals(3, binarySearch.find(array, "Douglas"));
        Assertions.assertEquals(3, binarySearchRecursive.find(array, "Douglas"));
        Assertions.assertEquals(9, binarySearch.find(array, "Zara"));
        Assertions.assertEquals(9, binarySearchRecursive.find(array, "Zara"));
    }

}
