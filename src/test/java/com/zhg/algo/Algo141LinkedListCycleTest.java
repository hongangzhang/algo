package com.zhg.algo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import spock.lang.Specification;

class Algo141LinkedListCycleTest extends Specification {

    Algo141LinkedListCycle.ListNode head = new Algo141LinkedListCycle.ListNode(0);

    Algo141LinkedListCycle linkedListCycle = new Algo141LinkedListCycle();

    @BeforeEach
    void setUp() {
        Algo141LinkedListCycle.ListNode current = head;

        for (int i = 0; i < 5; i++) {
            Algo141LinkedListCycle.ListNode newNode = new Algo141LinkedListCycle.ListNode(i);
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