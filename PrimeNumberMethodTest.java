import static org.junit.Assert.*;
import org.junit.Test;

public class PrimeNumberMethodTest {

    @Test
    public void testIsPrimeWithPrimeNumber() {
        assertTrue(PrimeNumberMethod.isPrime(2));
        assertTrue(PrimeNumberMethod.isPrime(3));
        assertTrue(PrimeNumberMethod.isPrime(5));
        assertTrue(PrimeNumberMethod.isPrime(7));
        assertTrue(PrimeNumberMethod.isPrime(11));
    }

    @Test
    public void testIsPrimeWithNonPrimeNumber() {
        assertFalse(PrimeNumberMethod.isPrime(1));
        assertFalse(PrimeNumberMethod.isPrime(4));
        assertFalse(PrimeNumberMethod.isPrime(6));
        assertFalse(PrimeNumberMethod.isPrime(8));
        assertFalse(PrimeNumberMethod.isPrime(9));
    }

    @Test
    public void testIsPrimeWithNegativeNumber() {
        assertFalse(PrimeNumberMethod.isPrime(-2));
        assertFalse(PrimeNumberMethod.isPrime(-3));
        assertFalse(PrimeNumberMethod.isPrime(-5));
    }

    // Additional test cases can be added as needed.
}
