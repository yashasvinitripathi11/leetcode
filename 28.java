 import java.util.*;
 class Solution {

    public int strStr(String haystack, String needle) {
        int n = haystack.length();
        int m = needle.length();
        if (m == 0) return 0;

        for (int i = 0; i <= n - m; i++) {
            int j;
            for (j = 0; j < m; j++) {
                if (haystack.charAt(i + j) != needle.charAt(j)) {
                    break;
                }
            }
            if (j == m) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        // Test case
        String haystack = "hello";
        String needle = "ll";

        int index = solution.strStr(haystack, needle);
        System.out.println("Index of \"" + needle + "\" in \"" + haystack + "\": " + index);
    }
}
