package ca.uwaterloo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {

    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> candidates = new ArrayList<>();
        Arrays.sort(nums);

        for (int firstIndex = 0; firstIndex < nums.length - 2; firstIndex++) {
            int secondIndex = firstIndex + 1;
            int thirdIndex = nums.length - 1;

            if (firstIndex > 0 && (nums[firstIndex] == nums[firstIndex - 1])) {
                continue;
            }

            while (secondIndex < thirdIndex) {
                int sum = nums[firstIndex] + nums[secondIndex] + nums[thirdIndex];
                if (sum == 0) {
                    candidates.add(
                        Arrays.asList(nums[firstIndex], nums[secondIndex],
                            nums[thirdIndex]));

                    while (secondIndex < thirdIndex &&
                        nums[secondIndex] == nums[secondIndex + 1]) {
                        ++secondIndex;
                    }
                    while (secondIndex < thirdIndex &&
                        nums[thirdIndex] == nums[thirdIndex - 1]) {
                        --thirdIndex;
                    }

                    ++secondIndex;
                    --thirdIndex;
                } else if (sum > 0) {
                    --thirdIndex;
                } else {
                    ++secondIndex;
                }
            }
        }

        return candidates;
    }
}
