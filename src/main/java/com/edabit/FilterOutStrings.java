package com.edabit;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.stream.Collectors;

/**
 * Create a function that takes an array of non-negative integers and strings and return a new array without the strings.
 * <p>
 * Examples
 * filterArray([1, 2, "a", "b"]) ➞ [1, 2]
 * <p>
 * filterArray([1, "a", "b", 0, 15]) ➞ [1, 0, 15]
 * <p>
 * filterArray([1, 2, "aasf", "1", "123", 123]) ➞ [1, 2, 123]
 */

public class FilterOutStrings {

    public static String[] filterArray(String[] str) {
        return Arrays.stream(str)
                .filter(FilterOutStrings::isInteger)
                .collect(Collectors.toCollection(LinkedHashSet::new))
                .stream()
                .toArray(size -> new String[size]);
    }

    private static boolean isInteger(String number) {
        try {
            Integer.valueOf(number);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

}
