package ca.uwaterloo;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> validParentheses = new ArrayList<>();

        backtrack(validParentheses, "", 0, 0, n);

        return validParentheses;
    }

    private void backtrack(List<String> validParentheses, String currentCandidate,
                           int numOpen, int numClosed, int maxNum) {

        if (currentCandidate.length() == maxNum * 2) {
            validParentheses.add(currentCandidate);
        }

        if (numOpen < maxNum) {
            backtrack(validParentheses, currentCandidate + "(",
                numOpen + 1, numClosed, maxNum);
        }
        if (numClosed < numOpen) {
            backtrack(validParentheses, currentCandidate + ")",
                numOpen, numClosed + 1, maxNum);
        }
    }
}
