package com.chinasoft.demo1;

import java.util.Date;

public class Test {
    public static void main(String[] args) {
        String s1 = " a  b  c ";
        String s2 = s1.trim();
        System.out.println(s2);
        System.out.println("----------------");

        //获取默认时间
        Date date = new Date();
        System.out.println(date);
        //获取当前时间的毫秒值
        long l = date.getTime();
        System.out.println(l);
    }
}
