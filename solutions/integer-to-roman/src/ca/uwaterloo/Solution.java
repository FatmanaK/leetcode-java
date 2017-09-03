package ca.uwaterloo;

import java.util.HashMap;

class Solution {

    public String intToRoman(int num) {

        HashMap<Integer, Character> decimalToRomanMapping = getDecimalToRomanMap();
        StringBuilder stringBuilder = new StringBuilder();

        int tensMultiple = 1;
        // iterates over the digits from the units place
        while (num != 0) {
            int unitsDigit = num % 10;

            // case when the current units place has an equivalent roman number
            if (decimalToRomanMapping.containsKey(unitsDigit * tensMultiple)) {
                stringBuilder.append(decimalToRomanMapping.get(unitsDigit * tensMultiple));
            }

            // case when the current units place is one less than multiples of 5, which means the upper match needs to
            // be added once, followed by the lower match
            else if (unitsDigit % 5 == 4) {
                stringBuilder.append(decimalToRomanMapping.get((unitsDigit + 1) * tensMultiple));
                stringBuilder.append(decimalToRomanMapping.get(tensMultiple));
            }

            // other cases: if the digit is greater than 5, append 5 after calculating it's offset from 5
            // else just append the offset
            else {
                Character charToAppend = null;
                if (unitsDigit > 5) {
                    charToAppend = decimalToRomanMapping.get(5 * tensMultiple);
                    unitsDigit -= 5;
                }
                int distanceToClosestRomanNumber = (unitsDigit % 5) - 1;
                Character closestRomanNumber = decimalToRomanMapping.get(tensMultiple);
                for (int i = 0; i < distanceToClosestRomanNumber + 1; i++) {
                    stringBuilder.append(closestRomanNumber);
                }

                if (null != charToAppend) {
                    stringBuilder.append(charToAppend);
                }
            }

            num /= 10;
            tensMultiple *= 10;
        }

        stringBuilder = stringBuilder.reverse();
//        System.out.println(stringBuilder.toString());

        return stringBuilder.toString();
    }

    public HashMap<Integer, Character> getDecimalToRomanMap() {
        HashMap<Integer, Character> decimalToRomanMapping = new HashMap<>();

        decimalToRomanMapping.put(1, 'I');
        decimalToRomanMapping.put(5, 'V');
        decimalToRomanMapping.put(10, 'X');
        decimalToRomanMapping.put(50, 'L');
        decimalToRomanMapping.put(100, 'C');
        decimalToRomanMapping.put(500, 'D');
        decimalToRomanMapping.put(1000, 'M');

        return decimalToRomanMapping;
    }
}
