package com.bw.utils;

import static org.junit.Assert.*;

import java.util.UUID;

import org.junit.Test;

public class StringUtilTest2 {

	@Test
	public void testReplace() {
		String uuid = UUID.randomUUID().toString();
		System.out.println(uuid);
		String replace = StringUtil.replace(uuid, "-", "");
		System.out.println(replace);
	}

}
