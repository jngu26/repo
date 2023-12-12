import static org.junit.Assert.*;
import org.junit.Test;
package test;

public class StringTest {

	public class PrimeNumberMethodTest {

	}

	@Test
    public void testLength() {
        String str = "Hello, World!";
        assertEquals(13, str.length());
    }

    @Test
    public void testCharAt() {
        String str = "Hello, World!";
        assertEquals('e', str.charAt(1));
    }

    @Test
    public void testSubstring() {
        String str = "Hello, World!";
        assertEquals("lo, W", str.substring(3, 8));
    }

    @Test
    public void testIndexOf() {
        String str = "Hello, World!";
        assertEquals(7, str.indexOf(","));
    }
}
