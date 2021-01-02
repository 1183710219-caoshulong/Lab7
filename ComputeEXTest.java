package version3;

import static org.junit.Assert.*;

import org.junit.Test;

import version3.ComputeEX;

public class ComputeEXTest {

	@Test
	public void testResult() {
		assertEquals("7",ComputeEX.result("5", "2", "+"));
		assertEquals("-3",ComputeEX.result("-1", "2", "-"));
		assertEquals("190",ComputeEX.result("95", "2", "×"));
		assertEquals("3",ComputeEX.result("6.3", "2.1", "/"));
	}

	@Test
	public void testis_op1(){
		assertEquals(1,ComputeEX.is_op("+"));
	}

	@Test
	public void testis_op2(){
		assertEquals(2,ComputeEX.is_op("-"));
	}

	@Test
	public void testis_op3(){
		assertEquals(3,ComputeEX.is_op("×"));
		assertEquals(3,ComputeEX.is_op("*"));
	}

	@Test
	public void testis_op4(){
		assertEquals(4,ComputeEX.is_op("/"));
	}

	@Test
	public void testis_op_1(){
		assertEquals(-1,ComputeEX.is_op("="));
	}
}
