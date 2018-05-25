package com.company.LinkedList;
/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */

class ListNode
{
    int val;
    ListNode next;
    ListNode(int x) { val = x; next = null; }
}

public class SwapPairs {
    public ListNode swapPairs(ListNode A) {

        if(A.next == null)
            return A;

        ListNode node = A;
        ListNode head = null;
        ListNode runner = null;

        if(node != null && node.next != null)
        {
            ListNode temp = node.next.next;
            head = reverse(node, 2);
            runner = head.next;
            node = temp;
        }

        while(node != null && node.next != null)
        {
            ListNode temp = node.next.next;
            runner.next = reverse(node, 2);
            runner = runner.next.next;
            node = temp;
        }

        if(node != null)
        {
            runner.next = node;
        }

        return head;
    }

    private void printNodes(ListNode A)
    {
        System.out.println();

        ListNode node = A;
        while(node != null)
        {
            System.out.print(node.val + " -> ");
            node = node.next;
        }
    }

    private ListNode reverse(ListNode N, int k)
    {
        ListNode prev = null;
        ListNode curr = N;
        ListNode tail = curr;
        while(k > 0 && curr != null)
        {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
            k--;
        }
        tail.next = null;
        return prev;
    }
}
