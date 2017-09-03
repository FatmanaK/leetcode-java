package ca.uwaterloo;

class Solution {
    public String longestCommonPrefix(String[] strs) {

        int shortestLength = Integer.MAX_VALUE;
        String shortestString = "";

        if (strs.length == 0) {
            return shortestString;
        }

        for (String str: strs) {
            if (str.length() < shortestLength) {
                shortestLength = str.length();
                shortestString = str;
            }
        }

        StringBuilder commonPrefixBuilder = new StringBuilder();

        for (int i = 0; i < shortestLength; i++) {
            Character charToMatch = shortestString.charAt(i);
            for (String s: strs) {
                if (s.charAt(i) != charToMatch) {
                    return commonPrefixBuilder.toString();
                }
            }
            commonPrefixBuilder.append(charToMatch);
        }

        return commonPrefixBuilder.toString();
    }
}
