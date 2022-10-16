package com.zhg.algo;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.*;

class Algo1TwoNumTest {

    @Test
    void twoSum() {
        Algo1TwoNum twoNum = new Algo1TwoNum();
        int [] nums = new int[]{2, 2, 1, 1, 1, 2, 2};
        String nums_delimiter_comma = Arrays.stream(nums)
                .mapToObj(num -> String.valueOf(num))
                .collect(Collectors.joining(","));
        System.out.println(nums_delimiter_comma);

        int[] result = twoNum.twoSum(nums, 3);

        String collect = Arrays.stream(result)
                .mapToObj(num -> String.valueOf(num))
                .collect(Collectors.joining(","));
        System.out.println("result: " + collect);
    }

    @Test
    void twoSum2() {
    }
}