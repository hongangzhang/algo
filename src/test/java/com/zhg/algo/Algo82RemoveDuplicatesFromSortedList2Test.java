package com.zhg.algo;

import com.zhg.algo.common.ListNode;
import com.zhg.algo.common.ListNodeUtil;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static com.zhg.algo.common.ListNodeUtil.print;


class Algo82RemoveDuplicatesFromSortedList2Test {

    Algo82RemoveDuplicatesFromSortedList2 algo = new Algo82RemoveDuplicatesFromSortedList2();

    @BeforeEach
    void setUp() {

    }

    @Test
    void deleteDuplicates() {
        ListNode head = ListNodeUtil.createOrderContainDuplNumList(6, 1);
        print(head);

        ListNode newHead = algo.deleteDuplicates(head);

        print(newHead);
    }
}