package com.company.HashTable;

import java.util.*;

public class LongestSubstringWithUnique {

    public int lengthOfLongestSubstring(String A) {

        HashMap<Character, Integer> map = new HashMap<>();
        int left = 0, right = 0;
        char[] arr = A.toCharArray();
        int count = 0;
        while(left <= right && right < arr.length)
        {
            if(!map.containsKey(arr[right]))
            {
                map.put(arr[right], 1);
                right++;

            }
            else
            {
                count = Math.max(count, map.size());
                while(left <= right)
                {
                    if(arr[left] == arr[right]){
                        map.remove(arr[left]);
                        left++;
                        break;
                    }else{
                        map.remove(arr[left]);
                        left++;
                    }
                }
            }
            count = Math.max(count, map.size());
        }
        return count;
    }
}
