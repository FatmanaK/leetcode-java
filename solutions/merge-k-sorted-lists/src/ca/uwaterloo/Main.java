package ca.uwaterloo;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Solution solution = new Solution();

        System.out.println(
            solution.mergeKLists(
                new ListNode[] {
                    createLinkedList(Arrays.asList(1, 2, 4)),
                    createLinkedList(Arrays.asList(3, 5, 6)),
                    createLinkedList(Arrays.asList(0, 2, 4))
                }
            ).printTillEnd());
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
