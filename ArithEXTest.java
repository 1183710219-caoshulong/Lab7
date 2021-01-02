package version3;

import static org.junit.Assert.*;

import org.junit.Test;

import version3.ArithEX;

public class ArithEXTest {
	
	@Test
	public void testAdd() {
		assertTrue(ArithEX.add(3,3)==6);
		assertTrue(ArithEX.add(9.3,3.5)==12.8);
		assertTrue(ArithEX.add(-3.2,6.5)==3.30);
		assertTrue(ArithEX.add(-9.3,-3.5)==-12.8);
	}
	
	@Test
	public void testSub() {
		assertTrue(ArithEX.sub(9,3)==6);
		assertTrue(ArithEX.sub(9.3,3.5)==5.8);
		assertTrue(ArithEX.sub(3.5,3.7)==-0.2);
		assertTrue(ArithEX.sub(-3.5,-3.7)==0.2);
	}
	
	@Test
	public void testMul() {
		assertTrue(ArithEX.mul(9,3)==27);
		assertTrue(ArithEX.mul(9.3,3.5)==32.55);
		assertTrue(ArithEX.mul(3.5,-3.7)==-12.95);
		assertTrue(ArithEX.mul(-3.5,-3.7)==12.95);
	}
	
	@Test
	public void testdiv() {
		assertTrue(ArithEX.div(9, 3)==3);
		assertTrue(ArithEX.div(9.5, 0.5)==19);
		assertTrue(ArithEX.div(9.5, -0.5)==-19);
		assertTrue(ArithEX.div(-9.5, 0.5)==-19);
		assertTrue(ArithEX.div(-9.5, -0.5)==19);
	}
}