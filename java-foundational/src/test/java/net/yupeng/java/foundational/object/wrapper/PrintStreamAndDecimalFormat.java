package net.yupeng.java.foundational.object.wrapper;

import java.util.ArrayList;

/**
 * java.lang中的Number类及其子类，还介绍PrintStream和DecimalFormat类
 *
 * @author JamesYusling/yupeng 13596273436@163.com
 * @version 2022/4/26 15:22
 * @since JDK17
 */
public class PrintStreamAndDecimalFormat {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(0,17);
        int sum = (list.get(0)).intValue();
        int sum2 = list.get(0);
        System.out.println("sum="+sum);
        System.out.println("sum2="+sum2);



        int i =1012;
        System.out.format("变量i的值为：%d%n",i);


    }

}
