package com.disney.dss.dpe;

import org.junit.*;
import static org.junit.Assert.*;

public class Rot13Test {
	@Test
	public void testRot_Char() {
		char[][] data = new char[][] {
			new char[] { 'A', 'N' },
			new char[] { 'a', 'n' },
			new char[] { 'M', 'Z' },
			new char[] { 'm', 'z' }
		};

		for (char[] item : data) {
			assertEquals(item[0] + " => " + item[1] + ":", item[1], Rot13.rot(item[0]));
			assertEquals(item[1] + " => " + item[0] + ":", item[0], Rot13.rot(item[1]));
		}
	}
}