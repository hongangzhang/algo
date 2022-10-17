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
     * 终止条件：头结点为 null 或 头结点的下一个结点为 null，表示到最后一个结点了
     * 递推公式：newHead = f(head.next)
     * 为了翻转链表，假设 head.next 后面的已经翻转好了，此时只需要把
     * head.next 指向 head：head.next.next = head;
     * head.next 作为最后一个结点指向 null：head.next = null;
     * 原始：1 -> 2 -> 3 -> 4 -> 5  -> null
     *
     * 最后一次往前递推；
     * 第1次递归：1 -> 2 -> 3 -> 4 <- 5
     * 4.next = null
     * 第2次递归：1 -> 2 -> 3 <- 4 <- 5
     * 3.next = null
     * 第3次递归：1 -> 2 <- 3 <- 4 <- 5
     * 2.next = null
     * 第4次递归：null <- 1 <- 2 <- 3 <- 4 <- 5
     *
     * 整体考虑：
     * 第一次递归：1 -> 2 <- 3 <- 4 <- 5，此时 2 的 next 为 null，1 的 next 为 2
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
            this.next = null;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
}
