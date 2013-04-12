package com.joragupra.codepuzzler;

import junit.framework.TestCase;

/**
 * @author jagudo
 * @since 12.04.13
 */
public class IsbnCheckerTest extends TestCase {

	public void testValidIsbn() {
		String isbnString = "9788481812275";
		assertTrue(new IsbnChecker().checkIsbn(isbnString));
	}

	public void testInvalidIsbn() {
		String isbnString = "9788481812276";
		assertFalse(new IsbnChecker().checkIsbn(isbnString));
	}
}
