package com.zhg.algo.sort;

/**
 * 归并排序
 *
 * @author zhanghongang
 * @date 2022/10/30
 */
public class MergeSort {

    /**
     * 归并排序
     *
     * @param nums num数组
     */
    public void mergesort(int[] nums) {
        if ((nums == null) || nums.length < 2) {
            return;
        }

        mergesort(nums, 0, nums.length-1);
    }

    /**
     * 归并排序
     *
     * @param nums       num数组
     * @param startIndex 开始索引
     * @param endIndex   结束索引
     */
    private void mergesort(int[] nums, int startIndex, int endIndex) {
        if (startIndex >= endIndex) {
            return;
        }

        int middleIndex = (startIndex + endIndex) / 2;
        mergesort(nums, startIndex, middleIndex);
        mergesort(nums, middleIndex + 1, endIndex);

        merge(nums, startIndex, middleIndex, endIndex);
    }

    /**
     * 合并两个数组
     *
     * @param nums        num数组
     * @param startIndex  开始索引
     * @param middleIndex 中间索引
     * @param endIndex    结束索引
     */
    private void merge(int[] nums, int startIndex, int middleIndex, int endIndex) {
        if (startIndex >= endIndex) {
            return;
        }

        int i = startIndex;
        int j = middleIndex + 1;
        int[] tempNums = new int[endIndex - startIndex + 1];
        int k = 0;

        while ((i <= middleIndex) && (j <= endIndex)) {
            if (nums[i] <= nums[j]) {
                tempNums[k] = nums[i];
                i++;
            } else {
                tempNums[k] = nums[j];
                j++;
            }
            k++;
        }

        while (i <= middleIndex) {
            tempNums[k++] = nums[i++];
        }

        while (j <= endIndex) {
            tempNums[k++] = nums[j++];
        }

        for (k = 0; k < tempNums.length; k++) {
            nums[startIndex++] = tempNums[k];
        }
    }

}
