package com.company.LinkedList;
/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class MergeTwoSortedLists {
    public ListNode mergeTwoLists(ListNode A, ListNode B) {

        if(A == null)
            return B;
        if(B == null)
            return A;

        ListNode C = null;
        ListNode CHead = null;

        if(A.val < B.val)
        {
            C = A;
            CHead = C;
            A = A.next;
        }
        else
        {
            C = B;
            CHead = B;
            B = B.next;
        }

        while(A != null && B != null)
        {
            if(A.val < B.val)
            {
                C.next = A;
                A = A.next;
            }
            else
            {
                C.next = B;
                B = B.next;
            }
            C = C.next;
        }

        if(A == null)
        {
            C.next = B;
        }
        else
        {
            C.next = A;
        }

        return CHead;

    }
}
