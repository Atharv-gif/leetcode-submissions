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

        ListNode prev = null;
        ListNode curr = head;


        // reversed 

        while(curr != null){
            ListNode nextNode = curr.next;

            curr.next = prev;
            prev = curr;
            curr = nextNode;
        }


        // now to remove the nth element from begining 

        head = prev;
        if(n==1){
            head = head.next;
        }else{
            ListNode temp = head;

            for(int i = 0 ; i < n-2 ; i++){
            temp = temp.next;
        }

        temp.next = temp.next.next;

        }

        

        // again reversing back

        prev = null;
        curr = head;

        while(curr != null){
            ListNode newNode = curr.next;
            curr.next = prev;
            prev = curr;
            curr = newNode;
        }

        return prev;


    }
}
