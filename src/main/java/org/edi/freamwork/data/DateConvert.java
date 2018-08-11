package org.edi.freamwork.data;

import org.edi.freamwork.data.operation.OpResultCode;
import org.edi.freamwork.data.operation.OpResultDescription;

import javax.management.openmbean.OpenDataException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author Fancy
 * @date 2018/8/9
 */
public class DateConvert {

    public static final String CONVERT_DATA_IS_EMPTY= "日期转换对象为空";

    public static Date toDate(String date) throws ParseException{
        DateFormat fmt =new SimpleDateFormat("yyyy-MM-dd");
        return fmt.parse(date);
    }

}
