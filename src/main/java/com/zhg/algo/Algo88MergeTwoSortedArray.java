package com.zhg.algo;


/**
 * 88. 合并两个有序数组
 * 题目链接：https://leetcode.cn/problems/merge-sorted-array/
 *
 * @author zhanghongang
 * @date 2022/10/20
 */
public class Algo88MergeTwoSortedArray {

    /**
     * 合并两个有序数组
     * 解法：从两个数组的最大值开始比较，把最大值放到数组nums1
     * 时间复杂度: n+m
     * 空间复杂度: 1
     *
     * @param nums1 有序数组1
     * @param m     有序数组1元素个数
     * @param nums2 有序数组2
     * @param n     有序数组2元素个数
     */
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if (n < 1) {
            return;
        }

        // 从两个数组的最大值开始比较，把最大值放到数组nums1
        int i = m - 1;
        int j = n -1;
        int currentIndex = m + n -1;
        while ((i >= 0) && (j >= 0)) {
            if (nums1[i] <= nums2[j]) {
                nums1[currentIndex] = nums2[j];
                j = j - 1;
            } else {
                nums1[currentIndex] = nums1[i];

                i = i - 1;
            }
            currentIndex = currentIndex - 1;
        }

        // 合并nums2剩余元素（因为最终合并到nums1，所以nums1剩余元素无需合并）
        for (int k = j; k >= 0; k--) {
            nums1[currentIndex] = nums2[k];
            currentIndex = currentIndex - 1;
        }
    }

}
