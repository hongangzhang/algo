package com.zhg.algo;


import com.zhg.algo.common.ListNode;

/**
 * 23. 合并K个升序链表
 * 题目链接：https://leetcode.cn/problems/merge-k-sorted-lists/
 *
 * @author zhanghongang
 * @date 2022/10/20
 */
public class Algo23MergeKSortedLists {

    /**
     * 合并K个升序链表
     * 解法：两两合并链表
     * 时间复杂度: n
     * 空间复杂度: 1
     *
     * @param lists 多个链表的数组
     * @return {@link ListNode}
     */
    public ListNode mergeKLists(ListNode[] lists) {
        if ((lists == null) || (lists.length < 1)) {
            return null;
        }

        // 判断数组里面的链表是否都为空
        boolean isEmptyList = true;
        for (int i = 0; i < lists.length; i++) {
            if (lists[i] != null) {
                isEmptyList = false;
                break;
            }
        }
        // 数组里面的链表都为空，返回
        if (isEmptyList) {
            return null;
        }

        // 顺序合并数组中的有序链表
        ListNode newHead = lists[0];
        for (int i = 1; i < lists.length; i++) {
            newHead = mergeTwoListNode(newHead, lists[i]);
        }

        return newHead;
    }

    private ListNode mergeTwoListNode(ListNode head1, ListNode head2) {
        if (head1 == null) {
            return head2;
        }

        if (head2 == null) {
            return head1;
        }

        ListNode p1 = head1;
        ListNode p2 = head2;
        ListNode newHead = new ListNode(-1);
        ListNode current = newHead;

        while ((p1 != null) && (p2 != null)) {
            if (p1.val <= p2.val) {
                current.next =  p1;
                p1 = p1.next;
            } else {
                current.next = p2;
                p2 = p2.next;
            }
            current = current.next;
        }

        if (p1 == null) {
            current.next = p2;
        }

        if (p2 == null) {
            current.next = p1;
        }

        return newHead.next;
    }

}
