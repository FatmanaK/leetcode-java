package ca.uwaterloo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

class Solution {

    public HashMap<Character, List<Character>> getNumberMap() {
        HashMap<Character, List<Character>> numberMap = new HashMap<>();

        numberMap.put('2', Arrays.asList('a', 'b', 'c'));
        numberMap.put('3', Arrays.asList('d', 'e', 'f'));
        numberMap.put('4', Arrays.asList('g', 'h', 'i'));
        numberMap.put('5', Arrays.asList('j', 'k', 'l'));
        numberMap.put('6', Arrays.asList('m', 'n', 'o'));
        numberMap.put('7', Arrays.asList('p', 'q', 'r', 's'));
        numberMap.put('8', Arrays.asList('t', 'u', 'v'));
        numberMap.put('9', Arrays.asList('w', 'x', 'y', 'z'));

        return numberMap;
    }

    public List<String> letterCombinations(String digits) {

        ArrayList<String> permutations = new ArrayList<>();
        if (null == digits || digits.isEmpty()) {
            return permutations;
        }

        permutations.add("");
        HashMap<Character, List<Character>> numberMap = getNumberMap();

        for (Character c : digits.toCharArray()) {
            ArrayList<String> newPermutations = new ArrayList<>();
            List<Character> substitutes = numberMap.get(c);
            for (Character sub: substitutes) {
                for (String permutation: permutations) {
                    newPermutations.add(permutation + sub);
                }
            }
            permutations = newPermutations;
        }

        return permutations;
    }
}
