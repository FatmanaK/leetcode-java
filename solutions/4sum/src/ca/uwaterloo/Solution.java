package ca.uwaterloo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

class Solution {

    public String getSetString(List<Integer> numbers) {
        StringBuilder sb = new StringBuilder();
        for (Integer number: numbers) {
            sb.append(number);
            sb.append("-");
        }

        return sb.toString();
    }

    public List<List<Integer>> fourSum(int[] nums, int target) {

        HashMap<String, List<Integer>> uniqueSets = new HashMap<>();

        Arrays.sort(nums);
        List<List<Integer>> candidates = new ArrayList<>();

        for (int firstIndex = 0; firstIndex < nums.length - 3;
             firstIndex++) {

            for (int secondIndex = firstIndex + 1;
                 secondIndex < nums.length - 2; secondIndex++) {

                int thirdIndex = secondIndex + 1;
                int fourIndex = nums.length - 1;

                while (thirdIndex < fourIndex) {

                    int sum = nums[firstIndex] + nums[secondIndex] +
                        nums[thirdIndex] + nums[fourIndex];

                    if (sum == target) {
                        List<Integer> candidate =
                            Arrays.asList(nums[firstIndex], nums[secondIndex],
                                nums[thirdIndex], nums[fourIndex]);
                        uniqueSets.put(getSetString(candidate), candidate);

                        while (thirdIndex < fourIndex &&
                            nums[thirdIndex] == nums[thirdIndex + 1]) {
                            ++thirdIndex;
                        }
                        while (thirdIndex < fourIndex &&
                            nums[fourIndex] == nums[fourIndex - 1]) {
                            --fourIndex;
                        }

                        ++thirdIndex;
                        --fourIndex;
                    } else if (sum < target) {
                        ++thirdIndex;
                    } else {
                        --fourIndex;
                    }
                }

            }
        }

        candidates.addAll(uniqueSets.values());
        return candidates;
    }
}
