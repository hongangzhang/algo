package com.zhg.algo;

import com.zhg.algo.common.ListNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import spock.lang.Specification;

class Algo141LinkedListCycleTest extends Specification {

    ListNode head = new ListNode(0);

    Algo141LinkedListCycle linkedListCycle = new Algo141LinkedListCycle();

    @BeforeEach
    void setUp() {
        ListNode current = head;

        for (int i = 0; i < 5; i++) {
            ListNode newNode = new ListNode(i);
            current.next = newNode;
            current = current.next;
        }

        current.next = head.next.next;
    }

    @Test
    void hasCycle() {
        boolean hasCycle = linkedListCycle.hasCycle(head);
        Assertions.assertEquals(true, hasCycle);
    }
}