package com.company.Strings;

public class ReverseWords {

    public String reverseWords(String a) {

        String compressed = compress(a);
        char[] arr = compressed.toCharArray();
        reverse(arr, 0, arr.length - 1);

        int i = 0, j;
        while(i < arr.length)
        {
            j = i;
            while(j < arr.length && arr[j] != ' ') j++;
            reverse(arr, i, j - 1);
            i = j + 1;
        }

        StringBuilder sb = new StringBuilder();
        for(char c : arr)
        {
            sb.append(c);
        }


        System.out.print(sb);
        return sb.toString();
    }

    private String compress(String s) {

       StringBuilder sb = new StringBuilder();
       int i = 0;
       int j = s.length() - 1;
       int count = 0;
       while(s.charAt(i) == ' ') i++;
       while(s.charAt(j) == ' ') j--;
       while(i <= j)
       {
           if(s.charAt(i) != ' ')
           {
               sb.append(s.charAt(i));
               count = 0;
           }
           else if(count == 0)
           {
               sb.append(s.charAt((i)));
               count = 1;
           }
           i++;
       }
       return sb.toString();
    }

    private void reverse(char[] arr, int i, int j) {

        while (i < j) {
            char temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
}
