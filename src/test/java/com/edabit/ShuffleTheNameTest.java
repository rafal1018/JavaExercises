package com.edabit;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class ShuffleTheNameTest {

    private static Stream<Arguments> getArgsAndResultsForsTests() {
        return Stream.of(
                Arguments.of("Donald Trump", "Trump Donald"),
                Arguments.of("Rosie O'Donnel", "O'Donnel Rosie"),
                Arguments.of("Seymour Butts", "Butts Seymour"),
                Arguments.of("Ebony Greene", "Greene Ebony"),
                Arguments.of("Allison Gonzalez", "Gonzalez Allison"),
                Arguments.of("Albert Frazier", "Frazier Albert"),
                Arguments.of("Eloise Hopkins", "Hopkins Eloise")
        );
    }

    @ParameterizedTest
    @MethodSource("getArgsAndResultsForsTests")
    void shouldShuffleTheName(String arg, String result) {
        //given
        //when
        //then
        assertThat(ShuffleTheName.nameShuffle(arg), equalTo(result));
    }

}
