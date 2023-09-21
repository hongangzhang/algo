package com.zhg.algo;


import com.zhg.algo.common.ListNode;

/**
 * 82. 删除排序链表中的重复元素 II
 * 链接：https://leetcode.cn/problems/remove-duplicates-from-sorted-list-ii/
 * 描述：给定一个已排序的链表的头 head ， 删除原始链表中所有重复数字的节点，只留下不同的数字 。返回 已排序的链表 。
 * 提示：
 * 1 链表中节点数目在范围 [0, 300] 内
 * 2 -100 <= Node.val <= 100
 * 3 题目数据保证链表已经按升序 排列
 *
 * @author zhanghongang
 * @date 2023/09/21
 */
public class Algo82RemoveDuplicatesFromSortedList2 {

    /**
     * 删除排序链表中的重复元素 II
     * 解法：
     * 时间复杂度: n
     * 空间复杂度: n
     *
     * @param head 头结点
     * @return 最长子串的长度
     */
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode newHead = head;
        ListNode pre = head;
        ListNode deleteDupl = null;
        ListNode current = head;

        while (current != null && current.next != null) {
            // 删除重复元素除第一个以外的
            if (current.val == current.next.val) {
                current.next = current.next.next;
                deleteDupl = current;
                continue;
            }

            // 存在重复元素
            if (deleteDupl != null) {
                // 第一个元素是重复元素
                if (newHead.val == deleteDupl.val) {
                    newHead = newHead.next;
                    current = newHead;
                    pre = newHead;
                    continue;
                } else {
                    // 第一个元素不是重复元素
                    pre.next = current.next;
                    current = pre.next;
                }
                deleteDupl = null;
                continue;
            }

            // 不是重复元素
            pre = current;
            current = current.next;
        }

        // 去掉最后一个重复元素
        if (deleteDupl != null && deleteDupl.val == current.val) {
            // 不是第一个
            if (pre.next != null) {
                pre.next = pre.next.next;
            } else {
                // 只有一个重复元素
                newHead = null;
            }
        }
        return newHead;
    }

}
