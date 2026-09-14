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
    public boolean isPalindrome(ListNode head) {

        ArrayList<Integer> list = new ArrayList<>();

        ListNode temp = head;

        while(temp != null){
            list.add(temp.val);
            temp = temp.next;
        }

        ListNode prev = null;
        ListNode curr = head;

        while(curr != null){
            ListNode nextNode = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextNode;
        }

        temp = prev;

        int i = 0;

        while(temp != null){
            if(temp.val != list.get(i)){
                return false;
            }

            temp = temp.next;
            i++;
        }

        return true;

        
    }
}