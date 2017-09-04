package ca.uwaterloo;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Solution solution = new Solution();

        System.out.println(solution.mergeTwoLists(
            createLinkedList(Arrays.asList(1, 2)),
            createLinkedList(Arrays.asList(1, 3))).printTillEnd());

        System.out.println(solution.mergeTwoLists(
            createLinkedList(Arrays.asList(1, 2)),
            createLinkedList(Arrays.asList(3, 5, 7))).printTillEnd());

        System.out.println(solution.mergeTwoLists(
            createLinkedList(Arrays.asList(1, 5, 6, 8, 9)),
            createLinkedList(Arrays.asList(2, 4, 8, 11, 13))).printTillEnd());
    }

    private static ListNode createLinkedList(List<Integer> integers) {

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
