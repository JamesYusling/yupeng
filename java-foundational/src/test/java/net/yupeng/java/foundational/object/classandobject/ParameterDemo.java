package net.yupeng.java.foundational.object.classandobject;

/**
 * 编写一个类，定义一个成员方法getMaxValue,返回两个参数中较大的值
 *
 * 在下面的参数中， a,b称为“实参”，而getMaxVlue后面参数列表中的参数value1和value2称为“形参”
 *
 * @author JamesYusling/yupeng 13596273436@163.com
 * @version 2022/6/3 15:57
 * @since JDK17
 */
public class ParameterDemo {
    public static void main(String[] args) {
        int a = 5,b = 8; //声明变量a和b,并赋予初始值
        int max;        //声明变量max
        max= getMaxVlue(a,b);
        System.out.println("最大值是：" + max);

    }
    public static int getMaxVlue(int value1,int value2){
        if(value1 > value2){
            return value1;
        }else{
            return value2;
        }

    }

}

