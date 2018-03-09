package joven_chano;

import static org.junit.Assert.*;

import org.junit.Test;

public class joven_chano_zubats {

	@Test
	public void test() {
		assertEquals(99000,chanete.calczub(1));
		assertEquals(90000,chanete.calczub(10));
		assertEquals(80000,chanete.calczub(20));
		assertEquals(70000,chanete.calczub(30));
		assertEquals(60000,chanete.calczub(40));
		assertEquals(50000,chanete.calczub(50));
		assertEquals(40000,chanete.calczub(60));
		assertEquals(30000,chanete.calczub(70));
		assertEquals(20000,chanete.calczub(80));
		assertEquals(10000,chanete.calczub(90));
		assertEquals(0,chanete.calczub(100));
	}

}
