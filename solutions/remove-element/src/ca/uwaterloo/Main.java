package ca.uwaterloo;

public class Main {

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.removeElement(new int[] {3, 2, 2, 3}, 3));
        System.out.println(solution.removeElement(new int[] {3, 4, 4, 3, 4, 4}, 4));
    }
}
