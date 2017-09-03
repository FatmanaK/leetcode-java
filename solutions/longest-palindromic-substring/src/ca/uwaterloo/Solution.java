package ca.uwaterloo;

public class Solution {

    private int maxLen = 0;
    private String maxSub = null;

    public String longestPalindrome(String s) {

        int strLen = s.length();

        if (strLen < 2) {
            return s;
        }

        int j;
        for (int i = 0; i < strLen; i++) {
            bloomPalindrome(s, strLen, i, i);
            bloomPalindrome(s, strLen, i, i + 1);
        }

        return maxSub;
    }

    private void bloomPalindrome(String s, int strLen, int i, int j) {
        if (i >=0 && j < strLen) {
            if (s.charAt(i) == s.charAt(j)) {
                if (j - i + 1 > maxLen) {
                    maxLen = j - i + 1;
                    maxSub = s.substring(i, j + 1);
                }

                bloomPalindrome(s, strLen, i - 1, j + 1);
            }
        }
    }
}
