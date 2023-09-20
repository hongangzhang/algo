package com.zhg.algo;


import com.zhg.algo.common.ListNode;

import java.util.HashMap;

/**
 * 25. K 个一组翻转链表
 * 链接：https://leetcode.cn/problems/reverse-nodes-in-k-group/
 * 描述：给你链表的头节点 head ，每 k 个节点一组进行翻转，请你返回修改后的链表。
 * k 是一个正整数，它的值小于或等于链表的长度。如果节点总数不是 k 的整数倍，那么请将最后剩余的节点保持原有顺序。
 * 你不能只是单纯的改变节点内部的值，而是需要实际进行节点交换。
 * 提示：
 * 1 链表中的节点数目为 n
 * 2 1 <= k <= n <= 5000
 * 3 0 <= Node.val <= 1000
 *
 * @author zhanghongang
 * @date 2023/09/20
 */
public class Algo25ReverseNodesInKgroup {

    public ListNode reverseKGroup(ListNode head, int k) {
        // 每 k 个 Node 当做一个单链表翻转，最后不足 k 个 Node 不翻转

        // 参数检查
        if(head == null || head.next == null || k <= 1) {
            return head;
        }

        ListNode newHead = null;
        ListNode pre = null;
        int nodeSplitKnum = 0;
        int nodeNum = 0;

        ListNode current = head;
        ListNode curKnodeStart = head;
        ListNode nextKnodeStart;
        while(current != null) {
            // 最后不足k个
            if (current.next == null && nodeSplitKnum < k - 1) {
                pre.next = curKnodeStart;
                break;
            }

            if(nodeSplitKnum == k - 1) {
                nextKnodeStart = current.next;
                current.next = null;

                // 翻转单个链表
                ListNode currentHead = reverse(curKnodeStart, pre);
                if (nodeNum == k - 1) {
                    newHead = currentHead;
                }
                pre = curKnodeStart;
                curKnodeStart = nextKnodeStart;
                current = nextKnodeStart;
                nodeSplitKnum = 0;
            } else {
                current = current.next;
                nodeSplitKnum = nodeSplitKnum+1;
            }
            nodeNum = nodeNum + 1;
        }

        return newHead;

    }

    private ListNode reverse(ListNode head, ListNode preNode) {
        if(head == null || head.next == null) {
            return head;
        }

        ListNode pre = null;
        ListNode now = head;
        ListNode next;

        while(now != null) {
            next = now.next;
            now.next = pre;
            pre = now;

            now = next;
        }

        if (preNode != null) {
            preNode.next = pre;
        }

        return pre;
    }

}
