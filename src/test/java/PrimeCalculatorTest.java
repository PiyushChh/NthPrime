import org.assertj.core.api.ThrowableAssert;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatExceptionOfType;

public class PrimeCalculatorTest {
    private final PrimeCalculator primeCalculator = new PrimeCalculator();

    @Test
    public void testFirstPrime() {
        int  expected = 2;

        int actual = primeCalculator.nth(1);

        assertThat(actual).isEqualTo( expected);
    }

    @Test
    public void testSecondPrime() {
        int expected = 3;

        int actual = primeCalculator.nth(2);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void testSixthPrime() {
        assertThat(primeCalculator.nth(6)).isEqualTo(13);
    }

    @Test
    public void testBigPrime() {

        int expected = 104743;

        int actual = primeCalculator.nth(10001);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void testUndefinedPrime() {
        Class<IllegalArgumentException> expectedException = IllegalArgumentException.class;

        ThrowableAssert.ThrowingCallable actualException = () -> primeCalculator.nth(0);

        assertThatExceptionOfType(expectedException)
                .isThrownBy(actualException);
    }
}

