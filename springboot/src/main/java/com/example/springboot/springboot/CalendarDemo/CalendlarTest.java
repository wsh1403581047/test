package com.example.springboot.springboot.CalendarDemo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Calendar;

public class CalendlarTest {
    public static void main(String[] args) {
        Logger logger = LoggerFactory.getLogger(CalendlarTest.class);
        Calendar calendar = Calendar.getInstance();
        //获取年
        Integer year = calendar.get(Calendar.YEAR);
        logger.info("当前年：{}",year);
        //获取月
        Integer month = calendar.get(Calendar.MONTH);
        logger.info("当前月份：{}",month+1);
        //获取星期
        Integer week = calendar.get(Calendar.WEEK_OF_MONTH);
        logger.info("当前星期：{}",week);
        //小时（24小时制）
        Integer hour = calendar.get(Calendar.HOUR_OF_DAY);
        logger.info("当前小时：{}",hour);
        //分钟
        Integer min = calendar.get(Calendar.MINUTE);
        logger.info("当前小时：{}",min);
        //秒
        Integer second =calendar.get(Calendar.SECOND);
        logger.info("当前秒：{}",second);
    }
}
