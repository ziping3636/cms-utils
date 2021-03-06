package com.bw.utils;

import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringUtil {

	/**
	 * @Title: hasLength
	 * @Description: �ж�Դ�ַ����Ƿ���ֵ, ������(�հ��ַ���)Ҳ��ûֵ
	 * @param src
	 * @return
	 * @return: boolean
	 */
	public static boolean hasLength(String src) {
		return src != null && src.length() > 0;
	}

	/**
	 * @Title: hasText
	 * @Description: �ж�Դ�ַ����Ƿ���ֵ, ������(�հ��ַ���)�Ϳո�Ҳ��ûֵ
	 * @param src
	 * @return
	 * @return: boolean
	 */
	public static boolean hasText(String src) {
		return src != null && src.trim().length() > 0;
	}

	/**
	 * @Title: randomChineseString
	 * @Description: �������һ�����ĺ���
	 * @return
	 * @return: String
	 */
	public static String randomChineseString() {
		String str = null;
		int highPos, lowPos;
		Random random = new Random();
		highPos = (176 + Math.abs(random.nextInt(40)));
		lowPos = (161 + Math.abs(random.nextInt(95)));
		byte[] byteArr = new byte[2];

		byteArr[0] = (new Integer(highPos)).byteValue();
		byteArr[1] = (new Integer(lowPos)).byteValue();

		try {
			str = new String(byteArr, "GB2312");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return str;
	}

	/**
	 * @Title: randomChineseString
	 * @Description: ���ز���len�����ĺ����ַ�, �ַ���������GB2312(�൱�����ļ���)��Χ��, ����"��ѽ��"
	 * @param len
	 * @return
	 * @return: String
	 */
	public static String randomChineseString(int len) {
		String str = "";
		for (int i = 0; i < len; i++) {
			str += randomChineseString();
		}
		return str;
	}

	/**
	 * @Title: generaterChineseName
	 * @Description: TODO������������
	 * @return
	 * @return: String
	 */
	public static String generaterChineseName() {
		String[] str = { "��", "Ǯ", "��", "��", "��", "��", "֣", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��",
				"��", "��", "��", "ʩ", "��", "��", "��", "��", "��", "��", "κ", "��", "��", "��", "л", "��", "��", "��", "ˮ", "�", "��",
				"��", "��", "��", "��", "��", "��", "��", "��", "³", "Τ", "��", "��", "��", "��", "��", "��", "��", "��", "Ԭ", "��", "ۺ",
				"��", "ʷ", "��", "��", "��", "�", "Ѧ", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��",
				"ʱ", "��", "Ƥ", "��", "��", "��", "��", "��", "Ԫ", "��", "��", "��", "ƽ", "��", "��", "��", "��", "��", "Ҧ", "��", "տ",
				"��", "��", "ë", "��", "��", "��", "��", "��", "�", "��", "��", "��", "��", "̸", "��", "é", "��", "��", "��", "��", "��",
				"��", "ף", "��", "��", "��", "��", "��", "��", "ϯ", "��", "��", "ǿ", "��", "·", "¦", "Σ", "��", "ͯ", "��", "��", "÷",
				"ʢ", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "֧", "��", "��", "��",
				"¬", "Ī", "��", "��", "��", "��", "��", "��", "Ӧ", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��",
				"ʯ", "��", "��", "ť", "��", "��", "��", "��", "��", "��", "½", "��", "��", "��", "��", "�", "��", "��", "�L", "��", "��",
				"��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "ɽ", "��", "��",
				"��", "�", "��", "ȫ", "ۭ", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "б", "��", "��", "��", "��",
				"��", "��", "��", "ղ", "��", "��", "Ҷ", "��", "˾", "��", "۬", "��", "��", "��", "ӡ", "��", "��", "��", "��", "ۢ", "��",
				"��", "��", "��", "��", "��", "׿", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "˫", "��", "ݷ", "��", "��",
				"̷", "��", "��", "��", "��", "��", "��", "��", "Ƚ", "��", "۪", "Ӻ", "�S", "�", "ɣ", "��", "�", "ţ", "��", "ͨ", "��",
				"��", "��", "��", "ۣ", "��", "��", "ũ", "��", "��", "ׯ", "��", "��", "��", "��", "��", "Ľ", "��", "��", "ϰ", "��", "��",
				"��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��",
				"��", "��", "»", "��", "��", "ŷ", "�", "��", "��", "ε", "Խ", "��", "¡", "ʦ", "��", "��", "��", "��", "��", "��", "��",
				"��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "ɳ", "ؿ", "��", "��", "��", "��", "��", "��", "��", "��", "��",
				"��", "��", "��", "��", "��", "Ȩ", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "۳", "Ϳ", "��", "��", "˧",
				"��", "��", "��", "��", "��", "��", "��", "Ĳ", "��", "٦", "��", "��", "ī", "��", "��", "��", "��", "��", "��", "١",
				"��ٹ", "˾��", "�Ϲ�", "ŷ��", "�ĺ�", "���", "����", "����", "����", "�ʸ�", "ξ��", "����", "�̨", "��ұ", "����", "���", "����",
				"����", "̫��", "����", "����", "����", "��ԯ", "���", "����", "����", "����", "Ľ��", "����", "����", "˾ͽ", "˾��", "آ��", "˾��",
				"��", "��", "�ӳ�", "���", "��ľ", "����", "����", "���", "����", "����", "����", "�ذ�", "�й�", "�׸�", "����", "�θ�", "����",
				"����", "����", "����", "��", "��", "����", "΢��", "����", "����", "����", "����", "�Ϲ�" };
		String firstName = str[RandomUtil.random(0, str.length - 1)];
		String lastName = randomChineseString(RandomUtil.random(1, 2));
		return firstName + lastName;
	}

	/**
	 * @Title: isNumber
	 * @Description: TODO�ж������Ƿ�������
	 * @param str
	 * @return
	 * @return: boolean
	 */
	public static boolean isNumber(String str) {
		String regex = "^(-)?[0-9]+(.[0-9]+)?$";
		return str.matches(regex);
	}

	/**
	 * @Title: getPlaceHolderValue
	 * @Description: TODO���ݴ����ֵ src �� �������ʽ regex ���л�ȡ��src�е�Ŀ�괮
	 * @param src
	 * @param regex
	 * @return
	 * @return: String
	 */
	public static String getPlaceHolderValue(String src, String regex) {
		Pattern compile = Pattern.compile(regex);
		Matcher matcher = compile.matcher(src);
		if (matcher.find()) {
			return matcher.group();
		}
		return null;
	}

	/**
	 * @Title: isPhoneNumber
	 * @Description: TODO��֤�ַ����ǲ��ǺϷ��ֻ��Ÿ�ʽ
	 * @param str
	 * @return
	 * @return: boolean
	 */
	public static boolean isPhoneNumber(String str) {
		if (hasText(str)) {
			String regex = "1[3|4|5|6|7|8|9]\\d{9}";
			return str.matches(regex);
		}
		return false;
	}

	/**
	 * @Title: isEmai 
	 * @Description: TODO��֤�ַ����ǲ��ǺϷ������ַ��ʽ
	 * @param str
	 * @return
	 * @return: boolean
	 */
	public static boolean isEmail(String str) {
		if (hasText(str)) {
			String regex = "[A-z0-9_]+\\@[A-z0-9]+\\.[A-z]+";
			return str.matches(regex);
		}
		return false;
	}
}
