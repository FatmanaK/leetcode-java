package ca.uwaterloo;

public class ListNode {

    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }

    public void printList() {

        ListNode node = this;
        String finalString = "";

        while (null != node) {
            finalString = finalString.concat(node.val + " -> ");
            node = node.next;
        }

        System.out.println(finalString);
    }
}
