package net.yupeng.java.foundational.object.wrapper;

import java.util.Calendar;
import java.util.Locale;

/**
 * 展示了可以使用format()进行的一些格式化。输出结果在代码嵌入的注释中用双引号显示
 *
 * @author JamesYusling/yupeng 13596273436@163.com
 * @version 2022/4/26 15:44
 * @since JDK17
 */
public class TestFormat {
    public static void main(String[] args) {
        long n =382112;
        System.out.format("%d%n" , n);      //输出结果：382112
        System.out.format("%08d%n" , n);     //输出结果：00382112
        System.out.format("%+8d%n", n);           //  输出结果为" +382112"
        System.out.format("%,8d%n", n);           //  输出结果为" 382,112"
        System.out.format("%+,8d%n%n", n);        //  输出结果为"+382,112"


        double pi =Math.PI;         //获取圆周率
        System.out.println(pi);     // 输出结果为：3.141592653589793
        System.out.format("%f%n", pi);            //  输出结果为"3.141593"
        System.out.format("%.3f%n", pi);          //  输出结果为"3.142"
        System.out.format("%10.3f%n", pi);        //  输出结果为"    3.142"
        System.out.format("%-10.3f%n", pi);       //  输出结果为"3.142"
        System.out.format(Locale.FRANCE,"%-10.4f%n%n",pi);      //
        System.out.format(Locale.FRANCE,          //  用法语表示
                                 "%-10.4f%n%n", pi);        //  输出结果为"3,1416"

        Calendar c =Calendar.getInstance();     //获取表示当前日期的对象
        System.out.println(c);
        System.out.format("%tB %te, %tY%n", c, c, c); //  输出结果为"五月 8, 2022"
        System.out.format("%tl:%tM %tp%n", c, c, c);  //  输出结果为"12:08 上午"
        System.out.format("%tD%n", c);            //  输出结果为"05/08/22"
    }
}
