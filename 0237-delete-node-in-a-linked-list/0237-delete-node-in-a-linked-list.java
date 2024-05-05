/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void deleteNode(ListNode node) {

        ArrayList<Integer>list = new ArrayList<>();
        ListNode temp = node;
        while(temp != null){
            list.add(temp.val);
            temp = temp.next;
        }
        temp = node;
        while(temp.next.next != null){
            temp = temp.next;
        }
        temp.next = null;

        temp = node;
        int i=1;
        while(temp!=null){
            temp.val = list.get(i);
            i++;
            temp = temp.next;
        }
        
    }
}