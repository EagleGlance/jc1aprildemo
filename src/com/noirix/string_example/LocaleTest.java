package com.noirix.string_example;

import java.text.DateFormat;
import java.text.NumberFormat;
import java.util.Date;
import java.util.Locale;

public class LocaleTest {
    public static void main(String[] args) {
        Locale us = new Locale("en", "US");
        Locale canadaFrench = Locale.CANADA_FRENCH;
        Locale by = new Locale("by", "BY");
        Locale france = Locale.FRANCE;
        Locale defaultLocale = Locale.getDefault();

        int[] testNumbers = {100, 1000, 10000, 100000000};
        float[] testFloatNumbers = {100.1F, 1000.1F, 10000.1F, 100000000.1F};

        System.out.println(by.getLanguage());
        System.out.println(by.getCountry());
        System.out.println(by.getDisplayCountry());

        System.out.println(us.getLanguage());
        System.out.println(us.getCountry());
        System.out.println(us.getDisplayCountry());

        NumberFormat instance = NumberFormat.getInstance(Locale.FRANCE);
        for (float testNumber : testFloatNumbers) {
            System.out.println(instance.format(testNumber));
        }

        NumberFormat currencyInstance = NumberFormat.getCurrencyInstance(Locale.SIMPLIFIED_CHINESE);
        for (float testNumber : testFloatNumbers) {
            System.out.println(currencyInstance.format(testNumber));
        }

        DateFormat dateInstance = DateFormat.getDateInstance(DateFormat.FULL, Locale.getDefault());
        System.out.println(dateInstance.format(new Date()));

        String title = LocalizedMessageProvider.getMessage("title", Locale.getDefault().getLanguage(), Locale.getDefault().getCountry());
        System.out.println(title);
    }
}
