package ca.uwaterloo;

class Solution {
    public int strStr(String haystack, String needle) {

        if (null == haystack || null == needle || needle.length() > haystack.length()) {
            return -1;
        } else if (needle.length() == haystack.length() && haystack.equals(needle)) {
            return 0;
        }

        int i = 0;
        while (i <= haystack.length() - needle.length()) {
            if (haystack.substring(i, i + needle.length()).equals(needle)) {
                return i;
            }
            ++i;
        }

        return -1;
    }
}
