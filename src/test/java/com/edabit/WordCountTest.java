package com.edabit;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class WordCountTest {

    private static Stream<Arguments> getValuesForTests() {
        return Stream.of(
                Arguments.of("It's high noon", 3),
                Arguments.of("Is this easy mode", 4),
                Arguments.of("What an easy task, right", 5),
                Arguments.of("This is a test", 4),
                Arguments.of("Just an example here move along", 6),
                Arguments.of("How are you today?", 4));
    }

    @ParameterizedTest
    @MethodSource("getValuesForTests")
    void shouldReturnCountOfWords(String arg, int result) {
        //given
        //when
        //then
        assertThat(WordCount.countWords(arg), equalTo(result));
    }

}
