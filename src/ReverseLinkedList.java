public class ReverseLinkedList {

//     * Definition for singly-linked list.
     public class ListNode {
          int val;
          ListNode next;
          ListNode() {}
          ListNode(int val) { this.val = val; }
          ListNode(int val, ListNode next) { this.val = val; this.next = next; }
      }

        public ListNode reverseList(ListNode head) {
            if(head == null || head.next == null) return head;

            ListNode before = null;
            ListNode current = head;
            ListNode after = current;

            while (current != null){
                after = current.next;
                current.next = before;
                before = current;
                current = after;
            }

            return after;

        }


//            public ListNode reverseList(ListNode head) {
//        // Base case: if the list is empty or has only one element.
//        if (head == null || head.next == null) {
//            return head;
//        }
//
//        // Recursively reverse the rest of the list.
//        ListNode rest = reverseList(head.next);
//
//        // Put the first element at the end.
//        head.next.next = head;
//        head.next = null;
//
//        // 'rest' now points to the head of the reversed list.
//        return rest;
//    }

}

//Given the head of a singly linked list, reverse the list, and return the reversed list.