package net.yupeng.java.foundational.object.wrapper;

/**
 * 使用StringBuilder对象实现输出一首回文诗
 *
 * @author JamesYusling/yupeng 13596273436@163.com
 * @version 2022/5/29 21:35
 * @since JDK17
 */
public class StringBuilderDemo {
    public static void main(String[] args) {
        String palindrome = "香莲碧水动风凉 水动风凉夏日长";   // palindrome 回文(正反读都一样的词语);
        StringBuilder sb = new StringBuilder(palindrome); //创建StringBuilder对象
        sb.reverse();                       //翻转字符串
        System.out.println(palindrome);     //输出原来的字符串内容
        System.out.println(sb);             //输出翻转以后的字符串内容

    }
}
