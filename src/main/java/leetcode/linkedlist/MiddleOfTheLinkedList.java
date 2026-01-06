package leetcode.linkedlist;

import leetcode.linkedlist.utilities.CreateCycleLL;
import leetcode.linkedlist.utilities.LinkedList;
import leetcode.linkedlist.utilities.ListNode;
import leetcode.linkedlist.utilities.PrintLinkedList;

public class MiddleOfTheLinkedList {
    static void main() {
        int[] arr = {1,2,3,4,5,6};
        ListNode head = LinkedList.createLinkedList(arr);
        PrintLinkedList.print(head);

        ListNode middle = middleNode(head);
    }

    private static ListNode middleNode(ListNode head) {
        if (head == null) return null;
        ListNode fast = head.next;
        ListNode slow = head;

        while (fast.next!= null && fast.next.next!=null){

        }
        return null;
    }
}
