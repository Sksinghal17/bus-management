package org.example.utils;

import java.util.Calendar;
import java.util.Date;

public class CommonUtils {

  public static Date addTime(Date date, int hours) {
    Calendar calendar = Calendar.getInstance();
    calendar.setTime(date);
    calendar.add(Calendar.HOUR_OF_DAY, hours);

    return calendar.getTime();
  }

}
