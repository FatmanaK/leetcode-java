package ca.uwaterloo;

import java.util.List;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode mergedListCurrent = new ListNode(Integer.MIN_VALUE);
        ListNode mergedListHead = mergedListCurrent;

        while (null != l1 && null != l2) {
            if (l1.val <= l2.val) {
                mergedListCurrent.next = new ListNode(l1.val);
                mergedListCurrent = mergedListCurrent.next;
                l1 = l1.next;
            } else {
                mergedListCurrent.next = new ListNode(l2.val);
                mergedListCurrent = mergedListCurrent.next;
                l2 = l2.next;
            }
        }

        if (null == l1) {
            while (null != l2) {
                mergedListCurrent.next = new ListNode(l2.val);
                mergedListCurrent = mergedListCurrent.next;
                l2 = l2.next;
            }
        } else {
            while (null != l1) {
                mergedListCurrent.next = new ListNode(l1.val);
                mergedListCurrent = mergedListCurrent.next;
                l1 = l1.next;
            }
        }

        return mergedListHead.next;
    }
}
