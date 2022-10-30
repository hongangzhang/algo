package com.zhg.algo.sort;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.*;

class MergeSortTest {

    MergeSort mergeSort;
    int[] nums;

    @BeforeEach
    void setUp() {
        mergeSort = new MergeSort();
        nums = new int[]{1, 3, 2, 1, 1, 5, 6, 2, 8, 9, 2};

        String before = Arrays.stream(nums).mapToObj(String::valueOf).collect(Collectors.joining(","));
        System.out.println("before: " + before);
    }

    @AfterEach
    void tearDown() {
        String after = Arrays.stream(nums).mapToObj(String::valueOf).collect(Collectors.joining(","));
        System.out.println("after: " + after);
    }

    @Test
    void mergesort() {
        mergeSort.mergesort(nums);
    }
}