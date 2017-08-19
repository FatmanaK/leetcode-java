package ca.uwaterloo;

public class Main {

    public static void main(String[] args) {
        Solution solution = new Solution();
        assert solution.intToRoman(11).equals("XI");
        assert solution.intToRoman(1).equals("I");
        assert solution.intToRoman(3999).equals("MMMCMXCIX");
        assert solution.intToRoman(16).equals("XVI");
        assert solution.intToRoman(145).equals("CXLV");
        assert solution.intToRoman(60).equals("LX");
    }
}
