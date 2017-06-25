package ca.uwaterloo;

public class Main {

    public static void main(String[] args) {

        ListNode l1 = createList(new int[]{5});
        ListNode l2 = createList(new int[]{5});

        l1.printList();
        l2.printList();

        Solution solution = new Solution();
        ListNode l3 = solution.addTwoNumbers(l1, l2);
        l3.printList();
    }

    private static ListNode createList(int[] ints) {

        ListNode headNode = null;
        ListNode prevNode = null;
        ListNode currentNode;

        for (int intValue: ints) {

            currentNode = new ListNode(intValue);
            if (null == headNode) {
                headNode = currentNode;
            } else {
                prevNode.next = currentNode;
            }

            prevNode = currentNode;
        }

        return headNode;
    }
}
