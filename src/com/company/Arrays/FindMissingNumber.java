package com.company.Arrays;
import java.util.*;

/*
Given an unsorted integer array, find the first missing positive integer.
Example:
Given [1,2,0] return 3,
[3,4,-1,1] return 2,
[-8, -7, -6] returns 1
Your algorithm should run in O(n) time and use constant space.
 */

public class FindMissingNumber {
    public int firstMissingPositive(ArrayList<Integer> A) {

        int N = A.size();
        int[] arr = new int[N + 1];

        for(int i = 0; i < A.size(); i++)
        {
            if(A.get(i) > 0)
            {
                arr[A.get(i)] = 1;
            }
        }

        for(int i = 1; i < arr.length; i++)
        {
            if(arr[i] == 0)
                return i;
        }

        return arr.length;
    }
}
