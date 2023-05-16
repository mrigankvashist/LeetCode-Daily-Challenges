class Solution {
    public ListNode swapPairs(ListNode head) {
        ListNode dummy = new ListNode(-1);
        ListNode prev = dummy;
        ListNode curr = head;
        dummy.next = head;
        
        while(curr != null && curr.next != null){
            prev.next = curr.next;
            curr.next = curr.next.next;
            prev.next.next = curr;
            curr = curr.next;
            prev = prev.next.next;
            
        }
        return dummy.next;
    }
}