package com.edabit;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class PrimeNumbersTest {

    private static Stream<Arguments> getTestValuesForPrimeNumbers() {
        return Stream.of(
                Arguments.of(new int[]{20, 8},
                        new int[]{30, 10},
                        new int[]{100, 25},
                        new int[]{200, 46},
                        new int[]{100, 168},
                        new int[]{-5, 0},
                        new int[]{66, 18},
                        new int[]{133, 32},
                        new int[]{99, 25}));
    }

    @ParameterizedTest
    @MethodSource("getTestValuesForPrimeNumbers")
    void shouldReturnNumberOfPrimeNumbers(int[] args) {
        //given
        //when
        int result = PrimeNumbers.primeNumbers(args[0]);

        //then
        assertThat(result, equalTo(args[1]));

    }

}
