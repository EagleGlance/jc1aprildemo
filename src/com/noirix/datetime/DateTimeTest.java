package com.noirix.datetime;

import java.sql.Timestamp;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

public class DateTimeTest {
    public static void main(String[] args) {

        int b = 1;

        System.out.println(b++ == ++b);


        String s1 = "sdfsd";
        String s2 = "sdfsd";

        System.out.println(s1 == s2);

        Date date = new Date();
        System.out.println(date);
        System.out.println(date.getTime());


        //milliseconds from Jan 1 1970

        Long currentMillis = 1655541386443L;

        java.sql.Date date1 = new java.sql.Date(currentMillis);
        System.out.println(date1);

        Timestamp timestamp = new Timestamp(date.getTime());
        System.out.println(timestamp);

        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar.getCalendarType());
        System.out.println(calendar.getTime());
        System.out.println(calendar.getFirstDayOfWeek());

        int weekYear = calendar.getWeekYear();
        System.out.println(weekYear);

        LocalDate localDate = LocalDate.now();
        System.out.println(localDate.getYear());
        System.out.println(localDate.getMonth());
        System.out.println(localDate.getDayOfMonth());
        System.out.println(localDate.getEra());
        System.out.println(localDate.minusDays(18));
        System.out.println(localDate.minusWeeks(18));
        System.out.println(localDate.minusMonths(18));
        System.out.println(localDate.minusYears(18));


        char c = (char) 1;

        System.out.println(c);

        LocalDate localDate1 = localDate
                .minusDays(10)
                .plusDays(10)
                .minusWeeks(10);

        Month month = LocalDate.parse("12-10-2020", DateTimeFormatter.ofPattern("dd-MM-yyyy")).getMonth();
        System.out.println(month);
        System.out.println(localDate.isLeapYear());

        LocalTime time = LocalTime.now();
        System.out.println(time);
        System.out.println(time.plusHours(10));

    }

    public static short process() {
        int b = 1;

        System.out.println(b++ == ++b);

        return  1;


    }
}
