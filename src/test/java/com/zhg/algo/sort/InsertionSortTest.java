package com.zhg.algo.sort;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.*;

class InsertionSortTest {

    InsertionSort insertionSort;
    int[] nums;

    @BeforeEach
    void setUp() {
        insertionSort = new InsertionSort();
        nums = new int[]{5, 2, 1, 3, 1, 1, 6, 6, 9};

        String ori = Arrays.stream(nums)
                .mapToObj(String::valueOf)
                .collect(Collectors.joining(","));
        System.out.println("before: " + ori);
    }

    @Test
    void insertionSort() {
        insertionSort.insertionSort(nums);

        assertTrue(Arrays.equals(new int[]{1, 1, 1, 2, 3, 5, 6, 6, 9}, nums));
    }

    @AfterEach
    void tearDown() {
        String after = Arrays.stream(nums)
                .mapToObj(String::valueOf)
                .collect(Collectors.joining(","));
        System.out.println("after: " + after);
    }

}