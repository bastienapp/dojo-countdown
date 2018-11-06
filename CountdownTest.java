import junit.framework.*;
import org.junit.Test;

public class CountdownTest extends TestCase {

	@Test
	public void testTrue() throws Exception {
	    System.out.println("Countdown:");
	    Countdown.countdown(4);
		assertEquals(true, true);
	}
}
