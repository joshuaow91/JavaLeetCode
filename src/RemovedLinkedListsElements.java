import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemovedLinkedListsElements {
    public static ListNode removeElements(ListNode head, int val) {

        ListNode prev = null;
        ListNode current;

        while (head != null && head.val == val) {
            head = head.next;
        }

        current = head;

        while (current != null) {
            if (current.val == val) {
                prev.next = current.next;
            } else {
                prev = current;
            }

            current = current.next;
        }

        return head;
    }


    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public static ListNode buildLinkedList(int[] nums) {
        if (nums.length == 0) return null;
        ListNode head = new ListNode(nums[0]);
        ListNode current = head;
        for (int i = 1; i < nums.length; i++) {
            current.next = new ListNode(nums[i]);
            current = current.next;
        }
        return head;
    }

    public static List<Integer> linkedListToList(ListNode head) {
        List<Integer> list = new ArrayList<>();
        while (head != null) {
            list.add(head.val);
            head = head.next;
        }
        return list;
    }


    public static void main(String[] args) {
        // Test Case 1
        ListNode head1 = buildLinkedList(new int[]{1, 2, 6, 3, 4, 5, 6});
        ListNode result1 = removeElements(head1, 6);
        assert Arrays.equals(linkedListToList(result1).toArray(), new Integer[]{1, 2, 3, 4, 5}) : "Test Case 1 Failed";

        // Test Case 2
        ListNode head2 = buildLinkedList(new int[]{});
        ListNode result2 = removeElements(head2, 1);
        assert Arrays.equals(linkedListToList(result2).toArray(), new Integer[]{}) : "Test Case 2 Failed";

        // Test Case 3
        ListNode head3 = buildLinkedList(new int[]{7, 7, 7, 7});
        ListNode result3 = removeElements(head3, 7);
        assert Arrays.equals(linkedListToList(result3).toArray(), new Integer[]{}) : "Test Case 3 Failed";

        System.out.println("All test cases passed!");
    }
}
