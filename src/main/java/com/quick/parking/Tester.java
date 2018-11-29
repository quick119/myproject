package com.quick.parking;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class Tester {
    public static void main(String[] args) {
        //日期處理：1、2、日期字串互轉3、
        //java8：instant類別(當下時間)
        //joda Date：第三方函式庫
        //java8
        Instant instant = Instant.now();
        System.out.println(instant);    //寫國際化的案子用instant
        LocalDateTime localDateTime
                = LocalDateTime.now();
        System.out.println(localDateTime);
        System.out.println(localDateTime.plus(ChronoUnit.HOURS.getDuration()));
        DateTimeFormatter formatter =
                DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        System.out.println(formatter.format(localDateTime));
        //practice juDate
//        practiceJuDate();
    }
    private static void practiceJuDate() {
        Date date = new Date();
        System.out.println(date);
        //1970/1/1到現在的毫秒數，
        SimpleDateFormat sdf =
                new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        System.out.println(date.getTime());
        Calendar calendar = Calendar.getInstance();
        System.out.println(sdf.format(calendar.getTime()));
        calendar.add(calendar.HOUR_OF_DAY,1);
        System.out.println(sdf.format(calendar.getTime()));
        String other = "2018/11/23 08:00:00";
        try {
            Date dd = sdf.parse(other);
            System.out.println(dd);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
