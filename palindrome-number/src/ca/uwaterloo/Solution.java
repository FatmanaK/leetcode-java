package ca.uwaterloo;

public class Solution {
    public boolean isPalindrome(int x) {

        if (x < 0) {
            return false;
        }

        long maxDecimal = 1;
        int quotient = -1;
        while (quotient != 0) {
            maxDecimal *= 10;
            quotient = (int) (x/maxDecimal);
        }
        maxDecimal /= 10;
        long divisor = 10;

        while (true) {
            int leftmost = ((int) (x/maxDecimal)) % (10);
            int rightmost = (int) ((x % divisor) / (divisor/10));

            if (leftmost != rightmost) {
                return false;
            }
            maxDecimal /= 10;
            divisor *= 10;

            if (maxDecimal == 0)
                break;
        }

        return true;
    }
}
