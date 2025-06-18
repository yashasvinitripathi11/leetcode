import java.util.*;

class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        if (intervals.length <= 1) return 0;

        // Sort by the end time of intervals
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[1], b[1]));

        int end = Integer.MIN_VALUE;
        int ansCount = 0;

        for (int[] interval : intervals) {
            if (interval[0] >= end) {
                end = interval[1]; // no overlap, update end
            } else {
                ansCount++; // overlap, need to remove one
            }
        }
        return ansCount;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();

        int[][] intervals = {
            {1, 2},
            {2, 3},
            {3, 4},
            {1, 3}
        };

        int result = sol.eraseOverlapIntervals(intervals);
        System.out.println("Number of intervals to remove: " + result);
    }
}



