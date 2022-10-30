package com.zhg.algo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import spock.lang.Specification;

class Algo206ReverseLinkedListTest extends Specification {

    Algo206ReverseLinkedList reverseLinkedList = new Algo206ReverseLinkedList();
    Algo206ReverseLinkedList.ListNode head = new Algo206ReverseLinkedList.ListNode(0);

    @BeforeEach
    void setUp() {
        Algo206ReverseLinkedList.ListNode current = head;
        for (int i = 1; i < 5; i++) {
            Algo206ReverseLinkedList.ListNode newNode =
                    new Algo206ReverseLinkedList.ListNode(i);
            current.next = newNode;

            current = current.next;
        }

        current = head;

        System.out.println();
        while (current != null) {
            System.out.print(current.val);
            System.out.print(", ");
            current = current.next;
        }
        System.out.println();
    }

    @Test
    void reverseList() {
        Algo206ReverseLinkedList.ListNode newHead = reverseLinkedList.reverseList(head);
        System.out.println();

        while (newHead != null) {
            System.out.print(newHead.val);
            System.out.print(", ");
            newHead = newHead.next;
        }
        System.out.println();
    }

    @Test
    void reverseList2() {
    }
}