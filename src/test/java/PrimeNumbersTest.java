import org.junit.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class PrimeNumbersTest {


    /**
     * Implement PrimeNumbers Class
     */
    @Test
    public void should_return_first_30_prime_numbers() throws Exception {
        PrimeNumbers primeNumbers = new PrimeNumbers();
        List<Integer> actualPrimeNumbers = primeNumbers.calculate(30);
        assertThat(actualPrimeNumbers).containsExactly(2, 3, 5, 7, 11, 13, 17, 19, 23, 29);
    }

    /**
     * Add a UT which throws an IllegalArgumentException when argument is less than 2
     */
    @Test
    public void should_throws_an_illegalArgumentException_when_argument_is_less_than_2() {
        PrimeNumbers primeNumbers = new PrimeNumbers();
        assertThrows(RuntimeException.class, () -> {
            primeNumbers.calculate(1);
        });

    }


    /**
     Add a UT which throws an NullPointerException when argument is NULL
     */

    @Test
    public void should_throws_an_nullPointerException_when_argument_is_null() {
        PrimeNumbers primeNumbers = new PrimeNumbers();
        assertThrows(NullPointerException.class, () -> {
            primeNumbers.calculate(null);
        });

    }

}
