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
}