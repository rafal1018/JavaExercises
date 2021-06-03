package com.edabit;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class AlmostPalindromeTest {

    private static Stream<Arguments> getValuesForTrueResult() {
        return Stream.of(
                Arguments.of("abcdcbg", "abccia", "abcdaaa", "gggfgig", "GIGGG"));
    }

    private static Stream<Arguments> getValuesForFalseResult() {
        return Stream.of(
                Arguments.of("gggfggg", "1234312", "ggggg"));
    }

    @ParameterizedTest
    @MethodSource("getValuesForTrueResult")
    void shouldReturnTrueForAlmostPalindrome(String arg) {
        //given
        //when
        boolean result = AlmostPalindrome.almostPalindrome(arg);

        //then
        assertThat(result, equalTo(true));
    }

    @ParameterizedTest
    @MethodSource("getValuesForFalseResult")
    void shouldReturnFalseForPalindrome(String arg) {
        //given
        //when
        boolean result = AlmostPalindrome.almostPalindrome(arg);

        //then
        assertThat(result, equalTo(false));
    }


}
