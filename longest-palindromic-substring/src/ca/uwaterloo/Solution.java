package ca.uwaterloo;

public class Solution {
    public String longestPalindrome(String s) {

        int maxLength = 0;
        String maxPal = null;
        int length = 0;

        for (int i = 0; i < s.length(); i++) {
            for (int j = i; j < s.length(); j++) {
                String currStr = s.substring(i, j + 1);
                if (isPalindrome(currStr)) {
                    length = currStr.length();
                    if (length > maxLength) {
                        maxLength = length;
                        maxPal = currStr;
                    }
                }
            }
        }

        return maxPal;
    }

    private Boolean isPalindrome(String currStr) {
        return currStr.equals(new StringBuilder(currStr).reverse().toString());
    }
}
