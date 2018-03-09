package joven_chano;

import static org.junit.Assert.*;

import org.junit.Test;

public class joven_chano_meta {

	@Test
	public void test() {
		assertEquals(990,chanete.calcmeta(1));
		assertEquals(900,chanete.calcmeta(10));
		assertEquals(800,chanete.calcmeta(20));
		assertEquals(700,chanete.calcmeta(30));
		assertEquals(600,chanete.calcmeta(40));
		assertEquals(500,chanete.calcmeta(50));
		assertEquals(400,chanete.calcmeta(60));
		assertEquals(300,chanete.calcmeta(70));
		assertEquals(200,chanete.calcmeta(80));
		assertEquals(100,chanete.calcmeta(90));
		assertEquals(0,chanete.calcmeta(100));
	}

}
