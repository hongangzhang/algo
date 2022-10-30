package com.zhg.algo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import spock.lang.Specification;

import java.util.Arrays;
import java.util.stream.Collectors;

class Algo41FirstMissingPositiveTest extends Specification {

    Algo41FirstMissingPositive firstMissingPositive;
    int [] nums;

    @BeforeEach
    void setUp() {
        firstMissingPositive = new Algo41FirstMissingPositive();

        nums = new int[]{3,4,-1,1};
        String nums_delimiter_comma = Arrays.stream(nums)
                .mapToObj(num -> String.valueOf(num))
                .collect(Collectors.joining(","));
        System.out.println(nums_delimiter_comma);
    }

    @Test
    void firstMissingPositive() {
        int firstMissingPositive = this.firstMissingPositive.firstMissingPositive(nums);
        System.out.println(firstMissingPositive);
    }
}