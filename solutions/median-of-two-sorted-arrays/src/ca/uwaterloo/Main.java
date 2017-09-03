package ca.uwaterloo;

public class Main {

    public static void main(String[] args) {
        Solution solution = new Solution();

        int[] arr1 = new int[]{1, 2, 7, 9};
        int[] arr2 = new int[]{3, 5};

        Double ans = solution.findMedianSortedArrays(arr1, arr2);
        System.out.println(ans);
    }
}
