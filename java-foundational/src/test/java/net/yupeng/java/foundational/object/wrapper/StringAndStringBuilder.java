package net.yupeng.java.foundational.object.wrapper;

/**
 * StringBuilder类就像一个可变长度的字符数组一样，内容和长度都是被改变。
 * 如果附加的字符超出可容纳的长度，则StringBuilder对象会自动增加长度以容纳被附加的字符
 *
 * append()方法总是添加这些字符串到已经存在的字符序列的最后，而insert()方法则将字符或字符串添加到指定的位置
 *
 * @author JamesYusling/yupeng 13596273436@163.com
 * @version 2022/5/29 20:52
 * @since JDK17
 */
public class StringAndStringBuilder {
    public static void main(String[] args) {
        String textString1 = new String("java");  // 在内存中为变量textString1分配内存空间         original 原件; 正本; 原稿; 原作
        String textString2 = textString1 + "c";          // 在内存中为变量textString2分配内存空间

        StringBuilder stringBuilder1 =  new StringBuilder("java"); // 在内存中为变量stringBuilder1分配内存空间
        StringBuilder stringBuilder2 = stringBuilder1.append("c"); //在原字符串后面追加字符’c‘
        System.out.println(textString1 + "  " + textString2 );
        System.out.println(stringBuilder1 + "  " + stringBuilder2 );
        StringBuilder stringBuilder3 = stringBuilder1.insert(0,"is "); //在原字符串后面追加字符’c‘
        System.out.println(stringBuilder1 + "  " + stringBuilder3 );
    }
}
