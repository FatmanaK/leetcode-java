package ca.uwaterloo;

public class Solution {
    public int reverse(int x) {

//        System.out.println(x);

        if (x/10 == 0) {
            return x;
        }

        Long origX = (long) x;
        Long revX = 0L;

        while (origX != 0) {

            revX = revX * 10 + (origX % 10);
//            System.out.println(revX);
            origX = origX / 10;
//            System.out.println(origX);
        }

        if (revX > Integer.MAX_VALUE || revX < Integer.MIN_VALUE) {
            return 0;
        }

        return revX.intValue();
    }
}
