package com.edabit;

import java.util.Arrays;

/**
 * Create a function that determines whether elements in an array can be re-arranged
 * to form a consecutive list of numbers where each number appears exactly once.
 *
 * Examples
 * cons([5, 1, 4, 3, 2]) ➞ true
 * // Can be re-arranged to form [1, 2, 3, 4, 5]
 *
 * cons([5, 1, 4, 3, 2, 8]) ➞ false
 *
 * cons([5, 6, 7, 8, 9, 9]) ➞ false
 * // 9 appears twice
 */
public class ConsecutiveNumbers {

    public static boolean cons(int[] arr) {
        boolean result = true;
        Arrays.sort(arr);

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[i - 1] + 1) {
                result = false;
            }
        }
        return result;
    }

}
