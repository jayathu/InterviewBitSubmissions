package com.company.HashTable;

import java.util.*;

public class LongestSubsequenceWithZeroSum {

    public ArrayList<Integer> lszero(ArrayList<Integer> A) {

        HashMap<Integer, Integer> map = new HashMap<>();
        int lindex = -1;
        int len = 0;
        int sum = 0;
        for(int i = 0; i < A.size(); i++)
        {
            sum += A.get(i);
            if(A.get(i) == 0)
            {
                len++;
                continue;
            }
            else if(map.containsKey(sum))
            {
                int index = map.get(sum);
                if(i - index > len)
                {
                    lindex = index + 1;
                    len = i - index;
                }
            }
            else if(sum == 0)
            {
                System.out.print("SUM " + sum + "     ");
                lindex = 0;
                len = i + 1;
            }
            else
            {
                map.put(sum, i);
            }
        }

        return subarray(A, lindex, lindex + len - 1);
    }

    ArrayList<Integer> subarray(ArrayList<Integer> A, int i, int j)
    {
        ArrayList<Integer> list = new ArrayList<>();
        if(i == -1)
        {
            //list.add(0);
        }
        else{
            for(int k = i; k <= j; k++)
            {
                list.add(A.get(k));
            }
        }

        return list;
    }
}
