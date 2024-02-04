package pro.sky.calculator2;

import org.junit.jupiter.api.Test;
import pro.sky.calculator2.exception.ZeroDivideException;
import pro.sky.calculator2.service.CalculatorServiceImpl;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculatorServiceImplTest {


    private final CalculatorServiceImpl out = new CalculatorServiceImpl();

    @Test
    public void shouldReturn3WhenSum1And2() {
        assertEquals(3, out.sum(1, 2));
    }

    @Test
    public void shouldReturn1WhenSubtract1And1() {
        assertEquals(0, out.subtract(1, 1));
    }

    @Test
    public void shouldReturn2WhenDivide2And1() {
        assertEquals(2, out.multiply(2, 1));
    }

    @Test
    public void shouldReturn2WhenMultiply1And2() {
        assertEquals(2, out.multiply(2, 1));
    }

    @Test
    public void shouldThrowZeroDividerExceptionWhenDivideAny2And0() {
        assertThrows(ZeroDivideException.class, () -> out.divide(2,0));
    }
}