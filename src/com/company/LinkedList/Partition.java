package com.company.LinkedList;
/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Partition {
    public ListNode partition(ListNode A, int B) {

        if(A.next == null)
        {
            return A;
        }

        ListNode first = null;
        ListNode second = null;
        ListNode firstHead = null;
        ListNode secondHead = null;
        ListNode runner = A;

        while(runner != null)
        {
            if(runner.val < B)
            {
                if(first == null)
                {
                    first = runner;
                    firstHead = first;
                }
                else
                {
                    first.next = runner;
                    first = first.next;
                }
            }
            else
            {
                if(second == null)
                {
                    second = runner;
                    secondHead = second;
                }
                else
                {
                    second.next = runner;
                    second = second.next;
                }
            }
            runner = runner.next;
        }
        if(firstHead == null) return secondHead;

        second.next = null;
        first.next = secondHead;
        return firstHead;
    }
}
