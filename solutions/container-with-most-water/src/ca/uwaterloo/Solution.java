package ca.uwaterloo;

public class Solution {
    public int maxArea(int[] height) {

        int maxArea = 0;

        int i = 0, j = height.length - 1;

        while (i < j) {
            int containerWidth = j - i;
            int containerHeight = Math.min(height[i], height[j]);
            int area = containerHeight * containerWidth;

            if (area > maxArea) {
                maxArea = area;
            }

            if (height[i] > height[j]) {
                --j;
            } else {
                ++i;
            }
        }

        return maxArea;
    }
}
