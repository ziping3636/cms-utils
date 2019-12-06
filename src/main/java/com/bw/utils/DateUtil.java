package com.bw.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateUtil {

	/**
	 * @Title: getEarly
	 * @Description: TODO����ָ���·ݵ��³�
	 * @param date
	 * @return
	 * @return: Date
	 */
	public static Date getEarly(Date date) {
		// ��ȡ�ĵ�ǰϵͳ��ʱ���������
		Calendar instance = Calendar.getInstance();
		// �ô�������ڳ�ʼ��������
		instance.setTime(date);
		// �����·ݵ���Ϊ 1
		instance.set(Calendar.DAY_OF_MONTH, 1);
		instance.set(Calendar.HOUR_OF_DAY, 0);
		instance.set(Calendar.MINUTE, 0);
		instance.set(Calendar.SECOND, 0);
		return instance.getTime();
	}

	/**
	 * @Title: getMonthEnd
	 * @Description: TODO����ָ���·ݵ���ĩ
	 * @param date
	 * @return
	 * @return: Date
	 */
	public static Date getMonthEnd(Date date) {
		Calendar instance = Calendar.getInstance();
		// �ô�������ڳ�ʼ��������
		instance.setTime(date);
		// ��ǰ�·� +1
		instance.add(Calendar.MONTH, 1);
		// ���ڱ�Ϊ�¸����³�
		Date early = getEarly(instance.getTime());
		// ���³��ٴγ�ʼ��������
		instance.setTime(early);
		// ���ڵ����� -1
		instance.add(Calendar.SECOND, -1);
		return instance.getTime();
	}

	/**
	 * @Title: random
	 * @Description: TODO����ĳһ��ʱ��ε��������
	 * @param startDate
	 * @param endDate
	 * @return
	 * @return: Date
	 */
	public static Date random(Date startDate, Date endDate) {
		long endTime = endDate.getTime();
		long startTime = startDate.getTime();
		long ultimateTime = (long) (Math.random() * (endTime - startTime + 1) + startTime);

		return new Date(ultimateTime);
	}

	/**
	 * @Title: getAge
	 * @Description: TODO���ݻ�õ����վ�ȷ��������
	 * @param birthday
	 * @return
	 * @return: int
	 */
	public static int getAge(Date birthday) {
		Calendar instance = Calendar.getInstance();
		int yearNow = instance.get(Calendar.YEAR);
		int monthNow = instance.get(Calendar.MONTH);
		int dayOfMonthNow = instance.get(Calendar.DAY_OF_MONTH);
		instance.setTime(birthday);
		int yearBirth = instance.get(Calendar.YEAR);
		int monthBirth = instance.get(Calendar.MONTH);
		int dayOfMonthBirth = instance.get(Calendar.DAY_OF_MONTH);
		int age = yearNow - yearBirth;
		if (monthNow < monthBirth) {
			age--;
		}
		if (dayOfMonthNow < dayOfMonthBirth) {
			age--;
		}
		return age;
	}

}
