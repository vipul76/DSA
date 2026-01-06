package leetcode.linkedlist.utilities;

import java.util.HashSet;
import java.util.Set;

public class PrintLinkedList {
    public static void print(ListNode head) {
        Set<ListNode> visited = new HashSet<>();
        while (head!=null){
            if(visited.contains(head)){
                System.out.println("Cycle detected for node val : " + head.val);
                return;
            }
            visited.add(head);
            System.out.print(head.val+"->");
            head = head.next;
        }
        System.out.println();
    }
}
