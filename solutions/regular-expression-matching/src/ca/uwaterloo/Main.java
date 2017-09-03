package ca.uwaterloo;

public class Main {

    public static void main(String[] args) {
        Solution solution = new Solution();

        assert !solution.isMatch("aa", "a");
        assert solution.isMatch("aa","aa");
        assert !solution.isMatch("aaa", "aa");
        assert solution.isMatch("ab", ".*");
        assert solution.isMatch("aab", "c*a*b");
        assert !solution.isMatch("ab", ".*c");
        assert solution.isMatch("aaa", "a.a");
    }
}
