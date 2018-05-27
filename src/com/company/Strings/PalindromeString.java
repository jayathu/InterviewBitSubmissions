package com.company.Strings;

public class PalindromeString {
    boolean isAscii(char c)
    {
        if((c >= 48 && c <= 57) || (c >= 97 && c <= 122))
            return true;
        return false;

    }

    public int isPalindrome(String A) {

        A = A.toLowerCase();
        int left = 0;
        int right = A.length() - 1;
        while(left <= right)
        {
            if(!isAscii(A.charAt(left)))
            {
                left++;
            }
            else if(!isAscii(A.charAt(right)))
            {
                right--;
            }
            else if(A.charAt(left) != A.charAt(right))
            {
                return 0;
            }
            else
            {
                left++;
                right--;
            }
        }

        return 1;
    }
}
