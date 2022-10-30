package com.zhg.algo.sort;

/**
 * 选择排序
 *
 * @author zhanghongang
 * @date 2022/10/22
 */
public class SelectSort {

    /**
     * 选择排序
     *
     * 题解：
     * 1. 从第n个开始，找到最大的，和第n个交换 ==> 第n个元素为最大
     * 2. 从第n-1个开始，找到最大的，和第n-1个交换 ==> 第=n-1个元素为第2大
     * ......
     * n-1. 从第2个开始，找到最小的，和第2个交换 ==> 第2个元素为第n-1大
     * n. 第1个元素已为最大，无需再排序
     *
     * 时间复杂度：n^2
     * 空间复杂度：1
     * 是否稳定排序：否
     *
     * @param nums num数组
     */
    public void selectSort(int[] nums) {
        if ((nums == null) || (nums.length < 1)) {
            return;
        }

        for (int i = nums.length - 1; i > 0; i--) {
            int max = i;
            for (int j = i-1; j >= 0; j--) {
                if (nums[j] > nums[max]) {
                    max = j;
                }
            }

            // 交换位置：最小元素位置min 和 当前元素i
            swap(nums, i, max);
        }
    }

    /**
     * 选择排序
     * 题解：
     * 1. 从第1个开始，找到最小的，和第1个交换 ==> 第1个元素为最小
     * 2. 从第2个开始，找到最小的，和第2个交换 ==> 第2个元素为第2小
     * ......
     * n-1. 从第n-1个开始，找到最小的，和第n-1个交换 ==> 第n-1个元素为第n-1小
     * n. 第n个元素已为最大，无需再排序
     * 时间复杂度：n^2
     * 空间复杂度：1
     *
     * @param nums num数组
     */
    public void selectSort2(int[] nums) {
        if ((nums == null) || (nums.length < 2)) {
            return;
        }

        for (int i = 0; i < nums.length - 1; i++) {
            int min = i;
            for (int j = i; j < nums.length; j++) {
                if (nums[j] < nums[min]) {
                    min = j;
                }
            }

            // 交换位置：最小元素位置min 和 当前元素i
            swap(nums, i, min);
        }
    }

    /**
     * 交换int数组中 i下标 和 j下标 的元素
     *
     * @param nums num数组
     * @param i    index i
     * @param j  index j
     */
    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

}
