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
    public int getDecimalValue(ListNode head) {

        ListNode prev = null;
        ListNode curr = head;

        ArrayList<Integer> list = new ArrayList<>();

        ListNode temp = head;


        


        // reversed  the list 

        while(curr != null){
            ListNode nextNode = curr.next;
            curr.next = prev;
            prev = curr ;
            curr = nextNode;
        }

        head = prev;
        temp = head;


        // add value to list 

        while(temp!=null){
            list.add(temp.val);
            temp = temp.next;
        }

        // result 

        int result = 0;

        for(int i = 0 ; i < list.size() ; i++){
             result += list.get(i) * (int)Math.pow(2 , i);
        }


        return result;


        
    }
}