package com.edabit;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Stream;

/**
 * Write a function that creates an object with each (key, value)
 * pair being the (lower case, upper case) versions of a letter, respectively.
 * <p>
 * Examples
 * mapping(["x", "a", "v", "i", "e", "r"]) ➞ { "x"="X", "a"="A", "v"="V", "i"="I", "e"="E", "r"="R" }
 * mapping(["t", "e", "s", "h", "a"]) ➞ { t=T, e=E, s=S, h=H, a=A }
 * mapping(["p", "s"]) ➞ { "p"="P", "s"="S" }
 * mapping(["a", "b", "c"]) ➞ { "a"="A", "b"="B", "c"="C" }
 * mapping(["a", "v", "y", "z"]) ➞ { "a"="A", "v"="V", "y"="Y", "z"="Z" }
 * mapping(["d", "x", "t", "s"]) ➞ { "d"="D", "x"="X", "t"="T", "s"="S" }
 */
public class LetterCase {

    public static Map<String, String> mapping(String[] letters) {
        Map<String, String> letterCaseMap = new LinkedHashMap<>();
        Stream.of(letters).forEach(n -> letterCaseMap.put(n, n.toUpperCase()));
        return letterCaseMap;
    }

}
