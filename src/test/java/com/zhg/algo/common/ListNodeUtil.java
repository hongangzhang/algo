package com.zhg.algo.common;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ListNodeUtil {

    public static ListNode createOrderNumList(int num) {
        ListNode head = new ListNode(0);

        for (int i = 1; i < 5; i++) {
            ListNode newNode = new ListNode(i);
            head.next = newNode;
            head = head.next;
        }

        return head.next;
    }

    public static ListNode createOutOfOrderNumList(int num) {
        ListNode head = new ListNode(0);

        // 使用 IntStream 生成数字范围，并放入 List
        List<Integer> numbers = IntStream.rangeClosed(1, num)
                .boxed()
                .collect(Collectors.toList());

        // 打乱列表顺序
        Collections.shuffle(numbers);

        for (int i = 1; i < numbers.size(); i++) {
            ListNode newNode = new ListNode(numbers.get(i));
            head.next = newNode;
            head = head.next;
        }

        return head.next;
    }

    public static ListNode createOrderContainDuplNumList(int num, int duplNum) {
        ListNode head = new ListNode(0);
        ListNode current = head;

        Random random = new Random();
        List<Integer> numbers = new ArrayList<>();
        // 生成指定范围内的可重复数字
        for (int i = 0; i < num + duplNum; i++) {
            int randomNumber = random.nextInt(num) + 1;
            numbers.add(randomNumber);
        }

        Collections.sort(numbers);

        for (int i = 0; i < numbers.size(); i++) {
            ListNode newNode = new ListNode(numbers.get(i));
            current.next = newNode;
            current = current.next;
        }

        return head.next;
    }

    public static void print(ListNode newHead) {
        System.out.println();

        while (newHead != null) {
            System.out.print(newHead.val);
            System.out.print(", ");
            newHead = newHead.next;
        }
        System.out.println();
    }

}
