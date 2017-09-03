package ca.uwaterloo;

import java.util.*;

public class Solution {
    public String convert(String s, int numRows) {

        if (null == s || s.isEmpty() || numRows == 1) {
            return s;
        }

        int cycleCount = (2 * numRows) - 2;

        Map<Integer, List<Character>> rowMap = new HashMap<>();
        for (int i = 0; i < numRows; i++) {
            rowMap.put(i, new ArrayList<Character>());
        }

        int bucket = 0;
        int direction = -1;
        for (int i = 0; i < s.length(); i++) {

            if (i % cycleCount == 0 || i % cycleCount == numRows - 1) {
                direction *= -1;
            }

//            System.out.println("bucket: " + bucket);
//            System.out.println("direction: " + direction);
            Character c = s.charAt(i);
//            System.out.println("currentChar: " + c);

            List<Character> currentRowList = rowMap.get(bucket);
//            System.out.println("currentRowList: " + currentRowList);
            currentRowList.add(c);
//            System.out.println("updatedRowList: " + currentRowList);
            rowMap.put(bucket, currentRowList);

            bucket += direction;

//            System.out.print(c);
        }

        char[] modifiedCharArray = new char[s.length()];
        int j = 0;
        for (int i = 0; i < numRows; i++) {
            List<Character> currentRowList = rowMap.get(i);
            for (Character c: currentRowList) {
                modifiedCharArray[j] = c;
                ++j;
            }
        }

        return new String(modifiedCharArray);
    }
}
