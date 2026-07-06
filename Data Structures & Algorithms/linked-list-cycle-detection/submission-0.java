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
    public boolean hasCycle(ListNode head) {
        Set<Integer> seen  = new HashSet<>();
        ListNode node = head;

        while(node != null){
            if(seen.contains(node.val)){
                return true;
            }
            else{
                seen.add(node.val);
                node = node.next;
            }
            
        }
        return false;

    }
}
