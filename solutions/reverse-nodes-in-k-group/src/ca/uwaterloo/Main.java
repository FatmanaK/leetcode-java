package ca.uwaterloo;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Solution solution = new Solution();

        System.out.println(
            solution.reverseKGroup(ListNode.createLinkedList(
                Arrays.asList(1, 2, 3, 4, 5, 6, 7)
            ), 4).printTillEnd()
        );

        System.out.println(
            solution.reverseKGroup(ListNode.createLinkedList(
                Arrays.asList(1, 2, 3, 4, 5)
            ), 3).printTillEnd()
        );

        System.out.println(
                solution.reverseKGroup(ListNode.createLinkedList(
                        Arrays.asList(1, 2, 3, 4, 5)
                ), 2).printTillEnd()
        );

        System.out.println(
                solution.reverseKGroup(ListNode.createLinkedList(
                        Arrays.asList(1, 2, 3, 4)
                ), 1).printTillEnd()
        );
    }
}
