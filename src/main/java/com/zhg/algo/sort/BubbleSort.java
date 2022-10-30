package com.zhg.algo.sort;

/**
 * 冒泡排序
 *
 * @author zhanghongang
 * @date 2022/10/30
 */
public class BubbleSort {

    /**
     * 冒泡排序
     *
     * 题解：
     * 1 第1层循环，从后往前
     * 2 第2层循环，从前往后
     *  第1个元素和第2个元素比较，如果第1个元素比第2个元素大，交易两个元素
     *  继续比较
     *
     * 时间复杂度：n^2
     * 空间复杂度：1
     * 是否稳定排序：是
     *
     * @param nums num数组
     */
    public void bubbleSort(int[] nums) {
        if ((nums == null) || (nums.length < 2)) {
            return;
        }

        for (int i = nums.length-1; i > 0; i--) {
            // 数据交换标志
            boolean isSwapFlag = false;
            for (int j = 0; j < i; j++) {
                if (nums[j] > nums[j+1]) {
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;

                    isSwapFlag = true;
                }
            }

            // 未交换数据，说明已经有序了，退出循环
            if (!isSwapFlag) {
                break;
            }
        }
    }
}
