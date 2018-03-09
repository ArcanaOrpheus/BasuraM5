package joven_chano;

import static org.junit.Assert.*;

import org.junit.Test;

public class joven_chano_bellsprouts {

	@Test
	public void test() {
		assertEquals(9900,chanete.calcbell(1));
		assertEquals(9000,chanete.calcbell(10));
		assertEquals(8000,chanete.calcbell(20));
		assertEquals(7000,chanete.calcbell(30));
		assertEquals(6000,chanete.calcbell(40));
		assertEquals(5000,chanete.calcbell(50));
		assertEquals(4000,chanete.calcbell(60));
		assertEquals(3000,chanete.calcbell(70));
		assertEquals(2000,chanete.calcbell(80));
		assertEquals(1000,chanete.calcbell(90));
		assertEquals(0,chanete.calcbell(100));
	}

}
