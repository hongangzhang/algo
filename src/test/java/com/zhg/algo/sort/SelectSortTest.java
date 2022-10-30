package com.zhg.algo.sort;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.assertTrue;

class SelectSortTest {

    SelectSort selectSort = new SelectSort();
    int[] nums;

    @BeforeEach
    void setUp() {
        selectSort = new SelectSort();
        nums = new int[]{5, 2, 1, 3, 1, 1, 6, 6, 9};
        String collect = Arrays.stream(nums)
                .mapToObj(String::valueOf)
                .collect(Collectors.joining(","));
        System.out.println("param: " + collect);
    }


    @Test
    void bubbleSort() {
        selectSort.selectSort(nums);

        assertTrue(Arrays.equals(new int[]{1, 1, 1, 2, 3, 5, 6, 6, 9}, nums));
    }

    @Test
    void bubbleSort2() {
        selectSort.selectSort2(nums);
        assertTrue(Arrays.equals(new int[]{1, 1, 1, 2, 3, 5, 6, 6, 9}, nums));
    }

    @AfterEach
    void tearDown() {
        String collect = Arrays.stream(nums)
                .mapToObj(String::valueOf)
                .collect(Collectors.joining(","));
        System.out.println("result: " + collect);
    }
}