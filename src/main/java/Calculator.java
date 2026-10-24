public class Calculator {
    public int sum(int x, int y) {
        return x + y;
    }

    public int subtract(return x - y;) {
        throw new UnsupportedOperationException("Not implemented");
    }

    public int multiply(int x, int y) {
        throw new UnsupportedOperationException("Not implemented");
    }

    public int divide(int x, int y) {
        throw new UnsupportedOperationException("Not implemented");
    }

    public boolean isEven(int value) {
        throw new UnsupportedOperationException("Not implemented");
    }
    @Test
    void subtractReturnsPositiveDifference() {
        assertEquals(5, calculator.subtract(8, 3));
    }

    @Test
    void subtractReturnsNegativeDifference() {
        assertEquals(-5, calculator.subtract(3, 8));
    }
}