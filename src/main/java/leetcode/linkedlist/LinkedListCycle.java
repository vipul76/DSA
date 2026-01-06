package leetcode.linkedlist;


import leetcode.linkedlist.utilities.CreateCycleLL;
import leetcode.linkedlist.utilities.LinkedList;
import leetcode.linkedlist.utilities.ListNode;
import leetcode.linkedlist.utilities.PrintLinkedList;

public class LinkedListCycle {
    static void main() {
        //int[] arr = {3,2,0,2};
        //int pos = 1;
        int[] arr = {1,1,1,1};
        int pos = -1;

        ListNode head = LinkedList.createLinkedList(arr);

        CreateCycleLL.createCyclicList(head,pos);

        PrintLinkedList.print(head);

        boolean hasCycle = hasCycle(head);

        System.out.println("Detected Linked list cycle : "+hasCycle);
    }



    private static boolean hasCycle(ListNode head) {
        if(head == null || head.next == null) return false;

        ListNode fast = head.next;
        ListNode slow = head;

        while(fast.next!=null && fast.next.next!=null){
            if(fast == slow){
                return true;
            }
            fast = fast.next.next;
            slow = slow.next;
        }
        return false;
    }
}
