package com.example.springboot.springboot.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

public class AnnotationTest {
    public static void main(String[] args) {
        //@AnnotationDemo1(name = "123",age = 10,val = {"aa"},co = Color.RED)
        int num = 10;
    }
    @AnnotationDemo1(name = "123",age = 10,val = {"aa"},co = Color.RED)
    public void te(){}
}

//该注解要保留到什么时候
@Retention(RetentionPolicy.RUNTIME)
//作用域
@Target({ElementType.METHOD,ElementType.TYPE})
@interface AnnotationDemo1{
    String name() default "as";
    int age();
    String[] val();
    Color co();
}

enum Color{
    RED,YELLO
}