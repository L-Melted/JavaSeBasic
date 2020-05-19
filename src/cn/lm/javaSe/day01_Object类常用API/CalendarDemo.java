package cn.lm.javaSe.day01_Object类常用API;


import java.util.Calendar;
import java.util.Date;

public class CalendarDemo {

    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();

        cal.set(Calendar.MONTH,6);
        int month = cal.get(Calendar.MONTH);
        cal.add(Calendar.YEAR, -3); // 减3年
        int year = cal.get(Calendar.YEAR);

        System.out.println("year = " + year + "\n"+"month = " + month);

        Date date = cal.getTime();
        System.out.println(date); // Tue Jan 16 16:03:09 CST 2018

    }




}
