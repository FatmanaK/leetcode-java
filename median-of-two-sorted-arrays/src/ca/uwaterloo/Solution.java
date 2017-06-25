package ca.uwaterloo;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int totalLength = nums1.length + nums2.length;
        List<Integer> allElements = getHalfElements(nums1, nums2, totalLength);

        if (totalLength % 2 == 0) {
            return
                (allElements.get(allElements.size() - 1) +
                    allElements.get(allElements.size() - 2)) / 2.0;
        } else {
            return allElements.get(allElements.size() - 1) * 1.0;
        }
    }

    private List<Integer> getHalfElements(int[] nums1, int[] nums2, int totalLength) {

        List<Integer> allElements = new ArrayList<>();
        int j = 0, k = 0;
        for (int i = 0; i < totalLength/2 + 1; i++) {
            if (j >= nums1.length) {
                allElements.add(nums2[k]);
                ++k;
            } else if (k >= nums2.length) {
                allElements.add(nums1[j]);
                ++j;
            } else {
                if (nums1[j] > nums2[k]) {
                    allElements.add(nums2[k]);
                    ++k;
                } else {
                    allElements.add(nums1[j]);
                    ++j;
                }
            }
        }

        return allElements;
    }
}
