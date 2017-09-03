package ca.uwaterloo;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] ans = solution.twoSum(new int[]{1, 2, 3}, 4);

        System.out.println(Arrays.toString(ans));
    }
}
