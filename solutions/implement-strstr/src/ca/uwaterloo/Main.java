package ca.uwaterloo;

public class Main {

    public static void main(String[] args) {
        Solution solution = new Solution();

        System.out.println(solution.strStr("abc", "abcd"));
        System.out.println(solution.strStr("abc", "abc"));
        System.out.println(solution.strStr("abc", "ab"));
        System.out.println(solution.strStr("abc", "bc"));
        System.out.println(solution.strStr("abc", "d"));
        System.out.println(solution.strStr("abcdef", "d"));
        System.out.println(solution.strStr("abcdef", "ed"));
        System.out.println(solution.strStr("abcdef", "ef"));
    }
}
