package com.edabit;

/**
 * Create a function that takes an array of numbers and return "Boom!"
 * if the digit 7 appears in the array. Otherwise, return "there is no 7 in the array".
 * Examples
 * sevenBoom([1, 2, 3, 4, 5, 6, 7]) ➞ "Boom!"
 * // 7 contains the number seven.
 *
 * sevenBoom([8, 6, 33, 100]) ➞ "there is no 7 in the array"
 * // None of the items contain 7 within them.
 *
 * sevenBoom([2, 55, 60, 97, 86]) ➞ "Boom!"
 * // 97 contains the number seven.
 */
public class SevenBoom {

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
