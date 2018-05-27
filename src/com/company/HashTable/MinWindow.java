package com.company.HashTable;
import java.util.*;

public class MinWindow {

    //This code works! Passed all test cases Phew!
    public String minWindow(String A, String B) {

        /*
        S = "ADOBECODEBANC"
        T = "ABC"
        */
        int minLen = Integer.MAX_VALUE;
        int minLeft = 0;
        int minRight = 0;

        HashMap<Character, Integer> map = new HashMap<>();
        HashMap<Character, Integer> currMap = new HashMap<>();
        for(char c : B.toCharArray())
        {
            Integer count = map.get(c);
            if(count == null)
            {
                count = 0;
            }
            map.put(c, count+1);
        }

        int left = 0, right = 0;
        while(left <= right && right < A.length())
        {
            while(right < A.length() && !controls(currMap, map))
            {
                Character c = A.charAt(right);
                if(map.containsKey(c))
                {
                    addToMap(currMap, c);
                }
                right++;
            }

            if(minLen == Integer.MAX_VALUE && right == A.length() && !controls(currMap, map))
            {
                return "";
            }

            while(left <= right && controls(currMap, map))
            {
                Character c = A.charAt(left);
                if(map.containsKey(c))
                {
                    removeFromMap(currMap, c);
                }
                left++;
            }


            if(minLen > right - left)
            {
                minLen = right - left + 1;
                minLeft = left;
                minRight = right;
                String s = A.substring(minLeft - 1, minRight);
            }
        }

        if (minLen == Integer.MAX_VALUE) {
            return "";
        }
        return A.substring(minLeft - 1, minRight);

    }

    void removeFromMap(HashMap<Character, Integer> currMap, Character c)
    {
        Integer count = currMap.get(c);
        if(count != null)
        {
            if(count == 1)
            {
                currMap.remove(c);
            }
            else
            {
                currMap.put(c, count - 1);
            }
        }
    }

    void addToMap(HashMap<Character, Integer> currMap, Character c)
    {
        Integer count = currMap.get(c);
        if(count == null)
        {
            count = 0;
        }
        currMap.put(c, count + 1);
    }

    boolean controls(HashMap<Character, Integer> currMap, HashMap<Character, Integer> map)
    {
        for(Map.Entry<Character, Integer> entry : map.entrySet())
        {
            Character key = entry.getKey();
            Integer value = entry.getValue();
            if(!currMap.containsKey(key) || currMap.get(key) < value) {
                return false;
            }
        }

        return true;
    }

    public String minWindow2(String A, String B) {
        if (B == null || B.length() == 0) {
            return "";
        }
        Set<Character> charSet = new HashSet<>();
        Map<Character, Integer> countMap = new HashMap<>();
        for (Character c : B.toCharArray()) {
            charSet.add(c);
            if (countMap.containsKey(c)) {
                countMap.put(c, countMap.get(c) + 1);
            } else {
                countMap.put(c, 1);
            }
        }
        int start = 0, end = 0;
        int minStart = -1, minLength = Integer.MAX_VALUE;
        while (end < A.length()) {
            char endChar = A.charAt(end);
            if (charSet.contains(endChar)) {
                countMap.put(endChar, countMap.get(endChar) - 1);
            }
            if (satisfies(countMap)) {
                int curLength = end - start + 1;
                if (curLength < minLength) {
                    minLength = curLength;
                    minStart = start;
                }
                start++;
                char startChar = A.charAt(start - 1);
                if (countMap.containsKey(startChar)) {
                    countMap.put(startChar, countMap.get(startChar) + 1);
                }
                while (satisfies(countMap) && start <= end) {
                    curLength = end - start + 1;
                    if (curLength < minLength) {
                        minLength = curLength;
                        minStart = start;
                    }
                    start++;
                    startChar = A.charAt(start - 1);
                    if (countMap.containsKey(startChar)) {
                        countMap.put(startChar, countMap.get(startChar) + 1);
                    }
                }
            }
            end++;
        }
        if (minLength == Integer.MAX_VALUE) {
            return "";
        }
        return A.substring(minStart, minStart + minLength);
    }

    private boolean satisfies(Map<Character, Integer> countSet) {
        Set<Character> keySet = countSet.keySet();
        for (Character c : keySet) {
            if (countSet.get(c) > 0) {
                return false;
            }
        }
        return true;
    }
}
