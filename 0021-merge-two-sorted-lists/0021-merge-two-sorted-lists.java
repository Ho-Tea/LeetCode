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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummyNode = new ListNode(0);
        ListNode tail = dummyNode;


        while (list1 != null || list2 != null) {
            if (list1 != null && list2 != null) {
                if (list1.val >= list2.val) {
                    tail.next = new ListNode(list2.val);
                    tail = tail.next;
                    list2 = list2.next;
                    continue;
                }
                tail.next = new ListNode(list1.val);
                tail = tail.next;
                list1 = list1.next;
            } else if (list1 == null) {
                tail.next = new ListNode(list2.val);
                tail = tail.next;
                list2 = list2.next;
            } else if (list2 == null) {
                tail.next = new ListNode(list1.val);
                tail = tail.next;
                list1 = list1.next;
            }
        }
        return dummyNode.next;
    }
}