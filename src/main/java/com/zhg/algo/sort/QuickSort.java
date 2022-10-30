package com.zhg.algo.sort;

/**
 * 快速排序
 *
 * @author zhanghongang
 * @date 2022/10/30
 */
public class QuickSort {

    /**
     * 快速排序
     *
     * @param nums num数组
     */
    public void quickSort(int[] nums) {
        if ((nums == null) || (nums.length < 2)) {
            return;
        }

        quickSort(nums, 0, nums.length - 1);
    }

    /**
     * 快速排序
     *
     * @param nums       num数组
     * @param startIndex 开始元素索引
     * @param endIndex   结束元素索引
     */
    private void quickSort(int[] nums, int startIndex, int endIndex) {

        if (startIndex >= endIndex) {
            return;
        }

        // 分区
        int pivot = partition(nums, startIndex, endIndex);

        quickSort(nums, startIndex, pivot - 1);

        quickSort(nums, pivot + 1, endIndex);
    }

    /**
     * 分区
     *
     * @param nums       num数组
     * @param startIndex 开始元素索引
     * @param endIndex   结束元素索引
     * @return int 分区的元素下标
     */
    public int partition(int[] nums, int startIndex, int endIndex) {
        int pivot = nums[endIndex];

        int i = startIndex;
        for (int j = startIndex; j < endIndex; j++) {
            if (nums[j] < pivot) {
                if (i != j) {
                    swap(nums, i, j);
                }
                i = i + 1;
            }
        }

        swap(nums, i, endIndex);

        return i;
    }

    /**
     * 分区
     *
     * @param nums       num数组
     * @param startIndex 开始元素索引
     * @param endIndex   结束元素索引
     * @return int 分区的元素下标
     */
    public int partition2(int[] nums, int startIndex, int endIndex) {
        int pivot = nums[endIndex];

        while (startIndex < endIndex) {
            while (nums[startIndex] <= pivot) {
                startIndex = startIndex + 1;
            }

            while (nums[endIndex] > pivot) {
                endIndex = endIndex - 1;
            }

            if (startIndex < endIndex) {
                swap(nums, startIndex, endIndex);
            }
        }

        return endIndex;
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

}
