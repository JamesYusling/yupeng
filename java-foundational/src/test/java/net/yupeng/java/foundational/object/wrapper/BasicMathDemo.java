package net.yupeng.java.foundational.object.wrapper;

/**
 * 基本Math方法
 *
 * @author JamesYusling/yupeng 13596273436@163.com
 * @version 2022/5/8 0:29
 * @since JDK17
 */
public class BasicMathDemo {
    public static void main(String[] args) {
        double a = -191.635;
        double b =41.94;
        int c = 27,d=65;
        System.out.printf("%.3f的绝对值是%.3f%n",a,Math.abs(a));     // -191.635的绝对值是191.635    绝对值

        System.out.printf("比%.2f大的最小整数是%.0f%n", b, Math.ceil(b));       //比41.94大的最小整数是42  向上取整

        System.out.printf("比%.2f小的最大整数是%.0f%n", b, Math.floor(b));      //比41.94小的最大整数是41 向下取整

        System.out.printf("最接近%.2f的整数是%.0f%n", b, Math.rint(b));        //最接近41.94的整数是42  四舍五入

        System.out.printf("%d和%d中的最大值是%d%n",c, d, Math.max(c, d));      //27和65中的最大值是65

        System.out.printf("%d和%d中的最小值是%d%n",c, d, Math.min(c, d));      //27和65中的最小值是27

        int e =Math.min(c,d);
        System.out.println(e);


    }
}
