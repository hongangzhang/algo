package com.zhg.algo.sort;

/**
 * 插入排序
 *
 * @author zhanghongang
 * @date 2022/10/30
 */
public class InsertionSort {

    /**
     * 插入排序
     *
     * 时间复杂度：n^2
     * 空间复杂度：1
     * 是否稳定排序：是
     *
     * @param nums num数组
     */
    public void insertionSort(int[] nums) {
        if ((nums == null) || (nums.length < 2)) {
            return;
        }

        for (int i = 1; i < nums.length; i++) {
            // 记录需要插入的元素
            int current = nums[i];
            int j = i;
            for (; j > 0; j--) {
                // 从后往前比较，如果前面的元素大于后面的，则前面的往后移动
                if (nums[j-1] > current) {
                    nums[j] = nums[j-1];
                }
                // 如果前面的元素小于等于后面的，无需移动，退出循环
                else {
                    break;
                }
            }
            // 插入元素
            nums[j] = current;
        }
    }

}
