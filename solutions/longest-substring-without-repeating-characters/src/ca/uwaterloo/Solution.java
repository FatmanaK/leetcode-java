package ca.uwaterloo;

import java.util.HashMap;
import java.util.Map;

public class Solution {

    public int lengthOfLongestSubstring(String s) {

        int startIndex = 0;
        int newStartIndex;
        int maxLength = 0;
        int length;
        Map<Character, Integer> currentChars = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {

            char currChar = s.charAt(i);
            if (currentChars.keySet().contains(currChar)) {
                newStartIndex = currentChars.get(currChar) + 1;
                for (int j = startIndex; j < newStartIndex; j++) {
                    currentChars.remove(s.charAt(j));
                }
                startIndex = newStartIndex;
            }
            currentChars.put(currChar, i);

            length = currentChars.keySet().size();
            if (length > maxLength) {
                maxLength = length;
            }
        }

        return maxLength;
    }
}
