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
    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int n = lists.length;
        for(int i=0;i<n;i++){
            while(lists[i] != null){
                pq.add(lists[i].val);
                lists[i] = lists[i].next;
            }
        }
        
        if(pq.isEmpty()){
             return null;
        }
        ListNode list = new ListNode(pq.poll());
        ListNode temp = list;
        while(!pq.isEmpty()){
            ListNode node = new ListNode(pq.poll());
            temp.next = node;
            temp = temp.next;
        }
        return list;

        
    }
}