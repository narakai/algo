package com.company;

/**
 * Created by laileon on 2017/7/19.
 */
//链表 插入删除o(1)
public class ListNode {
    public int val;
    public ListNode next;

    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = null;
    }

    //单向链表, 从前往后反转各个结点的指针域的指向
    //非递归实现很简单，只需要遍历一遍链表，在遍历过程中，把遍历的节点一次插入到头部
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        while (head != null) { //如果当前节点不为空
            ListNode tmp = head.next; //tmp赋值为head后面的节点
            head.next = prev; //head指向head后面那个
            prev = head; //prev后移一位
            head = tmp; //head后移一位
        }
        return prev;
    }

}
