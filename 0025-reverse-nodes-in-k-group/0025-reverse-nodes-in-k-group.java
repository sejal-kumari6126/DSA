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
    public ListNode reverse(ListNode head){
        ListNode curr=head;
        ListNode prev=null;
        while(curr!=null){
            ListNode forward = curr.next;
            curr.next=prev;
            prev=curr;
            curr=forward;
        }
        return prev;
    }
    public ListNode findkthnode(ListNode temp, int k){
        k=k-1;
        while(temp!=null && k>0){
            temp=temp.next;
            k--;
        }
        return temp;
    }
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode temp=head; ListNode prevNode=null;ListNode nextnode;
        while(temp!=null)
        {
        ListNode kthnode=findkthnode(temp,k);
        if(kthnode==null){
            if(prevNode!=null)
            prevNode.next=temp;
            
            break;
        }
        nextnode=kthnode.next;
        kthnode.next=null;
        reverse(temp);
        if(temp==head){
            head=kthnode;
        }
        else{
            prevNode.next=kthnode;
        }
            prevNode=temp;
            temp=nextnode;
        }
    return head;
    
    }
}