package com.company.Arrays;
import java.util.*;

/*
Given a collection of intervals, merge all overlapping intervals.

For example:
Given [1,3],[2,6],[8,10],[15,18],
return [1,6],[8,10],[15,18].
Make sure the returned intervals are sorted.

 */

public class MergeInterval {

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
                    System.out.println("Added mergedInterval" + i);
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
