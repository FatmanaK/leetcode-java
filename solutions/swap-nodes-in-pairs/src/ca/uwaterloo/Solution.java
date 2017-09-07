package ca.uwaterloo;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode swapPairs(ListNode head) {
        if (null == head || null == head.next) {
            return head;
        }

        ListNode newHead = head.next;
        ListNode currentNode = head;
        ListNode prevNode = null;

        while (null != currentNode && null != currentNode.next) {
            ListNode first = currentNode;
            ListNode second = currentNode.next;

            first.next = second.next;
            second.next = first;
            if (null != prevNode) {
                prevNode.next = second;
            }

            prevNode = currentNode;
            currentNode = currentNode.next;
        }

        return newHead;
    }
}
