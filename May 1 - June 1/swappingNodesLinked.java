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
    public ListNode swapNodes(ListNode head, int k) {
        ListNode slow = head;
        ListNode fast = head;
        
        ListNode first = null;
        ListNode second = null;
        
        for(int i =0;i<k-1;i++){
            fast = fast.next;
        }
        
        first = fast;
        
        while(fast.next != null){
            fast = fast.next;
            slow = slow.next;
        }
        
        second = slow;
        
        int temp = first.val;
        first.val = second.val;
        second.val = temp;
        
        return head;
        
        
    }
}