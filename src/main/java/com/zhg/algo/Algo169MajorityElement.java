package com.zhg.algo;


import java.util.Arrays;

/**
 * 大多数元素
 * 题目链接：https://leetcode.cn/problems/majority-element/
 *
 * @author zhanghongang
 * @date 2022/10/16
 */
public class Algo169MajorityElement {

    /**
     * 多数元素
     * 解法：拼杀抵消，留下的为大多数
     *
     * @param nums num数组
     * @return int
     */
    public int majorityElement(int[] nums) {
        if (nums == null || nums.length < 1) {
            return Integer.MIN_VALUE;
        }

        // 多数元素
        int majority = nums[0];
        // 多数元素的个数
        int count = 1;

        for (int i = 1; i < nums.length; i++) {
            // 当前元素等于大多数元素：大多数元素个数+1
            if (nums[i] == majority) {
                count++;
            }
            // 当前元素不等于大多数元素
            else {
                // 大多数元素的个数为0：大多数元素等于当前元素，个数为1
                if (count == 0) {
                    majority = nums[i];
                    count = 1;
                }
                // 大多数元素的个数大于0，拼杀掉一个元素：大多数元素个数-1
                else {
                    count--;
                }
            }
        }

        return majority;
    }

    /**
     * 多数元素
     * 解法：排序，取中间值
     *
     * @param nums num数组
     * @return int
     */
    public int majorityElement2(int[] nums) {
        if (nums == null || nums.length < 1) {
            return Integer.MIN_VALUE;
        }

        // 升序排序
        Arrays.sort(nums);

        // 取数组中间位置的下标：奇数为中间，偶数为中间-1
        int middleIndex = nums.length / 2;

        return nums[middleIndex];
    }

}
