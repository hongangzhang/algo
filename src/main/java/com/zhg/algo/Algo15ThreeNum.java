package com.zhg.algo;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 三数之和
 * 题目链接：https://leetcode.cn/problems/3sum/
 *
 * @author zhanghongang
 * @date 2022/10/15
 */
public class Algo15ThreeNum {

    /**
     * 求三数之和
     *
     * @param nums num数组
     * @return {@link List}<{@link List}<{@link Integer}>>
     */
    public List<List<Integer>> threeSum(int[] nums) {
        // 数组为空或数组长度小于3，返回空数组
        if (nums == null || nums.length < 3) {
            return new ArrayList();
        }

        // 升序排序数组
        Arrays.sort(nums);

        // 如果升序数组的第一个值大于0或最后一个值小于0，则不可能出现三数之和等于0，返回空数组
        if (nums[0] > 0 || nums[nums.length - 1] < 0) {
            return new ArrayList();
        }

        // 循环数组找出三数之和等于0的三元组
        List<List<Integer>> tripleList = new ArrayList<>();
        // 从升序数组，第一个数字开始，倒数第3个结束，因为至少3个数组才能组成三元组，最后两个无法组成三元组
        for (int first = 0; first < nums.length - 2; first++) {

            // first 作为第1个元素，寻找第2个和第3个元素
            // 第2个元素从第2个元素后面开始，向后
            // 第3个元素从最后2个元素后面开始，向前
            int second = first + 1;
            int third = nums.length - 1;

            // 第2个元素的位置在第3个元素之前，一直寻找
            while (second < third) {
                // 三元组的值
                int tripleValue = nums[first] + nums[second] + nums[third];

                // 三元组大于0：第3个元素向前移动一个位置
                if (tripleValue > 0) {
                    third = third - 1;
                }
                // 三元组小于0：第2个元素向后移动一个位置
                else if (tripleValue < 0) {
                    second = second + 1;
                }
                // 三元组等于0：把三元组加入列表
                else {
                    List<Integer> triple = new ArrayList();
                    triple.add(nums[first]);
                    triple.add(nums[second]);
                    triple.add(nums[third]);
                    tripleList.add(triple);

                    // 跳过与第2个元素重复的元素
                    while (second < third && nums[second + 1] == nums[second]) {
                        second = second + 1;
                    }
                    second = second + 1;

                    // 跳过与第3个元素重复的元素
                    while (second < third && nums[third - 1] == nums[third]) {
                        third = third - 1;
                    }
                    third = third - 1;
                }
            }

            // 跳过与第1个元素重复的元素
            while (first < third && nums[first + 1] == nums[first]) {
                first = first + 1;
            }
        }

        return tripleList;
    }

}
