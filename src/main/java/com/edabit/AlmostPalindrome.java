package com.edabit;

public class AlmostPalindrome {

    public static boolean almostPalindrome(String str) {
        int length = str.length();
        int halfLength = str.length() / 2;
        int count = 0;

        for (int i = 0; i < halfLength; i++) {
            if (str.charAt(i) != str.charAt(length - i - 1)){
                count++;
            }
        }

        return count > 0;
    }

    public static void main(String[] args) {
        System.out.println(almostPalindrome("abcdcbg"));
    }

}
