package com.example.springboot.springboot.innerClassDemo;

import org.apache.log4j.Logger;

//成员内部类
public class MemberOuterClass {
    public static void main(String[] args) {
        MemberOuterClass.MemberInnerClass memberInnerClass = new MemberOuterClass(). new MemberInnerClass();
        memberInnerClass.getInfo();
    }
    Logger logger = Logger.getLogger(MemberOuterClass.class);
    //年龄
    private Integer age = 20;
    //姓名
    private String name = "张三";
    //行别
    private String sex = "女";

    class MemberInnerClass{
        //姓名
        private String name = "李四";
        //年龄
        private Integer age = 18;
        //行别
        private String sex = "男";

        public void getInfo(){
            logger.info("外部类name:" + MemberOuterClass.this.name);
            logger.info("外部类age:" + MemberOuterClass.this.age);
            logger.info("外部类sex:" + MemberOuterClass.this.sex);
            logger.info("内部类name:" + name);
            logger.info("内部类age:" + age);
            logger.info("内部类sex:" + sex);
        }
    }

}


