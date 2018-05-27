package com.company.Arrays;
import java.util.*;

/*
Given a set of non-overlapping intervals, insert a new interval into the intervals (merge if necessary).
You may assume that the intervals were initially sorted according to their start times.

Example 1:
Given intervals [1,3],[6,9] insert and merge [2,5] would result in [1,5],[6,9].

Example 2:
Given [1,2],[3,5],[6,7],[8,10],[12,16], insert and merge [4,9] would result in [1,2],[3,10],[12,16].
This is because the new interval [4,9] overlaps with [3,5],[6,7],[8,10].

Make sure the returned intervals are also sorted.

 */

public class InsertInterval {

    class Interval {

        int start;
        int end;

        Interval() {
            start = 0;
            end = 0;
        }

        Interval(int s, int e) {
            start = s;
            end = e;
        }

    }

    public ArrayList<Interval> insert(ArrayList<Interval> intervals, Interval newInterval) {

        ArrayList<Interval> results = new ArrayList<>();
        Interval mergedInterval = newInterval;
        int i = 0;
        boolean added = false;
        for (i = 0; i < intervals.size(); i++) {
            Interval interval1 = intervals.get(i);
            Interval interval2 = mergedInterval;

            if (interval1.start > interval2.start) {
                Interval temp = interval1;
                interval1 = interval2;
                interval2 = temp;
            }

            if (interval1.end < interval2.start) {
                results.add(interval1);
                if (interval1.start == mergedInterval.start &&
                        interval1.end == mergedInterval.end) {
                    added = true;
                    break;
                }
            } else {
                mergedInterval.start = Math.min(interval1.start, interval2.start);
                mergedInterval.end = Math.max(interval1.end, interval2.end);
            }
        }

        for (int j = i; j < intervals.size(); j++) {
            results.add(intervals.get(j));
        }

        if (!added) {
            results.add(mergedInterval);
        }
        return results;

    }
}
