package com.paul.javaweb.book.utils;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class DateHelper {
    public static String getCurDate() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date date = new Date();
        return simpleDateFormat.format(date);
    }
    public static String getFormatDateString(Date date){
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        return simpleDateFormat.format(date);

    }
    /**
     * 获取倒计时
     * String []rrule={"不重复","按周重复","按月重复","按年重复"};
     * */
    public static int getDifferDay(Date date) {
        String str_date=getFormatDateString(date);
        Calendar a = Calendar.getInstance(),
                b = Calendar.getInstance();
        String[] splitdate = str_date.split("-");
        b.set(Integer.parseInt(splitdate[0]), Integer.parseInt(splitdate[1]) - 1, Integer.parseInt(splitdate[2]));
        long diffDays = (a.getTimeInMillis() - b.getTimeInMillis())
                / (1000 * 60 * 60 * 24);
        return (int)diffDays;
    }

    /**
     * 获取两个日期差值
     * */
    public static int getDifferDay(Date date,Date goalDate){
        String old_date=getFormatDateString(date);
        String goal_date=getFormatDateString(goalDate);
        Calendar a = Calendar.getInstance(),
                b = Calendar.getInstance();
        String[] splitdate = old_date.split("-");
        String[] splitGoalDate=goal_date.split("-");
        a.set(Integer.parseInt(splitdate[0]), Integer.parseInt(splitdate[1]) - 1, Integer.parseInt(splitdate[2]));
        b.set(Integer.parseInt(splitGoalDate[0]), Integer.parseInt(splitGoalDate[1]) - 1, Integer.parseInt(splitGoalDate[2]));
        long diffDays = (b.getTimeInMillis() - a.getTimeInMillis())
                / (1000 * 60 * 60 * 24);
        System.out.println("结果:"+diffDays);
        return (int)diffDays;
    }
}
