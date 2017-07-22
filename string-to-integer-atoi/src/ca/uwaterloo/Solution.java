package ca.uwaterloo;

public class Solution {
    public int myAtoi(String str) {
        if (null == str || str.isEmpty()) {
            return 0;
        }

        StringBuilder builder = new StringBuilder();

        Integer multiplier = 1;

        boolean wspaceFlag = true;
        boolean signFlag = true;
        int i = 0;


        while (i < str.length()) {
            char c = str.charAt(i);
            if (wspaceFlag && c == ' ') {
                ++i;
                continue;
            }
            wspaceFlag = false;

            if (signFlag) {
                if (c == '-' || c == '+') {
                    if (c == '-') {
                        multiplier = -1;
                    }
                    ++i;
                    signFlag = false;
                    continue;
                }
            }
            signFlag = false;

            int j = 0;
            try {
                j = Integer.valueOf(Character.toString(c));
            } catch (NumberFormatException e) {
                if (builder.length() == 0) {
                    return 0;
                } else {
                    break;
                }
            }
            builder.append(j);

            ++i;
        }

        if (builder.length() == 0) {
            return 0;
        }

        Integer value = 0;
        try {
            value = Integer.valueOf(builder.toString()) * multiplier;
        } catch (NumberFormatException e) {
            if (multiplier == 1) {
                value = Integer.MAX_VALUE;
            } else {
                value = Integer.MIN_VALUE;
            }
        }

        return value;
    }
}
