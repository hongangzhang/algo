package com.zhg.algo;

import com.zhg.algo.common.ListNode;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;


class Algo25ReverseNodesInKgroupTest {

    Algo25ReverseNodesInKgroup algo25ReverseNodesInKgroup = new Algo25ReverseNodesInKgroup();
    ListNode head;

    @BeforeEach
    void setUp() {

        ListNode newListNode = new ListNode(-1);
        head = newListNode;

        for (int i = 1; i < 5; i++) {
            newListNode.next = new ListNode(i);
            newListNode = newListNode.next;
        }
    }

    @Test
    void reverseKGroup() {
        ListNode newHead = algo25ReverseNodesInKgroup.reverseKGroup(head.next, 2);
        System.out.println();

        while (newHead != null) {
            System.out.print(newHead.val);
            System.out.print(", ");
            newHead = newHead.next;
        }
        System.out.println();
    }
}