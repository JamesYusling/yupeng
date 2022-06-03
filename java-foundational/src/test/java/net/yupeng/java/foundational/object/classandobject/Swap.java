package net.yupeng.java.foundational.object.classandobject;

/**
 * 形参与实参的关系示例
 *通过实参传递值给形参，形参交换值，打印实参，查看实参和形参的关系（无任何关系）
 *
 * @author JamesYusling/yupeng 13596273436@163.com
 * @version 2022/6/3 16:14
 * @since JDK17
 */
public class Swap {
    public static void main(String[] args) {
        int a = 5,b = 8; //声明变量a和b,并赋予初始值
        exchangeValues(a,b);
        System.out.println("交换后的值为：");
        System.out.println("a=" + a);
        System.out.println("b=" + b);

    }
    public static void exchangeValues(int value1,int value2){
        int temp = 0;   //声明一个中间变量
        temp = value1;  //交换第一步
        value1 = value2;    //交换第一步
        value2 = temp;  //交换第一步

    }
}
