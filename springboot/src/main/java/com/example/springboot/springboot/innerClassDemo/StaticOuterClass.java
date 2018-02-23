package com.example.springboot.springboot.innerClassDemo;

import org.apache.log4j.Logger;

//静态内部类
public class StaticOuterClass {
    public static void main(String[] args) {
        //产生innerclass对象
        StaticOuterClass.MemberInnerClass memberInnerClass = new StaticOuterClass.MemberInnerClass();
        memberInnerClass.getInfo();
    }
    //年龄
    private Integer age = 20;
    //姓名
    private String name = "张三";
    //行别
    private String sex = "女";

    private static int num1 = 20;

    public void outerShow(){
        System.out.println(MemberInnerClass.num1);
    }

    static class MemberInnerClass{
        private static int num1 = 100;
        //姓名
        private String name = "李四";
        //年龄
        private Integer age = 18;
        //行别
        private String sex = "男";
        public void getInfo(){
            System.out.println(StaticOuterClass.num1);
            System.out.println(name);
        }
    }
}
