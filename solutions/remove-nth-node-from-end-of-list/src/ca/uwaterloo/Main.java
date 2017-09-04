package ca.uwaterloo;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Solution solution = new Solution();

        ListNode sol1 = solution.removeNthFromEnd(
            createLinkedList(Arrays.asList(1)), 1);
        if (null != sol1) {
            System.out.println(sol1.printTillEnd());
        }

        System.out.println(solution.removeNthFromEnd(
            createLinkedList(Arrays.asList(1, 2)), 1).printTillEnd());

        System.out.println(solution.removeNthFromEnd(
            createLinkedList(Arrays.asList(1, 2)), 2).printTillEnd());

        System.out.println(solution.removeNthFromEnd(
            createLinkedList(Arrays.asList(1, 2, 3, 4, 5)), 2).printTillEnd());
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
