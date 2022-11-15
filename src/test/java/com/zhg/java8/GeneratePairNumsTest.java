package com.zhg.java8;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class GeneratePairNumsTest {

    private GeneratePairNums generatePairNums;
    private List<Integer> nums1;
    private List<Integer> nums2;
    private List<int[]> expected_result;

    @BeforeEach
    void setUp() {
        generatePairNums = new GeneratePairNums();
        nums1 = Arrays.asList(1, 2, 3);
        nums2 = Arrays.asList(3, 4);
        expected_result = Arrays.asList(new int[]{1, 3},
                new int[]{1, 4},
                new int[]{2, 3},
                new int[]{2, 4},
                new int[]{3, 3},
                new int[]{3, 4});
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void should_generate_pair_nums() {
        List<int[]> generate = generatePairNums.generate(nums1, nums2);
        for (int i = 0; i < generate.size(); i++) {
            Assertions.assertArrayEquals(expected_result.get(i), generate.get(i));
        }
    }
}