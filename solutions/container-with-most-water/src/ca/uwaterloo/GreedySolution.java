package ca.uwaterloo;

public class GreedySolution {
    public int maxArea(int[] height) {

        int maxArea = 0;

        for (int i = 0; i < height.length; i++) {
            for (int j = 0; j < height.length; j++) {
                int containerWidth = Math.abs(j - i);
                int containerHeight = Math.min(height[i], height[j]);
                int area = containerHeight * containerWidth;

                if (area > maxArea) {
                    maxArea = area;
                }
            }
        }

        return maxArea;
    }
}