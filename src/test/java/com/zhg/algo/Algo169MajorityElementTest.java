package com.zhg.algo;

import org.junit.jupiter.api.Test;
import spock.lang.Specification;

import java.util.Arrays;
import java.util.stream.Collectors;

class Algo169MajorityElementTest extends Specification {

    @Test
    void majorityElement() {
        Algo169MajorityElement majorityElement = new Algo169MajorityElement();
        int [] nums = new int[]{2, 2, 1, 1, 1, 2, 2};
        String nums_delimiter_comma = Arrays.stream(nums)
                .mapToObj(num -> String.valueOf(num))
                .collect(Collectors.joining(","));
        System.out.println(nums_delimiter_comma);
        int majorityElementValue = majorityElement.majorityElement(nums);
        System.out.println("majority element: " + majorityElementValue);
    }
}