package by.mjc.module1.util;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StringUtilsTest {

    @ParameterizedTest
    @MethodSource("provideParametersWithResult")
    void isPositiveNumberTest(String str, boolean expectedResult) {
        assertEquals(expectedResult, StringUtils.isPositiveNumber(str));
    }

    private static Stream<Arguments> provideParametersWithResult() {
        return Stream.of(
                Arguments.of("22222222222222222222222222222222222222222222222222222222222222222222222222222222" +
                        "2222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222" +
                        "2222222222222222", true),
                Arguments.of("-22222222222222222222222222222222222222222222222222222222222222222222222222222222" +
                        "2222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222" +
                        "2222222222222222", false),
                Arguments.of(null, false),
                Arguments.of("0.1", true),
                Arguments.of("234", true),
                Arguments.of("123", true),
                Arguments.of("+123", false),
                Arguments.of("1", true),
                Arguments.of("123.123", true),
                Arguments.of("", false),
                Arguments.of("-123", false),
                Arguments.of("--123", false),
                Arguments.of("-123.21", false),
                Arguments.of("asdadasdqeE", false),
                Arguments.of("123as", false),
                Arguments.of("0", false),
                Arguments.of("+0", false),
                Arguments.of("-0", false),
                Arguments.of("09", true),
                Arguments.of("-09", false),
                Arguments.of("0xF", false)
        );
    }
}