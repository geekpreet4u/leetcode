/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }

 Using recursion
 */
class Solution {
    public ListNode reverseList(ListNode head) {

        return rev(head,null );
    }

    public ListNode rev(ListNode head, ListNode pre){
        if(head == null) return pre;
        ListNode temp = head.next;
       head.next = pre;
        return rev(temp,head );
    }

}