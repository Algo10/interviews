import java.util.ArrayList;
import java.util.List;

public class Leetcode_MergeIntervals {
	/*
	 * Given a collection of intervals, merge all overlapping intervals.

Example 1:

Input: [[1,3],[2,6],[8,10],[15,18]]
Output: [[1,6],[8,10],[15,18]]
Explanation: Since intervals [1,3] and [2,6] overlaps, merge them into [1,6].
Example 2:

Input: [[1,4],[4,5]]
Output: [[1,5]]
Explanation: Intervals [1,4] and [4,5] are considered overlapping.
	 */
	public int[][] merge(int[][] intervals) {
        if(intervals.length <= 0) return new int[0][2];
        java.util.Arrays.sort(intervals, new java.util.Comparator<int[]>() {
    public int compare(int[] a, int[] b) {
        return Integer.compare(a[0], b[0]);
    }
});
        List<RangeTuple> ranges = new ArrayList<>();
        int currentStart = intervals[0][0];
        int currentEnd = intervals[0][1];
        for(int i=1;i<intervals.length;i++){
            if(intervals[i][0] <= currentEnd) {
                if(currentEnd < intervals[i][1]) currentEnd = intervals[i][1];
            }
            else {
                ranges.add(new RangeTuple(currentStart, currentEnd));
                currentStart = intervals[i][0];
                currentEnd = intervals[i][1];
            }
        }
        ranges.add(new RangeTuple(currentStart, currentEnd));
                
        int[][] rangeIntervals = new int[ranges.size()][2];
        int i = 0;
        for(RangeTuple tuple: ranges){
            rangeIntervals[i][0] = tuple.start;
            rangeIntervals[i][1] = tuple.end;
            i++;
        }
        return rangeIntervals;
    }
    
    private static class RangeTuple {
        public int start;
        public int end;
        public RangeTuple(int start, int end){
            this.start = start;
            this.end = end;
        }
    }
}
