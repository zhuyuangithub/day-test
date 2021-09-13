package com.bone.leetcode.linked;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * @author: Zhuyuanyuan47
 * @description
 * @date: 2021/8/19 2:39 PM
 */

public class MoreLinkedSort {


    public SimpleNode merge(SimpleNode[] lists, int l, int r) {
        if (l == r) {
            return lists[l];
        }
        if (l > r) {
            return null;
        }
        int mid = l + r >> 1;
        return mergeTwoLists(merge(lists, l, mid), merge(lists, mid + 1, r));
    }


    public SimpleNode mergeTwoLists(SimpleNode a, SimpleNode b) {
        if (a == null || b == null) {
            return a == null ? b : a;
        }
        SimpleNode head = new SimpleNode(0);
        SimpleNode tail = head, aPtr = a, bPtr = b;
        while (aPtr != null && bPtr != null) {
            if (aPtr.val < bPtr.val) {
                tail.next = aPtr;
                aPtr = aPtr.next;
            } else {
                tail.next = bPtr;
                bPtr = bPtr.next;
            }
            tail = tail.next;
        }
        tail.next = aPtr != null ? aPtr : bPtr;
        return head.next;
    }


    public SimpleNode useQueue(SimpleNode[] lists) {

        SimpleNode head = new SimpleNode(0);

        PriorityQueue<SimpleNode> queue = new PriorityQueue<>(Comparator.comparingInt(o -> o.val));

        Arrays.stream(lists).forEach(simpleNode -> queue.offer(simpleNode));

        SimpleNode tmpNode = head;

        while (!queue.isEmpty()) {
            SimpleNode node = queue.poll();
            tmpNode.next = node;
            tmpNode = tmpNode.next;
            if(node.next != null) {
                queue.offer(node.next);
            }
        }

        return tmpNode.next;

    }

}
