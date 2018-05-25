package com.company.LinkedList;
/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class PalindromeList {
    public int lPalin(ListNode A) {

        if(A.next == null)
        {
            return 1;
        }

        ListNode first = A;
        ListNode second = A;
        ListNode prev = null;
        while(second != null && second.next != null)
        {
            second = second.next.next;
            prev = first;
            first = first.next;
        }
        if(second != null)
        {
            prev.next = null;
            second = first.next;
        }
        else
        {
            second = first;
            prev.next = null;
        }

        first = A;
        // while(prev != null)
        // {
        //     System.out.print(prev.val + " ");
        //     prev = prev.next;

        // }
        prev = null;
        while(second != null)
        {
            ListNode next = second.next;
            second.next = prev;
            prev = second;
            second = next;
        }

        while(first != null && prev != null)
        {
            if(first.val != prev.val)
            {
                return 0;
            }

            first = first.next;
            prev = prev.next;

        }

        return 1;

    }
}
