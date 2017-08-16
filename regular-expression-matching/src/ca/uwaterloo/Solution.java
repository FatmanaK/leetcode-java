package ca.uwaterloo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {

    abstract class Token {
        boolean repeatable;
    }

    class ConcreteToken extends Token {
        Character pattern;

        ConcreteToken(Character pattern) {
            this.pattern = pattern;
        }

        @Override
        public String toString() {
            return "ConcreteToken{" +
                    "repeatable=" + repeatable +
                    ", pattern='" + pattern + '\'' +
                    '}';
        }
    }

    class WildCardToken extends Token {
        @Override
        public String toString() {
            return "WildCardToken{" +
                    "repeatable=" + repeatable +
                    '}';
        }
    }

    public boolean isMatch(String s, String p) {

        if (null == s || null == p) {
            return false;
        }

        int sLen = s.length();
        List<Token> tokens = tokenizePattern(p);
        System.out.println(tokens);

        int tokenIndex = 0;
        int stringIndex = 0;
        int previousConcreteIndex = 0;
        for (int i = 0; i < tokens.size(); i++) {
            Token token = tokens.get(i);
            if (token instanceof ConcreteToken) {
                ConcreteToken concreteToken = (ConcreteToken) token;
                while (stringIndex < sLen && concreteToken.pattern != s.charAt(stringIndex)) {
                    ++stringIndex;
                }

                if (stringIndex == sLen) {
                    return false;
                } else {
                    return isMatch(s.substring(previousConcreteIndex, stringIndex), s.sub)
                }
            }
        }

        return true;
    }

    private List<Token> tokenizePattern(String p) {
        List<Token> tokens = new ArrayList<>();
        int patternLength = p.length();

        int index = 0;
        while (index < patternLength) {

            Token currentToken = null;
            if (p.charAt(index) == '.') {
                currentToken = new WildCardToken();
            } else {
                currentToken = new ConcreteToken(p.charAt(index));
            }
            ++index;

            if (index + 1 < patternLength && p.charAt(index + 1) == '*') {
                currentToken.repeatable = true;
                ++index;
            }

            tokens.add(currentToken);
        }

        return tokens;
    }
}
