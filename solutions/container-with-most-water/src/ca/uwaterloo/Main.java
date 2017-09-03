package ca.uwaterloo;

public class Main {

    public static void main(String[] args) {
        Solution solution = new Solution();
        GreedySolution greedySolution = new GreedySolution();

        System.out.println(greedySolution.maxArea(new int[] {2, 3, 4, 5, 18, 17, 6}));
        System.out.println(solution.maxArea(new int[] {2, 3, 4, 5, 18, 17, 6}));
    }
}
