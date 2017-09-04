package ca.uwaterloo;

import java.util.HashMap;
import java.util.Stack;

class Solution {

    public boolean isValid(String s) {
        Stack<Character> characterStack = new Stack<>();
        HashMap<Character, Character> characterHashMap = getCharacterHashMap();

        for (Character c: s.toCharArray()) {
            if (!characterStack.isEmpty() &&
                characterHashMap.containsKey(c) &&
                characterHashMap.get(c).equals(characterStack.peek())) {
                characterStack.pop();
            } else {
                characterStack.push(c);
            }
        }

        return characterStack.isEmpty();
    }

    public HashMap<Character, Character> getCharacterHashMap() {
        HashMap<Character, Character> characterHashMap = new HashMap<>();

        characterHashMap.put(')', '(');
        characterHashMap.put(']', '[');
        characterHashMap.put('}', '{');

        return characterHashMap;
    }
}
