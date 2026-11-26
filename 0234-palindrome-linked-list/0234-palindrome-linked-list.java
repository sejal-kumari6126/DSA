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
    public ListNode reverse(ListNode head)
    {
        ListNode curr=head;
        ListNode prev= null;
        while(curr!=null){
            ListNode forward= curr.next;
            curr.next=prev;
            prev=curr;
            curr=forward;
        }
        return prev;
    }
    public boolean isPalindrome(ListNode head) {
        ListNode slow=head;
        ListNode fast = head;
        while(fast!=null && fast.next!= null){
            slow=slow.next;
            fast = fast.next.next;
        }
        if(fast!=null)
        slow=slow.next;
        ListNode newNode= reverse(slow);
        ListNode first= head;
        ListNode second = newNode;
        while(second!=null){
        if(first.val!=second.val){
            reverse(newNode);
            return false;
        }
        first=first.next;
        second = second.next;
        }
        
        reverse(newNode);
        return true;
    }
}