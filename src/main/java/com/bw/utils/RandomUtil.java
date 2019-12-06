package com.bw.utils;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class RandomUtil {

	/**
	 * @Title: random
	 * @Description: ���� min - max ֮��������(���� min �� max ).
	 * @param min
	 * @param max
	 * @return
	 * @return: int
	 */
	public static int random(int min, int max) {
		Random random = new Random();
		return random.nextInt(max - min + 1) + min;
	}

	/**
	 * @Title: subRandom
	 * @Description: �� min - max ֮���ȡ len �����ظ��������.
	 * @param min
	 * @param max
	 * @param len
	 * @return
	 * @return: int[]
	 */
	public static int[] subRandom(int min, int max, int len) {
		int[] array = new int[len];
		Set<Integer> hashSet = new HashSet<Integer>();
		while (hashSet.size() != len) {
			hashSet.add(random(min, max));
		}
		int i = 0;
		for (Integer num : hashSet) {
			array[i] = num;
			i++;
		}
		return array;
	}

	/**
	 * @Title: randomCharacter
	 * @Description: ����һ��0-9, a-z, A-Z֮�������ַ�.
	 * @return
	 * @return: char
	 */
	public static char randomCharacter() {
		String str = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
		return str.charAt(random(0, str.length() - 1));
	}

	/**
	 * @Title: randomString
	 * @Description: ���� len ���ַ���, �����ڲ�Ҫ����randomCharacter()����.
	 * @param length
	 * @return
	 * @return: String
	 */
	public static String randomString(int len) {
		String str = "";
		for (int i = 0; i < len; i++) {
			str += randomCharacter();
		}
		return str;
	}
}
