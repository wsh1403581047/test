package com.example.springboot.springboot.innerClassDemo;


//成员内部类实现多继承
public class InnerClassExtendsDemo {
    public static void main(String[] args) {
       C c = new C();
       c.new AA().showA();
       c.new BB().showB();
    }
}

class A{
    public void A1(){
        System.out.println("这是A类的A方法");
    }
}

class B{
    public void B1(){
        System.out.println("这是B类的B方法");
    }
}

class C{
    public class AA extends A{
        public void showA(){
            super.A1();
        }
    }
    public class BB extends B{
        public void showB(){
            super.B1();
        }
    }
}
