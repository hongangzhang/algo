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
            ListNode newNode = new ListNode(i);
            newListNode.next = newNode;
            newListNode = newListNode.next;
        }
    }

    @Test
    void reverseKGroup() {
        ListNode listNode = algo25ReverseNodesInKgroup.reverseKGroup(head.next, 2);
    }
}