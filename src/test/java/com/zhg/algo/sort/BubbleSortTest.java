package com.zhg.algo.sort;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.*;

class BubbleSortTest {

    BubbleSort bubbleSort;
    int nums[];

    @BeforeEach
    void setUp() {
        bubbleSort = new BubbleSort();
        nums = new int[]{5, 2, 1, 3, 1, 1, 6, 6, 9};

        String collect = Arrays.stream(nums)
                .mapToObj(String::valueOf)
                .collect(Collectors.joining(","));
        System.out.println("param: " + collect);
    }

    @Test
    void bubbleSort() {
        bubbleSort.bubbleSort(nums);
    }

    @AfterEach
    void tearDown() {
        String collect = Arrays.stream(nums)
                .mapToObj(String::valueOf)
                .collect(Collectors.joining(","));
        System.out.println("result: " + collect);
    }
}