package com.bone.leetcode.linked;

/**
 * @author: Zhuyuanyuan47
 * @description
 * @date: 2021/8/19 11:26 AM
 */

public class TwoOrderLinks {

    public static void main(String[] args) {

    }

    public SimpleNode mergeTwoLists(SimpleNode l1, SimpleNode l2) {
        if (l1 == null) {
            return l2;
        } else if (l2 == null) {
            return l1;
        } else if (l1.val < l2.val){
            l1.next = mergeTwoLists(l1.next, l2);
            return l1;
        } else {
            l2.next = mergeTwoLists(l2.next, l1);
            return l2;
        }
    }

}
