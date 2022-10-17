package com.zhg.algo;


/**
 * 41. 缺失的第一个正数
 * 题目链接：https://leetcode.cn/problems/first-missing-positive/
 *
 * @author zhanghongang
 * @date 2022/10/16
 */
public class Algo41FirstMissingPositive {

    /**
     * 缺失的第一个正数
     * 解法：归位法，每个正整数，放到对应下标的位置
     * 时间复杂度: n
     * 空间复杂度: 1
     *
     * @param nums num数组
     * @return {@link int[]}
     */
    public int firstMissingPositive(int[] nums) {

        if (nums == null || nums.length < 1) {
            return -1;
        }

        // 遍历数组，让每一个元素归位到对应下标的位置
        for (int i = 0; i < nums.length; i++) {
            // 循环判断，当前位置元素 大于0 && 小于数组长度 && 当前元素没有归位，即没有在对应下标的位置
            while (nums[i] > 0 && nums[i] <= nums.length && nums[i] != nums[nums[i]-1]) {
                int temp = nums[i];
                nums[i] = nums[temp-1];
                nums[temp-1] = temp;
            }
        }

        // 遍历数组，如果存在大于0的元素，返回 i+1
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != i+1) {
                return i+1;
            }
        }

        // 不存在大于0的元素，返回 length+1
        return nums.length + 1;
    }

    /**
     * 缺失的第一个正数
     * 解法：哈希表，数据会修改，先把所有的置为正数，再把满足的置为负数，第一个正数就是缺失的第一个正数
     * 时间复杂度: n
     * 空间复杂度: 1
     *
     * @param nums num数组
     * @return {@link int[]}
     */
    public int firstMissingPositive2(int[] nums) {

        if (nums == null || nums.length < 1) {
            return -1;
        }

        int length = nums.length;

        // 将数组中小于1的数，置为数组的长度+1
        for (int i = 0; i < length; i++) {
            if (nums[i] < 1) {
                nums[i] = length + 1;
            }
        }

        // 将数组中对应位置存在的数据置为负数
        for (int i = 0; i < length; i++) {
            // 当前元素的绝对值小于等于数组长度 && 当前元素对应下标的元素大于零：对应下标的元素取反
            int currentPositive = Math.abs(nums[i]);
            if (currentPositive <= length && nums[currentPositive-1] > 0) {
                nums[currentPositive-1] = - nums[currentPositive-1];
            }
        }

        // 遍历数组，如果存在大于0的元素，返回 i+1
        for (int i = 0; i < length; i++) {
            if (nums[i] > 0) {
                return i + 1;
            }
        }

        // 不存在大于0的元素，返回 length+1
        return length + 1;
    }

}
