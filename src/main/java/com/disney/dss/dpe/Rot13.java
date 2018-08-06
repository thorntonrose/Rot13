package com.disney.dss.dpe;

import java.util.*;

public class Rot13 {
	public static String rot(String text) {
		StringBuilder rotted = new StringBuilder();

		for (int i = 0; i < text.length(); i ++) {
			rotted.append(rot(text.charAt(i)));
		}

		return rotted.toString();
	}

	public static char rot(char c) {
		if ((c >= 'A' && c <= 'M') || (c >= 'a' && c <= 'm')) {
			return (char) (c + 13);
		}

		if ((c >= 'N' && c <= 'Z') || (c >= 'n' && c <= 'z')) {
			return (char) (c - 13);
		}

		return c;
	}
}