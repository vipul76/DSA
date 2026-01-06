package leetcode.linkedlist.utilities;

public class CreateCycleLL {
    public static void createCyclicList(ListNode head, int pos) {
        if(head == null || pos<0) return;

        ListNode tail = head;
        ListNode cycleNode = null;
        int index=0;

        while (tail.next!=null){
            if(index == pos){
                cycleNode = tail;
            }
            tail = tail.next;
            index++;
        }

        if(index == pos){
            cycleNode = tail;
        }
        if (cycleNode != null) {
            tail.next = cycleNode;
        }
    }
}
