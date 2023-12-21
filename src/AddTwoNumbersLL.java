public class AddTwoNumbersLL {

      public class ListNode {
     int val;
     ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        // Initialize the dummy head of the result list.
        ListNode dummyHead = new ListNode(0);
        ListNode p = l1, q = l2, curr = dummyHead;
        int carry = 0;

        // Loop through lists
        while (p != null || q != null) {
            // Get the current values
            int x = (p != null) ? p.val : 0;
            int y = (q != null) ? q.val : 0;
            int sum = carry + x + y;

            // Update carry
            carry = sum / 10;

            // Create a new node with the digit value and append it to the list
            curr.next = new ListNode(sum % 10);
            curr = curr.next;

            // Move to the next elements in the lists
            if (p != null) p = p.next;
            if (q != null) q = q.next;
        }

        // Check if carry exists after finishing both lists
        if (carry > 0) {
            curr.next = new ListNode(carry);
        }

        // The result list is next to the dummy node
        return dummyHead.next;
    }
}



//You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order, and each of their nodes contains a single digit. Add the two numbers and return the sum as a linked list.
//
//You may assume the two numbers do not contain any leading zero, except the number 0 itself.
