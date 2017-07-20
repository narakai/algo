package com.company;

/**
 * Created by laileon on 2017/7/20.
 */
//双向链表
public class DListNode {
    int val;
    DListNode prev, next;

    public DListNode(int val, DListNode prev, DListNode next) {
        this.val = val;
        this.prev = null;
        this.next = null;
    }

    //双向链表核心在于next和prev的交换。
    public DListNode reverseList(DListNode head) {
        DListNode curr = null;
        while (head != null) {
            curr = head;
            head = curr.next;
            curr.next = curr.prev;
            curr.prev = head;
        }
        return curr;
    }

}
