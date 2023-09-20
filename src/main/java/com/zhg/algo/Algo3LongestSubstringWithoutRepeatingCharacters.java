package com.zhg.algo;


import java.util.HashMap;

/**
 * 3. 无重复字符的最长子串
 * 链接：https://leetcode.cn/problems/longest-substring-without-repeating-characters/
 * 描述：给定一个字符串 s ，请你找出其中不含有重复字符的 最长子串 的长度。
 * 提示：
 * 1 0 <= s.length <= 5 * 104
 * 2 s 由英文字母、数字、符号和空格组成
 *
 * @author zhanghongang
 * @date 2023/09/20
 */
public class Algo3LongestSubstringWithoutRepeatingCharacters {

    /**
     * 无重复字符的最长子串
     * 解法：滑动窗口 + MAP
     * 时间复杂度: n
     * 空间复杂度: n
     *
     * @param s 字符串
     * @return 最长子串的长度
     */
    public int lengthOfLongestSubstring(String s) {
        if (s == null) {
            return 0;
        }

        // 最长子串的长度
        int max = 0;
        // 滑动窗口左侧的下标
        int left = 0;
        // 最长子串的 MAP
        HashMap<Character, Integer> strMap = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            // 如果当前字符已经在 最长子串 MAP 中
            if (strMap.containsKey(s.charAt(i))) {
                // 最长子串 MAP 中此字符的下标向右移动 1 位
                left = Math.max(left,strMap.get(s.charAt(i)) + 1);
            }

            strMap.put(s.charAt(i), i);
            max = Math.max(max, i - left + 1);
        }

        return max;
    }

}
