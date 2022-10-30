package com.zhg.algo.sort;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.*;

class QuickSortTest {

    QuickSort quickSort;
    int[] nums;

    @BeforeEach
    void setUp() {
        quickSort = new QuickSort();
        nums = new int[]{1, 3, 2, 1, 1, 5, 6, 2, 8, 9, 2};

        String before = Arrays.stream(nums).mapToObj(String::valueOf).collect(Collectors.joining(","));
        System.out.println("before: " + before);
    }

    @Test
    void quickSort() {
        quickSort.quickSort(nums);

    }

    @Test
    void partition() {
        quickSort.partition(nums, 0, nums.length -1);
    }

    @Test
    void partition2() {
        quickSort.partition2(nums, 0, nums.length -1);
    }

    @AfterEach
    void tearDown() {
        String after = Arrays.stream(nums).mapToObj(String::valueOf).collect(Collectors.joining(","));
        System.out.println("after: " + after);
    }
}