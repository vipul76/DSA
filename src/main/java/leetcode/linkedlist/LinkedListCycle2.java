package leetcode.linkedlist;

import leetcode.linkedlist.utilities.CreateCycleLL;
import leetcode.linkedlist.utilities.LinkedList;
import leetcode.linkedlist.utilities.ListNode;
import leetcode.linkedlist.utilities.PrintLinkedList;

import java.util.HashSet;
import java.util.Set;

public class LinkedListCycle2 {
    static void main() {
        int[] arr = {3,2,0,-4};
        int pos = 1;
        ListNode head = LinkedList.createLinkedList(arr);

        CreateCycleLL.createCyclicList(head,pos);

        ListNode detectCycleNode = detectCycle(head);
        PrintLinkedList.print(head);

        if(detectCycleNode!=null)
            System.out.println("Value -> "+detectCycleNode.val+" , next -> "+detectCycleNode.next);
    }

    private static ListNode detectCycle(ListNode head) {
        Set<ListNode> visited = new HashSet<>();
        ListNode tail = head;

        while(tail!=null){
            if (visited.contains(tail)) {
                return tail;
            }
            visited.add(tail);
            tail=tail.next;
        }
        return null;
    }
}
