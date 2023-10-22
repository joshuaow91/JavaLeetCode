public class PartitionLL {
    public ListNode partition(ListNode head, int x) {
        if (head == null) return null;

        ListNode tempStart1 = new ListNode(0);
        ListNode tempStart2 = new ListNode(0);
        ListNode tempLast1 = tempStart1;
        ListNode tempLast2 = tempStart2;
        ListNode current = head;

        while (current != null) {
            if (current.val < x) {
                tempLast1.next = current;
                tempLast1 = current;
            } else {
                tempLast2.next = current;
                tempLast2 = current;
            }
            current = current.next;
        }
        tempLast2.next = null;
        tempLast1.next = tempStart2.next;
        head = tempStart1.next;

        return head;
    }


    public class ListNode {
          int val;
          ListNode next;
          ListNode() {}
          ListNode(int val) { this.val = val; }
          ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
}


//Given the head of a linked list and a value x, partition it such that all nodes less than x come before nodes greater than or equal to x.
//
//You should preserve the original relative order of the nodes in each of the two partitions.

