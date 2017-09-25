package ca.uwaterloo;

public class Main {

    public static void main(String[] args) {
        Solution solution = new Solution();

        System.out.println(solution.divide(15, -4));
        System.out.println(solution.divide(15, 3));
        System.out.println(solution.divide(-20, 6));
        System.out.println(solution.divide(20, 0));
        System.out.println(solution.divide(0, 0));
        System.out.println(solution.divide(0, -3));
        System.out.println(solution.divide(-2147483648, -1));
    }
}
