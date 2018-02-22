package com.example.springboot.springboot.annotation;


import java.lang.annotation.*;

public class ReflectAnnotationDemo {
    public static void main(String[] args) throws Exception {
       Class<?> classType = AnnotationTest2.class;
        boolean b = classType.isAnnotationPresent(Description.class);
        if(b){
            Description des = classType.getAnnotation(Description.class);
            System.out.println("获取到了：" + des.value());
        }else System.out.println("没有获取到");
    }
}
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD,ElementType.METHOD})
@Documented
@interface Author{
    String name();
    String group();
}


@Retention(RetentionPolicy.RUNTIME)//想要通过反射获取注解信息必须设置RetentionPolicy.RUNTIME
@Target({ElementType.FIELD,ElementType.METHOD,ElementType.TYPE})
@Documented
@interface Description{
    String value() default "张山";
}

@Description("这是用来测试的类")
class AnnotationTest2{
    @Author(name = "wushihao",group = "com.wsh")
    public void test(){
        System.out.println("123");
    }
}
