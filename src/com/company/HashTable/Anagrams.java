package com.company.HashTable;
import java.util.*;

public class Anagrams {

        // DO NOT MODIFY THE LIST. IT IS READ ONLY
        public ArrayList<ArrayList<Integer>> anagrams(final List<String> A) {

            ArrayList<ArrayList<Integer>> results = new ArrayList<>();

            HashMap<String, ArrayList<Integer>> map = new HashMap<>();

            for(int i = 0; i < A.size(); i++)
            {
                String key = hash(A.get(i));
                ArrayList<Integer> indices = map.get(key);
                if(indices == null)
                {
                    indices = new ArrayList<>();
                }
                indices.add(i);
                map.put(key, indices);
            }

            for(String key : map.keySet())
            {
                results.add(map.get(key));
            }
            return results;
        }

        private String hash(String s)
        {
            int[] ascii = new int[128];
            char[] arr = s.toCharArray();
            for(int i = 0; i < arr.length; i++)
            {
                ascii[arr[i]]++;
            }
            StringBuilder sb = new StringBuilder();
            for(int i = 0; i < ascii.length; i++)
            {
                while(ascii[i] > 0)
                {
                    char c = (char)(i);
                    sb.append(c);
                    ascii[i] -= 1;
                }
            }

            return sb.toString();
        }

}
