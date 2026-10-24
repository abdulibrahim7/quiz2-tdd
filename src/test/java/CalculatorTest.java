import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    private final Calculator calculator = new Calculator();

    @Test
    void sumAddsPositiveNumbers() {
        assertEquals(5, calculator.sum(2, 3));
    }

    @Test
    void sumHandlesNegativeNumbers() {
        assertEquals(-5, calculator.sum(-2, -3));
    }

    @Test
    void sumHandlesZero() {
        assertEquals(7, calculator.sum(0, 7));
    }
    @Test
    void multiplyHandlesPositiveNumbers() {
        assertEquals(12, calculator.multiply(3, 4));
    }

    @Test
    void multiplyHandlesZero() {
        assertEquals(0, calculator.multiply(5, 0));
    }

    @Test
    void multiplyHandlesNegativeNumbers() {
        assertEquals(-12, calculator.multiply(-3, 4));
    }
    @Test
    void divideReturnsQuotient() {
        assertEquals(4, calculator.divide(12, 3));
    }

    @Test
    void divideUsesIntegerDivision() {
        assertEquals(3, calculator.divide(7, 2));
    }

    @Test
    void divideHandlesNegativeNumbers() {
        assertEquals(-3, calculator.divide(-7, 2));
    }

    @Test
    void divideRejectsZeroDivisor() {
        assertThrows(ArithmeticException.class,
                () -> calculator.divide(5, 0));
    }
}