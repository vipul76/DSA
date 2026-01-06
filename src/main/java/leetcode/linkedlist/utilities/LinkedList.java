package leetcode.linkedlist.utilities;

import java.util.List;

public class LinkedList {
    public static ListNode createLinkedList(int[] arr){
        ListNode head = null;
        ListNode tail = null;

        for (int val : arr) {
            ListNode newNode = new ListNode(val, null);
            if (head == null) {
                head = newNode;
                tail = head;
            } else {
                tail.next = newNode;
                tail = tail.next;
            }
        }
        return head;
    }
}
