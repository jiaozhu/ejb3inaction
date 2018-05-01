package io.predictech.ejb3inaction.ejb;

import javax.ejb.Singleton;
import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 * @author Weijie Zhao
 * @email tttx(at)me.com
 * @date 2018/5/1
 * @description
 */
@Singleton(name = "TimeOfDayBean", mappedName = "TimeOfDayBean")
public class TimeOfDayBean implements TimeOfDay {
    private static final String DATE_TIME = "yyyy-MM-dd HH:mm:ss";

    public String timeOfDay() {
        Calendar calendar = Calendar.getInstance();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(DATE_TIME);
        return simpleDateFormat.format(calendar.getTime());
    }
}
