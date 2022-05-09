package net.yupeng.java.foundational.object.wrapper;

/**
 * 操作字符串方法示例
 *
 * @author JamesYusling/yupeng 13596273436@163.com
 * @version 2022/5/10 0:18
 * @since JDK17
 */
public class StringMethods {
    public static void main(String[] args) {
        String originaString = "hello,my name is Peng,I am 18 years! ";
        System.out.println("原始字符串为：\""+ originaString + "\"");
        String [] splitString = originaString.split(","); //使用逗号拆分字符串
        System.out.print("按逗号(,)分隔以后的字符串数组元素为：");
        for (int i = 0; i < splitString.length; i++) {
            //循环输出拆分后的字符串中的元素
            System.out.print("[" + splitString[i] + "]");
        }
        System.out.println( );

        String [] splitString2 = originaString.split("m"); //使用m拆分字符串
        System.out.print("按m分隔以后的字符串数组元素为：");
        for (int i = 0; i < splitString2.length; i++) {
            //循环输出拆分后的字符串中的元素
            System.out.print("[" + splitString2[i] + "]");
        }
        System.out.println( );

        System.out.print("原始字符从第2个到第5个的字符序列为：");
        /**
         * 根据JDK的文档，String.subSequence只是为了实现CharSequence接口上的同名方法而放在那里的，其行为与String.subString一样。看看源码，实际上也是这样的：
         * JDK 1.6.0_05 写道
         * public CharSequence subSequence(int beginIndex, int endIndex) {
         *     return this.substring(beginIndex, endIndex);
         * }
         *
         * 返回类型不一样，subString返回的是String，subSequence返回的是实现了CharSequence接口的类，也就是说使用subSequence得到的结果，
         * 只能使用CharSequence接口中的方法。不过在String类中已经重写了subSequence，调用subSequence方法，可以直接下转为String对象。
         * */
        System.out.println("\""+ originaString.subSequence(2,6) + "\"");  //输出子字符串
        System.out.println("\""+ originaString.substring(2,6) + "\"");

        System.out.print("原始字符串转换为大写字符以后：");
        System.out.println("\"" + originaString.toUpperCase()+ "\"");
        System.out.print("原始字符串转换为小写字符以后：");
        System.out.println("\"" + originaString.toLowerCase()+ "\"");
    }

}
