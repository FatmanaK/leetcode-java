package ca.uwaterloo;

import java.util.Arrays;

class Solution {
    public int threeSumClosest(int[] nums, int target) {

        int closestDistance = Integer.MAX_VALUE;
        int closestSum = 0;
        Arrays.sort(nums);

        for (int firstIndex = 0; firstIndex < nums.length - 2; firstIndex++) {
            int secondIndex = firstIndex + 1;
            int thirdIndex = nums.length - 1;

            while (secondIndex < thirdIndex) {
                int sum = nums[firstIndex] + nums[secondIndex] + nums[thirdIndex];
                int distance = target - sum;
                int absoluteDistance = Math.abs(distance);
                if (absoluteDistance < closestDistance) {
                    closestDistance = absoluteDistance;
                    closestSum = sum;
                }

                if (distance < 0) {
                    --thirdIndex;
                } else {
                    ++secondIndex;
                }
            }
        }

        return closestSum;
    }
}
