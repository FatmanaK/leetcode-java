package ca.uwaterloo;

public class Main {

    public static void main(String[] args) {
        Solution solution = new Solution();

        assert solution.romanToInt("X") == 10;
        assert solution.romanToInt("XX") == 20;
        assert solution.romanToInt("XL") == 40;
        assert solution.romanToInt("CCCL") == 350;
        assert solution.romanToInt("MMMDLXXXVI") == 3586;
    }
}
