package ca.uwaterloo;

class Solution {
    public int divide(int dividend, int divisor) {

        if (divisor == 0) {
            return Integer.MAX_VALUE;
        }

        int sign = 1;
        long lDividend = dividend;
        long lDivisor = divisor;
        if ((lDividend < 0 && lDivisor > 0) || (lDividend > 0 && lDivisor < 0)) {
            sign = -1;
        }

        lDividend = Math.abs(lDividend);
        lDivisor = Math.abs(lDivisor);

        double logAns = Math.log(lDividend) - Math.log(lDivisor);
        long answer = (long) Math.exp(logAns) * sign;

        if (answer > Integer.MAX_VALUE || answer < Integer.MIN_VALUE) {
            answer = (long) Integer.MAX_VALUE;
        }

        return (int) answer;
    }
}
