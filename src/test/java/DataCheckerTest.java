import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;
import static org.junit.jupiter.api.Assertions.*;

class DateCheckerTest {
    private final DateChecker checker = new DateChecker();

    @Test
    void januaryHas31Days() {
        assertTrue(checker.has31Days(Month.JANUARY),
                "January should have 31 days");
    }
    @ParameterizedTest
    @EnumSource(value = Month.class, names = {
            "APRIL", "JUNE", "SEPTEMBER", "NOVEMBER"
    })
    void thirtyDayMonthsReturnFalse(Month month) {
        assertFalse(checker.has31Days(month),
                month + " should not have 31 days");
    }

    @Test
    void februaryReturnsFalse() {
        assertFalse(checker.has31Days(Month.FEBRUARY),
                "February never has 31 days");
    }
    @ParameterizedTest
    @EnumSource(value = Month.class, names = {
            "JANUARY", "MARCH", "MAY", "JULY",
            "AUGUST", "OCTOBER", "DECEMBER"
    })
    void thirtyOneDayMonthsReturnTrue(Month month) {
        assertTrue(checker.has31Days(month),
                month + " should have 31 days");
    }
    @Test
    void nullMonthThrowsException() {
        assertThrows(IllegalArgumentException.class,
                () -> checker.has31Days(null),
                "A null month should be rejected");
    }
}