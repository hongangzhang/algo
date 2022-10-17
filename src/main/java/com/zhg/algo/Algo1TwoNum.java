package com.zhg.algo;


import java.util.HashMap;
import java.util.Map;

/**
 * 两数之和
 * 题目链接：https://leetcode.cn/problems/two-sum/
 *
 * @author zhanghongang
 * @date 2022/10/16
 */
public class Algo1TwoNum {

    /**
     * 两数之和
     * 解法：哈希表
     * 时间复杂度: n
     * 空间复杂度: n
     *
     * @param nums   num数组
     * @param target 两数之和
     * @return {@link int[]}
     */
    public int[] twoSum(int[] nums, int target) {
        if (nums == null || nums.length < 2) {
            return new int[]{};
        }

        Map<Integer, Integer> numMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            // 哈希表存在和当前元素的和为 target 的元素：返回
            if (numMap.containsKey(target - nums[i])) {
                return new int[]{numMap.get(target - nums[i]), i};
            }
            // 哈希表不存在和当前元素的和为 target 的元素：当前元素加到哈希表
            numMap.put(nums[i], i);
        }

        return new int[]{};
    }

    /**
     * 两数之和
     * 解法：两层循环，暴力找到结果
     * 时间复杂度: n^2
     * 时间复杂度: 1
     *
     * @param nums   num数组
     * @param target 两数之和
     * @return {@link int[]}
     */
    public int[] twoSum2(int[] nums, int target) {
        if (nums == null || nums.length < 2) {
            return new int[]{};
        }

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                int twoNumSum = nums[i] + nums[j];
                if (twoNumSum == target) {
                    return new int[]{i, j};
                }
            }
        }

        return new int[]{};
    }

}
