package ca.uwaterloo;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode mergeKLists(ListNode[] lists) {

        ArrayList<Integer> allElements = new ArrayList<>();
        for (int i = 0; i < lists.length; i++) {
            ListNode currentNode = lists[i];
            while (currentNode != null) {
                allElements.add(currentNode.val);
                currentNode = currentNode.next;
            }
        }
        Collections.sort(allElements);

        ListNode headSorted = new ListNode(Integer.MIN_VALUE);
        ListNode currentNode = headSorted;
        for (Integer num: allElements) {
            currentNode.next = new ListNode(num);
            currentNode = currentNode.next;
        }

        return headSorted.next;
    }
}
