package ca.uwaterloo;

import java.util.List;

public class ListNode {

    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }

    String printTillEnd() {

        ListNode currentNode = this;
        StringBuilder stringBuilder = new StringBuilder();

        while (null != currentNode) {
            stringBuilder.append(currentNode.val + " -> ");
            currentNode = currentNode.next;
        }

        return stringBuilder.toString();
    }

    static ListNode createLinkedList(List<Integer> integers) {

        ListNode head = null;
        ListNode currentNode;
        ListNode prevNode = null;

        for (Integer num: integers) {
            currentNode = new ListNode(num);
            if (null == prevNode) {
                head = currentNode;
            } else {
                prevNode.next = currentNode;
            }
            prevNode = currentNode;
        }

        return head;
    }

}
