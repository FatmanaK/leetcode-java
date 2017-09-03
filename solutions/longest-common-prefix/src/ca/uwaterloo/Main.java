package ca.uwaterloo;

public class Main {

    public static void main(String[] args) {
        Solution solution = new Solution();

        assert solution.longestCommonPrefix(new String[] {"cat", "caterpillar", "catastrophe"}).equals("cat");
        assert solution.longestCommonPrefix(new String[] {"cat", "caterpillar", "dog"}).equals("");
        assert solution.longestCommonPrefix(new String[] {}).equals("");
    }
}
