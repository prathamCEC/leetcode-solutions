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
        //temporarily copying the val of next node value into node value
        node.val = node.next.val;
        //removing the the duplicte val
        node.next = node.next.next;
    }
}