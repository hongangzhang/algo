package com.zhg.algo;


import com.zhg.algo.common.ListNode;

/**
 * 141. 环形链表
 * 题目链接：https://leetcode.cn/problems/linked-list-cycle/
 *
 * @author zhanghongang
 * @date 2022/10/17
 */
public class Algo141LinkedListCycle {

    /**
     * 环形链表
     * 解法：快慢指针
     *  slow = head，每次走1步
     *  fast = head.next，每次走2步
     *  slow != fast，表示快慢指针没有相遇，即没有环
     *  fast == null || fast.next == null：没有环，返回 false
     * 时间复杂度: n
     * 空间复杂度: 1
     *
     * @param head 链表头结点
     * @return boolean
     */
    public boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) {
            return false;
        }

        ListNode slow = head;
        ListNode fast = head.next;
        while (slow != fast) {
            if (fast == null || fast.next == null) {
                return false;
            }

            slow = slow.next;
            fast = fast.next.next;
        }

        return true;
    }

}
