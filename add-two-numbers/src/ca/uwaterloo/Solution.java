package ca.uwaterloo;


public class Solution {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode outputHead = null;
        ListNode outputPrev = null;
        ListNode outputCurrent;
        int carryOver = 0;

        while (null != l1 || null != l2) {

            int result = carryOver;

            if (l1 != null) {
                result += l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                result += l2.val;
                l2 = l2.next;
            }

            outputCurrent = new ListNode(result % 10);
            if (null == outputHead) {
                outputHead = outputCurrent;
            } else {
                outputPrev.next = outputCurrent;
            }

            outputPrev = outputCurrent;

            if (result >= 10) {
                carryOver = 1;
            } else {
                carryOver = 0;
            }
        }

        if (carryOver == 1) {
            outputCurrent = new ListNode(1);
            outputPrev.next = outputCurrent;
        }

        return outputHead;
    }
}

