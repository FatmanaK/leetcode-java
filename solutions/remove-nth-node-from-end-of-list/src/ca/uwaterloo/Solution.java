package ca.uwaterloo;

import java.util.ArrayList;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */

class Solution {

    public ListNode removeNthFromEnd(ListNode head, int n) {

        ArrayList<ListNode> dataNodes = new ArrayList<>();
        ListNode currentNode = head;

        while (null != currentNode) {
            dataNodes.add(currentNode);
            currentNode = currentNode.next;
        }

        int originalSize = dataNodes.size();
        if (originalSize >= n) {
            int prevIndex = originalSize - n - 1;
            int nextIndex = originalSize - n + 1;

            if (prevIndex < 0) {
                if (nextIndex >= originalSize) {
                    head = null;
                } else {
                    head = dataNodes.get(nextIndex);
                }
            } else {
                if (nextIndex >= originalSize) {
                    dataNodes.get(prevIndex).next = null;
                } else {
                    dataNodes.get(prevIndex).next = dataNodes.get(nextIndex);
                }
            }
        }

        return head;
    }
}
