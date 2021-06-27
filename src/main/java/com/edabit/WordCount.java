package com.edabit;

/**
 * Create a method that takes a string and returns the word count. The string will be a sentence.
 * <p>
 * Examples
 * countWords("Just an example here move along") ➞ 6
 * <p>
 * countWords("This is a test") ➞ 4
 * <p>
 * countWords("What an easy task, right") ➞ 5
 */

public class WordCount {

    public static int countWords(String str) {
        return str.split(" ").length;
    }

}
