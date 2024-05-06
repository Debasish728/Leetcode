/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeNodes(ListNode head) {
        if (head == null || head.next == null) {
            return head; 
        }

        
        ListNode reversedHead = reverseList(head);

        ListNode dummy = new ListNode(-1); 
        dummy.next = reversedHead;
        ListNode prev = dummy;
        ListNode curr = reversedHead;
        int maxSoFar = Integer.MIN_VALUE; 

        while (curr != null) {
            if (curr.val < maxSoFar) {
                prev.next = curr.next; 
            } else {
                maxSoFar = curr.val; 
                prev = curr; 
            }

            curr = curr.next; 
        }

       
        ListNode modifiedHead = reverseList(dummy.next);

        return modifiedHead; 
    }

    private ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;

        while (curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        return prev;
    }
}