package net.yupeng.java.foundational.object.classandobject;

/**
 * 类之间的消息传递，方法调用
 *
 * @author JamesYusling/yupeng 13596273436@163.com
 * @version 2022/6/3 14:36
 * @since JDK17
 */
public class PassMessageDemo {
    public static void main(String[] args) {
        Hello hello = new Hello();
        hello.sayHello();   //调用对象hello的sayHello方法
        hello.sayHello();   //调用对象hello的sayHello方法
        hello.sayHello();   //调用对象hello的sayHello方法

    }


}

class  Hello {
    //定义一个表示问候的成员方法
    void sayHello(){
        System.out.println("Hello,good morning!");
    }
}