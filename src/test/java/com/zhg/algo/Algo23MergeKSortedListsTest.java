package com.zhg.algo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import spock.lang.Specification;

import java.util.ArrayList;
import java.util.List;

class Algo23MergeKSortedListsTest extends Specification {

    List<Algo23MergeKSortedLists.ListNode> listNodes = new ArrayList<>();
    Algo23MergeKSortedLists.ListNode head = new Algo23MergeKSortedLists.ListNode(0);
    Algo23MergeKSortedLists mergeKSortedLists = new Algo23MergeKSortedLists();


    @BeforeEach
    void setUp() {
        Algo23MergeKSortedLists.ListNode newListNode = head;

        for (int i = 1; i < 5; i++) {
            Algo23MergeKSortedLists.ListNode newNode = new Algo23MergeKSortedLists.ListNode(i);
            newListNode.next = newNode;
            newListNode = newListNode.next;
        }
        listNodes.add(head);

        head = new Algo23MergeKSortedLists.ListNode(1);
        newListNode = head;
        for (int i = 3; i < 8; i++) {
            Algo23MergeKSortedLists.ListNode newNode = new Algo23MergeKSortedLists.ListNode(i);
            newListNode.next = newNode;
            newListNode = newListNode.next;
        }
        listNodes.add(head);
    }

    @Test
    void mergeKLists() {
        Algo23MergeKSortedLists.ListNode[] listNodesArray = new Algo23MergeKSortedLists.ListNode[listNodes.size()];
        listNodes.toArray(listNodesArray);
        Algo23MergeKSortedLists.ListNode mergedListNode =
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