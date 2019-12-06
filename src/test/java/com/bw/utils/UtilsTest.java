package com.bw.utils;

import static org.junit.Assert.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import org.junit.Test;

public class UtilsTest {

	@Test
	public void testIsNumber() {
		boolean number = Utils.isNumber("12435");
		System.out.println(number);
		boolean number2 = Utils.isNumber("asg4");
		System.out.println(number2);
	}

	@Test
	public void testHasText() {
		boolean hasText = Utils.hasText("");
		System.out.println(hasText);
		boolean hasText2 = Utils.hasText(" ");
		System.out.println(hasText2);
		boolean hasText3 = Utils.hasText(" df ");
		System.out.println(hasText3);
	}

	@Test
	public void testGetAge() throws IllegalAccessException, ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		String day = "1996-06-03";
		Utils.getAge(sdf.parse(day));
	}

}
