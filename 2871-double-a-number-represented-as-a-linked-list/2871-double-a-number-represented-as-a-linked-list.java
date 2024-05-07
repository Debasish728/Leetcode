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

    public ListNode doubleIt(ListNode head) {

        ListNode reverseHead = reverseList(head);
        ListNode temp = reverseHead;
        ListNode dummy = new ListNode(-1);
        dummy.next = reverseHead;
        int carry = 0;
        while(temp != null){
            int num = 2*temp.val+carry;
            if(num >=10){
                temp.val = num%10;
                carry = 1;
            }else{
                temp.val = num;
                carry = 0;
            }
            temp = temp.next;
            dummy = dummy.next;
        }
        
        if(carry == 1){
           dummy.next = new ListNode(1);
        }
        ListNode newHead = reverseList(reverseHead);
        return newHead;



        
    }
}