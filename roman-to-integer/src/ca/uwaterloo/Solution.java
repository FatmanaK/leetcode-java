package ca.uwaterloo;

import java.util.HashMap;
import java.util.Map;

public class Solution {

    public int romanToInt(String s) {

        if (null == s || s.isEmpty()) {
            return 0;
        }

        Map<Character, Integer> romanToDecimal = getRomanToDecimalMap();

        Integer aggregatedSum = 0;
        Integer iterator = 0;
        while (iterator < s.length()) {
            Character currentRomanCharacter = s.charAt(iterator);
            Character nextRomanCharacter = null;
            if (iterator < s.length() - 1) {
                nextRomanCharacter = s.charAt(iterator + 1);
            }

            if (null != nextRomanCharacter &&
                romanToDecimal.get(currentRomanCharacter) < romanToDecimal.get(nextRomanCharacter)) {
                aggregatedSum += (romanToDecimal.get(nextRomanCharacter) - romanToDecimal.get(currentRomanCharacter));
                iterator += 2;
            } else {
                aggregatedSum += romanToDecimal.get(currentRomanCharacter);
                iterator += 1;
            }
        }

        return aggregatedSum;
    }

    public Map<Character, Integer> getRomanToDecimalMap() {
        Map<Character, Integer> romanToDecimal = new HashMap<>();

        romanToDecimal.put('I', 1);
        romanToDecimal.put('V', 5);
        romanToDecimal.put('X', 10);
        romanToDecimal.put('L', 50);
        romanToDecimal.put('C', 100);
        romanToDecimal.put('D', 500);
        romanToDecimal.put('M', 1000);

        return romanToDecimal;
    }
}
