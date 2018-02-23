package com.example.springboot.springboot.innerClassDemo;
//匿名内部类
public class AnonymousInnerClass {
    public static void main(String[] args) {
        AnonumousTest anonumousTest = new AnonumousTest();
        anonumousTest.feed(new MyInterface() {
            public void eat() {
                System.out.println("喂食");
            }
        });
    }
}

interface MyInterface{
    void eat();
}


class AnonumousTest{
    public void feed(MyInterface myInterface){
        myInterface.eat();
    }
}
