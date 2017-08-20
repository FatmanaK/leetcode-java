package ca.uwaterloo;

import java.util.*;

class Solution {

    public class IndexTuple {
        int x;
        int y;

        public IndexTuple(int x, int y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public String toString() {
            return "IndexTuple{" +
                    "x=" + x +
                    ", y=" + y +
                    '}';
        }
    }

    public class ValueTriple {
        List<Integer> triplet;

        public ValueTriple(int x, int y, int z) {
            triplet = new ArrayList<>();
            triplet.add(x);
            triplet.add(y);
            triplet.add(z);
            Collections.sort(triplet);
        }

        @Override
        public int hashCode() {
            String hashString =
                String.valueOf(triplet.get(0)) + String.valueOf(triplet.get(1)) + String.valueOf(triplet.get(2));
            return hashString.hashCode();
        }

        @Override
        public boolean equals(Object o) {
            return o.hashCode() == this.hashCode();
        }

        @Override
        public String toString() {
            return "ValueTriple{" +
                    "triplet=" + triplet +
                    '}';
        }
    }

    public List<List<Integer>> threeSum(int[] nums) {
        HashMap<IndexTuple, Integer> sumTracker = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                IndexTuple key = new IndexTuple(i, j);
                sumTracker.put(key, nums[i] + nums[j]);
            }
        }

//        System.out.println(sumTracker);
        HashSet<ValueTriple> finalCandidates = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            for (IndexTuple tuple: sumTracker.keySet()) {
                if (tuple.x != i && tuple.y != i && nums[i] + sumTracker.get(tuple) == 0) {
                    finalCandidates.add(new ValueTriple(nums[tuple.x], nums[tuple.y], nums[i]));
                }
            }
        }

        List<List<Integer>> candidates = new ArrayList<>();
        finalCandidates.forEach(
            triple -> candidates.add(triple.triplet)
        );
//        System.out.println(candidates);

        return candidates;
    }
}
