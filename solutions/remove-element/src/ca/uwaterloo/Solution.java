package ca.uwaterloo;

import java.util.Arrays;

class Solution {
    public int removeElement(int[] nums, int val) {

        int newLen = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[newLen++] = nums[i];
            }
        }

        return newLen;
    }
}
