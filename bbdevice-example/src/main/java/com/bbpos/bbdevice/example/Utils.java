package com.bbpos.bbdevice.example;

public class Utils {
	protected static String encodeNdefFormat(String hexString) {
		String result = "";
		String length = Integer.toHexString(hexString.length() + 3);
		while (length.length() % 2 != 0) {
			length = "0" + length;
		}
		if (length.length() > 2) {
			return result;
		}
		result = "D101" + length + "54" + "02656E" + hexString; 
		return result;
	}
}
