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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        //we'll add a dummy node before head, delete head (Edge Case)
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode slow = dummy;
        ListNode fast = dummy;

        //we'll move fast n steps ahead
        for(int i=0;i<n;i++){
            fast = fast.next;
        }
        //now move both
        while(fast.next != null){
            slow = slow.next;
            fast = fast.next;
        }
        //now slow will be one node ahead of nth node so move the link to n+1 node
        slow.next = slow.next.next;

        return dummy.next;
    }
}