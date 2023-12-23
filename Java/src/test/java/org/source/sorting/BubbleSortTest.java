package org.source.sorting;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.Random;

public class BubbleSortTest {
    /**
     * Tests written with JUnit 5.8.1
     */
    private BubbleSort bubbleSort;

    @BeforeEach
    void setUp() {
        this.bubbleSort = new BubbleSort();
    }

    @Test
    void testEmptyArray() {
        Integer[] array = {};
        Assertions.assertArrayEquals(new Integer[]{}, bubbleSort.sort(array));
    }

    @Test
    void testSingleElementArray() {
        Long[] array = {430480244848L};
        Assertions.assertArrayEquals(array, bubbleSort.sort(array));
    }

    @Test
    void testDuplicatesArray() {
        Double[] array = {5., 5., 5., 5., 5., 7., 9., 9., 7.};
        Assertions.assertArrayEquals(Arrays.stream(array).sorted().toArray(), bubbleSort.sort(array));
    }

    @Test
    void testArrayOfIntegers() {
        Integer[] array = new Integer[250];
        for (int i = 0; i < 250; i++) {
            array[i] = new Random().nextInt();
        }
        System.out.println("Given array: " + Arrays.toString(array));
        System.out.println("Sorted array: " + Arrays.toString(bubbleSort.sort(array)));
        Assertions.assertArrayEquals(Arrays.stream(array).sorted().toArray(), bubbleSort.sort(array));
    }

    @Test
    void testArrayOfFloats() {
        Float[] array = new Float[500];
        for (int i = 0; i < 500; i++) {
            array[i] = new Random().nextFloat();
        }
        System.out.println("Given array: " + Arrays.toString(array));
        System.out.println("Sorted array: " + Arrays.toString(bubbleSort.sort(array)));
        Assertions.assertArrayEquals(Arrays.stream(array).sorted().toArray(), bubbleSort.sort(array));
    }

    @Test
    void testArrayOfChars() {
        Character[] array = new Character[55];
        for (int i = 0; i < 55; i++) {
            Random random = new Random();
            array[i] = (char) (random.nextInt(26) + 'a');
        }
        System.out.println("Given array: " + Arrays.toString(array));
        System.out.println("Sorted array: " + Arrays.toString(bubbleSort.sort(array)));
        Assertions.assertArrayEquals(Arrays.stream(array).sorted().toArray(), bubbleSort.sort(array));
    }
}
