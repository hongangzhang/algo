package com.zhg.algo;

/**
 * 206. 反转链表
 * 题目链接：https://leetcode.cn/problems/reverse-linked-list/
 *
 * @author zhanghongang
 * @date 2022/10/17
 */
public class Algo206ReverseLinkedList {

    /**
     * 反转链表
     * 解法：循环
     * 时间复杂度: n
     * 空间复杂度: 1
     *
     * @param head 链表头结点
     * @return {@link int[]}
     */
    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode pre = null;
        ListNode current = head;
        ListNode next = null;
        while (current != null) {
            next = current.next;
            current.next = pre;
            pre = current;

            current = next;
        }

        return pre;
    }

    /**
     * 反转链表
     * 解法：递归
     * 时间复杂度: n
     * 空间复杂度: n
     *
     * @param head 链表头结点
     * @return {@link int[]}
     */
    public ListNode reverseList2(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode newHead = reverseList(head.next);
        head.next.next = head;
        head.next = null;

        return newHead;
    }

    static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
}
