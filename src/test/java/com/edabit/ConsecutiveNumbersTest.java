package com.edabit;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class ConsecutiveNumbersTest {

    @ParameterizedTest
    @MethodSource("streamOfArrays1")
    void shouldReturnTrue(int[] arg) {
        //given
        //when
        boolean result = ConsecutiveNumbers.cons(arg);

        //then
        assertThat(result, equalTo(true));
    }

    @ParameterizedTest
    @MethodSource("streamOfArrays2")
    void shouldReturnTrue2(int[] arg) {
        //given
        //when
        boolean result = ConsecutiveNumbers.cons(arg);

        //then
        assertThat(result, equalTo(false));
    }


    private static Stream<Arguments> streamOfArrays1() {
        return Stream.of(
                Arguments.of(new int[]{5, 1, 4, 3, 2}, new int[]{55, 59, 58, 56, 57},
                        new int[]{-3, -2, -1, 1, 0}));
    }

    private static Stream<Arguments> streamOfArrays2() {
        return Stream.of(
                Arguments.of(new int[]{5, 1, 4, 3, 2, 8}, new int[]{5, 6, 7, 8, 9, 9},
                        new int[]{-3, -2, -1, -1, 0}));
    }

}
