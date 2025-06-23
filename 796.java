import java.util.*;
 class Solution {

    public boolean rotateString(String s, String goal) {
        if (s.length() != goal.length()) {
            return false;
        }
        return (s + s).contains(goal);
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        // Test cases
        String s = "abcde";
        String goal = "cdeab";

        boolean result = solution.rotateString(s, goal);
        System.out.println("Is \"" + goal + "\" a rotation of \"" + s + "\"? " + result);
    }
}
