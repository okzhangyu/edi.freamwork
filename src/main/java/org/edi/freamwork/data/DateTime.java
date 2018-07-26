package org.edi.freamwork.data;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * @author Fancy
 * @date 2018/7/26
 */
public class DateTime extends Date {
    /**
     * 日期格式，默认yyyy-MM-dd
     */
    public static String FORMAT_DATE = "yyyy-MM-dd";
    /**
     * 日期时间格式，默认yyyy-MM-dd'T'HH:mm:ss
     */
    public static String FORMAT_DATETIME = "yyyy-MM-dd'T'HH:mm:ss";

    /**
     * 转换值
     *
     * @param value
     *            日期值
     * @return 日期
     */
    public static DateTime valueOf(long value) {
        return new DateTime(value);
    }

    /**
     * 转换值
     *
     * @param value
     *            日期
     * @return 日期
     */
    public static DateTime valueOf(Date value) {
        return new DateTime(value.getTime());
    }

    /**
     * 转换值
     *
     * @param value
     *            日期的字符串
     * @return 日期
     */
    public static DateTime valueOf(String value) {
        return valueOf(value, FORMAT_DATE);
    }

    /**
     * 转换值
     *
     * @param value
     *            日期字符串
     * @param format
     *            字符串格式
     * @return 日期
     */
    public static DateTime valueOf(String value, String format) {
        try {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat(format);
            Date dateValue = simpleDateFormat.parse(value);
            return valueOf(dateValue.getTime());
        } catch (ParseException e) {
            return DateTime.MIN_VALUE;
        }
    }

    /**
     * 转换值（已处理月份）
     *
     * @param year
     *            年
     * @param month
     *            月
     * @param day
     *            日
     * @return
     */
    public static DateTime valueOf(int year, int month, int day) {
        Calendar calendar = Calendar.getInstance();
        calendar.clear();
        calendar.set(year, month - 1, day);
        return valueOf(calendar.getTimeInMillis());
    }


    /**
     * 最小日期
     */
    public static final DateTime MIN_VALUE = valueOf(1900, 1, 1);

    /**
     * 最大日期
     */
    public static final DateTime MAX_VALUE = valueOf(2099, 12, 31);

    /**
     * 当前时间
     */
    public static DateTime getNow() {
        return valueOf(Calendar.getInstance().getTimeInMillis());
    }

    /**
     * 当天
     */
    public static DateTime getToday() {
        Calendar calendar = Calendar.getInstance();
        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH);
        int day = calendar.get(Calendar.DAY_OF_MONTH);
        calendar.clear();
        calendar.set(year, month, day, 0, 0, 0);
        return valueOf(calendar.getTimeInMillis());
    }

    public DateTime() {
        super();
    }

    public DateTime(long date) {
        super(date);
    }
}
