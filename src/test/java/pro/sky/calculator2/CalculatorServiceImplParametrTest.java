package pro.sky.calculator2;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import pro.sky.calculator2.service.CalculatorServiceImpl;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorServiceImplParametrTest {
    private final CalculatorServiceImpl out = new CalculatorServiceImpl();

    @MethodSource("provideArgumentForCalculatorTest")
    @ParameterizedTest
    public void shouldReturnCorrectResultOfSummation(Integer num1, Integer num2) {
        assertEquals(num1 + num2, out.sum(num1, num2));
    }

    @MethodSource("provideArgumentForCalculatorTest")
    @ParameterizedTest
    public void shouldReturnCorrectResultOfSubtraction(Integer num1, Integer num2) {
        assertEquals(num1 - num2, out.subtract(num1, num2));
    }

    @MethodSource("provideArgumentForCalculatorTest")
    @ParameterizedTest
    public void shouldReturnCorrectResultOfMultiplication(Integer num1, Integer num2) {
        assertEquals(num1 * num2, out.multiply(num1, num2));
    }

    @MethodSource("provideArgumentForCalculatorTest")
    @ParameterizedTest
    public void shouldReturnCorrectResultOfDivision(Integer num1, Integer num2) {
        assertEquals(num1 / num2, out.divide(num1, num2));
    }
    private static Stream<Arguments> provideArgumentForCalculatorTest() {
        return Stream.of(
                Arguments.of(0,1),
                Arguments.of(0,2),
                Arguments.of(1,1),
                Arguments.of(1,2),
                Arguments.of(2,2)
        );
    }
}