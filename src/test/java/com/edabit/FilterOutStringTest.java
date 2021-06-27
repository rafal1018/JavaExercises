package com.edabit;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class FilterOutStringTest {

    @ParameterizedTest
    @MethodSource("getArgumentsAndResultsForTests")
    void shouldFilterIntegersFromArrayOfString(String[] arg, String[] result) {
        //given
        //when
        //then
        assertThat(FilterOutStrings.filterArray(arg), equalTo(result));

    }

    private static Stream<Arguments> getArgumentsAndResultsForTests() {
        return Stream.of(Arguments.of(new String[]{"1", "2", "a", "b"}, new String[]{"1", "2"}),
                Arguments.of(new String[]{"1", "a", "b", "0", "15"}, new String[]{"1", "0", "15"}),
                Arguments.of(new String[]{"1", "2", "aasf", "1", "123", "123"}, new String[]{"1", "2", "123"}),
                Arguments.of(new String[]{"4", "z", "f", "5"}, new String[]{"4", "5"}),
                Arguments.of(new String[]{"abc", "123"}, new String[]{"123"}),
                Arguments.of(new String[]{"w", "r", "u", "43", "s", "a", "76", "d", "88"}, new String[]{"43", "76", "88"}));
    }

}
