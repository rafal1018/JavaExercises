package com.edabit;

import java.util.Arrays;

/**
 * Create a function that takes an array of numbers and return "Boom!"
 * if the digit 7 appears in the array. Otherwise, return "there is no 7 in the array".
 */
public class Challenge {

    public static String sevenBoom(int[] arr) {
        String result = "there is no 7 in the array";
        int digit = 0;
        for (int element : arr) {
            while (element > 0) {
                digit = element % 10;
                element = element / 10;
                if (digit == 7) result = "Boom!";
            }
        }
        return result;
    }

}
