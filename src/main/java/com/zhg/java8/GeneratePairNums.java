package com.zhg.java8;

import java.util.List;

import static java.util.stream.Collectors.toList;

/**
 * 生成数对
 * 题目：给定 [1,2,3] 和 [3,4]，生成 [(1,3),(1,4),(2,3),(2,4),(3,3),(3,4)]
 *
 * @author zhanghongang
 * @date 2022/11/15
 */
public class GeneratePairNums {

    /**
     * 生成数对
     *
     * @param nums1 nums1
     * @param nums2 nums2
     * @return {@link List}<{@link int[]}>
     */
    public List<int[]> generate(List<Integer> nums1, List<Integer> nums2) {
        return nums1.stream()
                .flatMap(num1 -> nums2.stream()
                        .map(num2 -> new int[]{num1, num2}))
                .collect(toList());
    }

}
