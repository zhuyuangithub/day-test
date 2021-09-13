package com.bone.leetcode.linked;


/**
 * @author: Zhuyuanyuan47
 * @description 给你一个链表，删除链表的倒数第 n 个结点，并且返回链表的头结点。
 *
 * 进阶：你能尝试使用一趟扫描实现吗？
 * @date: 2021/8/18 5:41 PM
 */

public class DeleteBackCountLinked {

    public static void main(String[] args) {

    }


    public int traverse(SimpleNode node, int n) {
        if (node == null) {
            return 0;
        }
        int count = traverse(node.next, n);
        if (count == n) {
            node.next = node.next.next;
        }
        return count + 1;
    }

}
