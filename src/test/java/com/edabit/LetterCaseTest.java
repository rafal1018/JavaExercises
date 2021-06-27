package com.edabit;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Map;
import java.util.stream.Stream;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class LetterCaseTest {

    @ParameterizedTest
    @MethodSource("getValuesForTests")
    void shouldReturnMapWithUpperCaseLettersValues(String[] arg, Map<String, String> result) {

        //given
        //when
        //then
        assertThat(LetterCase.mapping(arg), equalTo(result));

    }

    private static Stream<Arguments> getValuesForTests() {
        return Stream.of(
                Arguments.of(new String[]{"x", "a", "v", "i", "e", "r"},
                        Map.of("x", "X", "a", "A",
                                "v", "V", "i", "I",
                                "e", "E", "r", "R")),
                Arguments.of(new String[]{"t", "e", "s", "h", "a"},
                        Map.of("t", "T", "e", "E",
                                "s", "S", "h", "H",
                                "a", "A")),
                Arguments.of(new String[]{"d", "x", "t", "s"},
                        Map.of("d", "D", "x", "X",
                                "t", "T", "s", "S")),
                Arguments.of(new String[]{"d", "t"},
                        Map.of("d", "D", "t", "T")),
                Arguments.of(new String[]{"t", "x"},
                        Map.of("t", "T", "x", "X")),
                Arguments.of(new String[]{"a", "b"},
                        Map.of("a", "A", "b", "B")));
    }

}
