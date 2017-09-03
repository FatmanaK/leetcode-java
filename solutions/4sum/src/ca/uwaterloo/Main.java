package ca.uwaterloo;

public class Main {

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.fourSum(new int[] {1, 0, -1, 0, -2, 2}, 0));
        System.out.println(solution.fourSum(new int[] {0, 0, 0, 0}, 0));
        System.out.println(solution.fourSum(new int[] {0, 0, 0, 0}, 1));
        System.out.println(solution.fourSum(new int[] {-3, -2, -1, 0, 0, 1, 2, 3}, 0));
        System.out.println(solution.fourSum(new int[] {-1, 0, 1, 2, -1, -4}, -1));
    }
}
