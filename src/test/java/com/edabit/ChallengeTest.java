package com.edabit;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class ChallengeTest {

    @ParameterizedTest
    @MethodSource("streamOfArraysForTestPass")
    void shouldReturnBoom(int[] arg) {
        //given
        //when
        String result = Challenge.sevenBoom(arg);

        //then
        assertThat(result, equalTo("Boom!"));
    }

    @ParameterizedTest
    @MethodSource("streamOfArraysForTestFail")
    void shouldReturnFail(int[] arg) {
        //given
        //when
        String result = Challenge.sevenBoom(arg);

        //then
        assertThat(result, equalTo("there is no 7 in the array"));
    }

    private static Stream<Arguments> streamOfArraysForTestPass() {
        return Stream.of(
                Arguments.of(new int[]{2, 6, 7, 9, 3}, new int[]{76, 55, 44, 32}
                        , new int[]{35, 4, 9, 37}));
    }

    private static Stream<Arguments> streamOfArraysForTestFail() {
        return Stream.of(
                Arguments.of(new int[]{2, 6, 9, 3}, new int[]{6, 55, 44, 32}
                        , new int[]{35, 4, 9, 3}));
    }


}
