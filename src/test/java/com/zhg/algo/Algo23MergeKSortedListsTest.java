package com.zhg.algo;

import com.zhg.algo.common.ListNode;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import spock.lang.Specification;

import java.util.ArrayList;
import java.util.List;

class Algo23MergeKSortedListsTest extends Specification {

    List<ListNode> listNodes = new ArrayList<>();
    ListNode head = new ListNode(0);
    Algo23MergeKSortedLists mergeKSortedLists = new Algo23MergeKSortedLists();


    @BeforeEach
    void setUp() {
        ListNode newListNode = head;

        for (int i = 1; i < 5; i++) {
            ListNode newNode = new ListNode(i);
            newListNode.next = newNode;
            newListNode = newListNode.next;
        }
        listNodes.add(head);

        head = new ListNode(1);
        newListNode = head;
        for (int i = 3; i < 8; i++) {
            ListNode newNode = new ListNode(i);
            newListNode.next = newNode;
            newListNode = newListNode.next;
        }
        listNodes.add(head);
    }

    @Test
    void mergeKLists() {
        ListNode[] listNodesArray = new ListNode[listNodes.size()];
        listNodes.toArray(listNodesArray);
        ListNode mergedListNode =
                mergeKSortedLists.
                        mergeKLists(listNodesArray);
        while (mergedListNode != null) {
            System.out.print(mergedListNode.val);
            System.out.print(", ");
            mergedListNode = mergedListNode.next;
        }
        System.out.println();
    }
}