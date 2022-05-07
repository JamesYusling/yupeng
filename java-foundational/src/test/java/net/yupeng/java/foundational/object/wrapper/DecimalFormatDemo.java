package net.yupeng.java.foundational.object.wrapper;

import java.text.DecimalFormat;

/**
 * 自定义方法，根据参数传入的匹配模式，来格式化数据
 *
 * @author JamesYusling/yupeng 13596273436@163.com
 * @version 2022/5/8 0:13
 * @since JDK17
 */
public class DecimalFormatDemo {
    public static void main(String[] args) {
        customFormat("###,###.###",123456.789);  //输出结果为：123,456.789
        customFormat("###.##", 123456.789);    //输出结果为：123456.79
        customFormat("000000.000", 123.78);    //输出结果为：000123.780
        customFormat("￥###,###.###", 12345.67); //输出结果为：￥12,345.67


    }

    //自定义方法，根据参数传入的匹配模式，来格式化数据
    public static void customFormat(String pattern,double value){
        DecimalFormat myFormatter = new DecimalFormat(pattern);  //创建模式对象
        String output = myFormatter.format(value);      //格式化数据
        System.out.println(value + " " + pattern + " " +output);

    }
}
