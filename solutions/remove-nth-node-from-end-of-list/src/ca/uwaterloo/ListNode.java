package ca.uwaterloo;

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
}
