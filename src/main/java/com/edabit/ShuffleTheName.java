package com.edabit;

/**
 * Create a method that accepts a string (of a person's first and last name) and returns a string with
 * the first and last name swapped.
 * <p>
 * Examples
 * nameShuffle("Donald Trump") ➞ "Trump Donald"
 * <p>
 * nameShuffle("Rosie O'Donnell") ➞ "O'Donnell Rosie"
 * <p>
 * nameShuffle("Seymour Butts") ➞ "Butts Seymour"
 */

public class ShuffleTheName {

    public static String nameShuffle(String s) {
        String[] sToArray = s.split(" ");
        return sToArray[1] + " " + sToArray[0];
    }

}
