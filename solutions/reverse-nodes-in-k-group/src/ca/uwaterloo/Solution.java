package ca.uwaterloo;

import java.util.Stack;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {

    static ListNode reverseLinkedList(ListNode head) {

        ListNode tmpNode = null;
        ListNode newHead = null;

        while (head != null) {
            tmpNode = head;
            head = head.next;
            tmpNode.next = newHead;
            newHead = tmpNode;
        }

        return newHead;
    }

    public ListNode reverseKGroup(ListNode head, int k) {

        Stack<ListNode> groupStack = new Stack<>();

        ListNode currentNode = head;

        while (currentNode != null) {
            int i = 0;
            ListNode prevNode = null;
            while (currentNode != null && i < k) {
                prevNode = currentNode;
                currentNode = currentNode.next;
                ++i;
            }

            ListNode nextHead = currentNode;

            if (null != prevNode) {
                prevNode.next = null;
            }

            if (i == k) {
                groupStack.push(reverseLinkedList(head));
            } else {
                groupStack.push(head);
            }

            if (nextHead != null) {
                head = nextHead;
            }
        }

        ListNode newHead = null;
        while (!groupStack.empty()) {
            ListNode tmpHead = groupStack.pop();
            currentNode = tmpHead;
            while (currentNode.next != null) {
                currentNode = currentNode.next;
            }
            currentNode.next = newHead;
            newHead = tmpHead;
        }

        return newHead;
    }
}
