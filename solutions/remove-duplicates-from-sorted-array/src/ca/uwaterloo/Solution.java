package ca.uwaterloo;

class Solution {
    public int removeDuplicates(int[] nums) {

        int arrLen = nums.length;
        if (arrLen < 2) {
            return arrLen;
        }

        int count = 1;
        for (int i = 1; i < arrLen; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[count++] = nums[i];
            }
        }

        return count;
    }
}
