package net.yupeng.java.foundational.object;

import javax.swing.*;

/**
 * 打印九九乘法表
 *
 * @author JamesYusling/yupeng 13596273436@163.com
 * @version 2022/4/25 0:48
 * @since JDK17
 */
public class MultiTable {
    public static void main(String[] args) {

        for (int i = 1; i < 10; i++) {
            for (int j = 1; j <=i; j++) {
                System.out.print(j+"*"+i+"="+i*j);
                if (i*j<10){
                    System.out.print("  ");
                }else{
                    System.out.print(" ");
                }

            }
            System.out.println(" ");
        }

    }

}
