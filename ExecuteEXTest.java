package version3;

import static org.junit.Assert.*;

import org.junit.Test;

import version3.ExecuteEX;

public class ExecuteEXTest {

	@Test
	public void testResult() {
		assertEquals("7",ExecuteEX.result("1+3+3"));
		assertEquals("7",ExecuteEX.result("1+3+6-3"));
		assertEquals("7",ExecuteEX.result("1+3×2"));
		assertEquals("7",ExecuteEX.result("56/2×5/20"));
		assertEquals("7",ExecuteEX.result("1+3×3-6/2"));
		assertEquals("7",ExecuteEX.result("1-3×2+24/2"));
		assertEquals("-3",ExecuteEX.result("1+5-2×6+15/5"));
	}

}
