public class RemoveDuplicatesFromSortedLL {
    public ListNode deleteDuplicates(ListNode head) {

        ListNode prev = null;
        ListNode current = head;

        while (current != null && current.next != null) { // Ensuring current.next is not null
            if(current.val == current.next.val) { // Checking current with next
                current.next = current.next.next; // Skipping the duplicate
            } else {
                prev = current; // If not a duplicate, move the prev pointer
                current = current.next; // Move to the next node
            }
        }

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


//Given the head of a sorted linked list, delete all duplicates such that each element appears only once. Return the linked list sorted as well.
//
//
//
//Example 1:
//Input: head = [1,1,2]
//Output: [1,2]
