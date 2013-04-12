package com.joragupra.codepuzzler;

/**
 * @author jagudo
 * @since 12.04.13
 */
public class IsbnChecker {

	private static final int ASCII_ZERO_VALUE = 48;

	public boolean checkIsbn(String isbnString) {
		if (isbnString.length() !=13 ) {
			return false;
		}
		if (!isNumericString(isbnString)) {
			return false;
		}
		char[] buffer = isbnString.toCharArray();
		int checkDigit = buffer[12] - ASCII_ZERO_VALUE;
		int i = 0;
		int sum = 0 ;
		while (i<12) {
			sum += buffer[i++] - ASCII_ZERO_VALUE;
			sum += (buffer[i++] - ASCII_ZERO_VALUE) * 3;
		}
		int calculatedCheckDigit = (10 - sum%10)%10;
		return (checkDigit == calculatedCheckDigit);
	}

	private boolean isNumericString(String s) {
		for (int i=0; i<s.length(); i++) {
			if (!isNumericChar(s.charAt(i))) {
				return false;
			}
		}
		return true;
	}

	private boolean isNumericChar(char c) {
		if (c != '0' && c != '1' && c != '2' && c != '3' && c != '4' && c != '5' && c != '6' && c != '7' && c != '8' && c != '9') {
			return false;
		}
		return true;
	}
}
