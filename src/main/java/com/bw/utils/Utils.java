package com.bw.utils;

import java.util.Calendar;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Utils {

	public static boolean isNumber(String str) {
		Pattern compile = Pattern.compile("^\\d*$");
		Matcher matcher = compile.matcher(str);
		return matcher.matches();
	}

	public static boolean hasText(String str) {
		String trim = str.trim();
		if (null != trim && !trim.equals(""))
			return true;
		return false;
	}

	public static boolean getAge(Date birthday) throws IllegalAccessException {
		Calendar instance = Calendar.getInstance();
		if (instance.before(birthday)) {
			throw new IllegalAccessException("The birthday id before Now.It's unbrlievable");
		}
		
		return false;
	}
	
	public static void main(String[] args) {
		Calendar instance = Calendar.getInstance();
		
		int i = instance.get(Calendar.WEDNESDAY);
		System.out.println(i);
		
	}
}
